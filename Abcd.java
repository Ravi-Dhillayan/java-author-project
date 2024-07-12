package ploymorhsm;

import java.util.Scanner;

class A{
	void sound() {
		int a,b ,c;
		
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the 1st no..");
		a=o.nextInt();
		System.out.println("Enter the 2nd no..");
		b=o.nextInt();
		
				c=a+b;
		System.out.println("Sum ="+c);
	}
}
class B extends A{
	void sound(int a,int b) {
		int c;
		c=a-b;
		System.out.println("Substraction ="+c);
	}
}
class C extends B{
	void sound(int x,double y) {
		double z;
		z=x/y;
		System.out.println("Divison= "+z);
	}
}

public class Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C ob=new C();
	     ob.sound();
	    
	     ob.sound(10 ,21);
	     ob.sound(10 ,6.0);

     
    		 
	}

}
