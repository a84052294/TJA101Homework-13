package hw3;

import java.util.Scanner;

public class LottoRandom {
	public static void main(String[] args) {
		System.out.println("請輸入不要的數字（1~9):");
		LottoRandom inputNum = new LottoRandom();
		int hn = inputNum.hateNum();
		int count = 0 ;
		for(int i = 1 ; i <= 49 ; i++ ) {
			if(i % 10 == hn || i / 10 == hn) {
				continue;
			}
			System.out.print(i +"、");
			count++;
		}
		System.out.println();
		System.out.println("共"+count+"個號碼");
	}
	
	public int hateNum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
}
