package hw4;

import java.util.Arrays;

public class TestScore {
	public static void main(String[] args) {
		int[][] score = {{10,35,40,100,90,85,75,70},
						 {37,75,77,89,64,75,70,95},
						 {100,70,79,90,75,70,79,90},
						 {77,95,70,89,60,75,85,89},
						 {98,70,89,90,75,90,89,90},
						 {90,80,100,75,50,20,99,75}};
		int[] student = new int[8];

		for(int i = 0 ; i < 6 ; i++) {
			int[] a = Arrays.copyOf(score[i], 8);
			Arrays.sort(a);
			int highScore = a[7];
			for(int j = 0 ; j < score[i].length ;j++) {
				if(score[i][j]==highScore)
					student[j] += 1 ;
				}
			}
	
		System.out.println("各學生最高分次數：");
		for(int i = 0 ; i < student.length ; i++) {
			System.out.println(i+1+"號:"+student[i]+"次");
		}
	}
}
