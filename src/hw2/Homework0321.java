package hw2;

public class Homework0321 {
	
	public static void main(String[] args) {
		
		//1. 1~1000的偶數和
		System.out.println("1. 1～1000的偶數和：");
		int count1 = 0;
		for(int i = 1 ; i <= 1000 ; i += 2) {
			count1 += i;
		}
		System.out.println(count1 + "\n");
		
		//2. 1~10的連乘績（用for迴圈）
		int count2 = 1;
		System.out.println("2. 1～10的連乘績（用for迴圈）：");
		for(int i = 2 ; i <= 10 ; i ++){
			count2 *= i;
		}
		System.out.println(count2 + "\n");

		//3. 1~10的連乘績（用while迴圈）
		int count3 = 1;
		int i = 2;
		System.out.println("2. 1～10的連乘績（用while迴圈）：");
		while(i <= 10){
			count3 *= i;
			i++;
		}
		System.out.println(count3 + "\n");
		
		//4. 1 4 9 16 25 36 49 64 81 100
		System.out.println("4.");
		String str = "";
		for(int j = 1; j <= 10 ; j++) {
			int count4 ;
			count4 = j*j;
			str += count4 + " ";
		}
		System.out.println(str+"\n");

		//5. 樂透
		System.out.println("5. 樂透");
		int count5 = 0;
//		for(int tens = 0; tens < 4 ; tens ++) {
//			for(int singleDigit = 0; singleDigit <= 9 ;singleDigit++) {
//				if(tens == 0 && singleDigit ==0)continue;
//				if(singleDigit == 4)continue;
//				count5++;
//				System.out.print(tens+""+singleDigit+" ");
//			}
//			System.out.println();
//		}
		for(int lottoNumber = 1; lottoNumber < 50 ; lottoNumber++) {
			if(lottoNumber%10 == 4 || lottoNumber /10 == 4)continue;
			System.out.print(lottoNumber+" ");
			count5++;
		}
		System.out.println("\n共可選：" + count5 + "個號碼\n");
		
		//6.
		System.out.println("6.");
		for(int x = 10 ; x >= 0 ; x-- ) {
			for(int y = 1; y <= x ; y++ ) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		//7.
		System.out.println("\n7.");
		int uni = 65;
		char alphabet ;
		for(int x =1 ; x <=6 ; x++) {
			for(int y = 1 ; y <= x ; y++) {
				alphabet = (char)uni;
				System.out.print(alphabet);
			}
			uni ++;
			System.out.println();
		}
	}
}
