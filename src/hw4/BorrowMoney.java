package hw4;

import java.util.Scanner;

public class BorrowMoney {
	public static void main(String[] args) {
		int[][] coWorker = {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
		int count = 0;
		System.out.println("請輸入預借金額：");
		BorrowMoney bm = new BorrowMoney();
		int nd = bm.getNeed();
		System.out.println("有錢可借的員工編號：");
		for(int i = 0 ; i<coWorker.length ; i++) {
				if(nd<=coWorker[i][1]) {
					System.out.print(coWorker[i][0]+" ");
					count++;
				}
			}
		
		System.out.print("，共"+count+"人");
	}
	public int getNeed(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
}
