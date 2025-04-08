package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int rd = (int)(Math.random()*101);
		System.out.println("猜數字（區間0~100):");
		GuessNumber guessNum = new GuessNumber();
		int gn = guessNum.inputNum();
		int[] guessArray = {0,rd,gn,100};
		while(guessArray[1] != guessArray[2]) {
			Arrays.sort(guessArray);
			int r = Arrays.binarySearch(guessArray,rd);
			int g = Arrays.binarySearch(guessArray,gn);
			if(r<g) {
				if(gn>guessArray[0]&&gn<guessArray[1]) {
					guessArray[0]=gn;
				}else {
				guessArray[3]=gn;
				}
				System.out.println("請猜數字（區間"+guessArray[0]+"~"+guessArray[3]+"):");
			}else {
				if(gn>guessArray[2]&&gn<guessArray[3]) {
					guessArray[3] = gn;
				}else {
				guessArray[0]=gn;
				}
				System.out.println("請猜數字（區間"+guessArray[0]+"~"+guessArray[3]+"):");
			}
			gn=guessNum.inputNum();
			guessArray[g]=gn;
		}
		System.out.println("猜對了！");
		}

	
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		return inputNum;
	}
}
