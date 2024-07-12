package my;

import java.util.Scanner;

class C{
	void nm() {
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}
class Be{
	void t() {
		int a ,b;
		Scanner o=new Scanner(System.in);
		
		
		System.out.println("Enter the 1st no.");
		a=o.nextInt();//10
				
		System.out.println("Enter the 2nd no.");
		b=o.nextInt();//20

		a=a+b;
		b=a-b;
		a=a-b;

		
		System.out.println("swiping no."+a+" "+b);
	}
}


public class Mtd {
		public static void main(String agrs[]) {
		Be o=new Be();
		//o.nm();
		o.t();
	
	}

}

