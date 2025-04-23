package hw4;

import java.util.Date;
import java.util.Scanner;

public class ShowDay {
	public static void main(String[] args) {
		ShowDay sd = new ShowDay();
		int[] d = sd.getDay();
		int[] md = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int td = 0;
			while(d[1] <= 0 || d[1] > 12 || d[2] <= 0 || ((d[0]%4 == 0 && d[1]==2 && d[2]>29 )&& d[2]>md[d[1]-1])) {
				System.out.println("日期有誤，請重新輸入：");
				d = sd.getDay();
			}
		
		for(int i = 0 ; i < d[1]-1 ; i++) {
			if(i==1 && d[0]%4 == 0) {
				td += 29;
			}
				td +=md[i];
		}
		td += d[2];
		
		System.out.println(d[0]+"年"+d[1]+"月"+d[2]+"日為第"+td+"天");
	}
	
	public int[] getDay() {
		Scanner sc = new Scanner(System.in);
		int[] inputDay = new int[3];
		System.out.println("請輸入三個數字（）yyyy/mm/dd：");
		for(int i = 0 ; i<inputDay.length ;i++) {
			inputDay[i] = sc.nextInt();
		}
		return inputDay;
	}
	
}
