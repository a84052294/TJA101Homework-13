package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		
		//for-while
		
		System.out.println("for-while");
		
		for(int i = 1 ; i <= 9 ; i ++) {
			int j = 1;
			while( j <= 9 ) {
				System.out.print( j + "*" + i + "=" + ( i * j) + "\t");
				j++;
			}
			System.out.println();
		}
		
		//for-dowhile

		System.out.println("------------------------------------------------------");
		System.out.println("for-dowhile");
		
		for(int i = 1 ; i <= 9 ; i ++) {
			int j = 1;
			do {
				System.out.print( j + "*" + i + "=" + ( i * j) + "\t");
				j++;
			}while( j <= 9);
			System.out.println();
		}
		
		//while-dowhile
		
		System.out.println("------------------------------------------------------");
		System.out.println("while-dowhile");
		
		int i = 1 ;
		while(i <= 9) {
			int j = 1;
			do {
				System.out.print( j + "*" + i + "=" + ( i * j) + "\t");
				j++;
			}while( j <= 9);
			System.out.println();
			i++;
		}
	}
}
