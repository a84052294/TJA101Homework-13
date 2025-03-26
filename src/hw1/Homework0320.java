package hw1;

public class Homework0320 {

	public static void main(String[] args) {
		
		//1
		int a = 12 , b = 6 ;
		System.out.println("1.a+b和："+(a+b)+"\n  a+b積："+(a*b)+"\n");
		
		//2
		int egg = 200 ;
		System.out.println("2."+(egg/12)+"打"+(egg%12)+"顆蛋\n");
		
		//3
		int sec = 256559;
//		//1d = 24hr ; 1hr = 60m ; 1m = 60s
//		int day = 24*60*60;
//		int hr = 60*60;
//		int minute = 60;
//		System.out.println("3."+sec+"秒="+(sec/day)+"天"+((sec%day)/hr)+"小時"
//				+(((sec%day)%hr)/minute)+"分"+(((sec%day)%hr)%minute)+"秒\n");
		int d=24 , h=60 , m=60 ;
		int day = sec/(d*h*m);//天
		sec %= d*h*m;
		int hr = sec/(h*m);//小時
		sec %= h*m;
		int minute = sec/m;//分
		sec %= m;//秒

		
		System.out.println("3."+day+"天"+hr+"小時"+minute+"分"+sec+"秒\n");
		
		//4
		final double pi = 3.1415;
		int r = 5;
		double circleArea = r * r * pi ;
		double circumference = (r + r) * pi ;
		System.out.println("4.圓面積："+circleArea+"\n  圓周長："+circumference+"\n");
		
		//5
		double deposit = 1_500_000;
		double rate = 0.02 ;
		deposit = deposit * Math.pow((1+rate),10);
		System.out.println("5.本利和共："+deposit+"\n");
		
		//6
		System.out.println("6.");
		System.out.println(5 + 5);//10 , 數值5+5=10
		System.out.println(5 + '5');//58 , 5 + 字元5的unicode編碼為0035，轉為10進位為53，故5+53相加為58
		System.out.println(5 + "5" );//55 , 後方的5為文字，故為文字串接
		
	}
}
