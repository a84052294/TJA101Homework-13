package hw4;

public class Homework4 {
	public static void main(String[] args) {
		//一
		int add = 0;
		int[] a = {29 , 100 ,39 , 41 , 50 , 8 , 66 , 77 , 95 ,15};
		for(int i = 1 ; i < a.length ; i++) {
			add += a[i];
		}
		int avg = add / (a.length);
		System.out.println("平均值："+avg);
		System.out.print("大於平均值的元素：");
		for(int i = 1 ; i < a.length ; i++) {
			if(a[i] > avg)
				System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------------");
		
		//二
		String s = "Hello World";
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			System.out.print(s.charAt(i)); 
		}
		System.out.println("\n--------------------------------");
		
		//三
		String[] planets = {"mercury" , "earth" , "mars" , "jupiter" , "saturn" , "uranus" , "neptune"};
		int count = 0;
		for(int i = 0 ; i < planets.length ;i++) {
			for(int j = 0 ; j < planets[i].length(); j++) {
				switch (planets[i].charAt(j)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						count ++;
						break;
				}
			}
		}
		System.out.println("母音共："+count+"個");
		System.out.println("\n--------------------------------");
		
	}
}
