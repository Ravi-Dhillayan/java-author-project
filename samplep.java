package polom;

import java.util.Scanner;

class A{
	private Scanner o;
	void add() {
		int a,b,c;
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the 1st no : ");
		a=o.nextInt();
		System.out.println("Enter the 2nd no : ");
		b=o.nextInt();
		c=a+b;
		System.out.println("sum ="+c);
	}
	void add(int x,int y) {
		o = new Scanner(System.in);
		System.out.println("Enter the 1st no : ");
		x=o.nextInt();
		System.out.println("Enter the 2nd no : ");
		y=o.nextInt();
		int c;
		c=x+y;
		System.out.println("sum of two no :"+c);
	}
	void add(int x, double y) {
		try (Scanner o = new Scanner(System.in)) {
			System.out.println("Enter the 1st no : ");
			x=o.nextInt();
			System.out.println("Enter the 2nd no : ");
			y=o.nextInt();
		}
		double c=x*y;
		System.out.println("multple of two no :"+c);
	}
}
 class B extends A{
	 void m() {
		 System.out.println(" your Welcome : ");
	 }
 }

public class samplep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	A obj=new A();
//		obj.add();
//		obj.add(12,12);
//		obj.add(12,2.2);
		B obj=new B();
		obj.m();
		obj.add();
		obj.add(12,12);
		obj.add(12,2.2);
		

	}

}
