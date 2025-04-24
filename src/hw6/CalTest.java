package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cl = null;
		int x = 0;
		int y = 0;
		while(true) {
			System.out.println("請輸入x的值：");
			x = sc.nextInt();
			System.out.println("請輸入y的值：");
			y = sc.nextInt();
			
			try {
				cl = new Calculator(x,y);
				cl.powerXY(x, y);
				break;
			}catch(CalException e){
				System.out.println(e);
			}
		}
		sc.close();
	}
	
}
