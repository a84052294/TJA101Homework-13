package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class DetermineTriangle {
	public static void main(String[] args) {
//		System.out.println("請輸入3個數字：");
//		Scanner sc = new Scanner(System.in);
//		int[] bound = new int[3];
//		for(int i = 0 ; i < bound.length ; i++) {
//			bound[i] = sc.nextInt();
//		}
		DetermineTriangle dt = new DetermineTriangle();
		int[] side = dt.inputSide();
		Arrays.sort(side);
		if(side[0]+side[1]<=side[2]) {
			System.out.println("這不是三角形");
		}else if(Math.pow(side[0],2)+Math.pow(side[1],2) < Math.pow(side[2],2)) {
			System.out.println("鈍角三角形");
		}else if((Math.pow(side[0],2)+Math.pow(side[1], 2))==Math.pow(side[2], 2)){
			System.out.println("直角三角形");
		}else {
			if(side[0]==side[1]&&side[0]==side[2]) {
				System.out.println("正三角形");
			}else{
				System.out.println("銳角三角形");
			}
		}
	}
	
	public int[] inputSide() {
		System.out.println("請輸入3個數字：");
		Scanner sc = new Scanner(System.in);
		int[] side = new int[3];
		for(int i = 0 ; i < side.length ; i++) {
			side[i] = sc.nextInt();
		}
		return side;
	}
}
