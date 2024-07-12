package ploymorhsm;

import java.util.Scanner;

class S{
	char op;
	void Sa() {
		do {
		int a,b;
		
		Scanner o=new Scanner(System.in);
		System.out.println("Ener the 1st No.  ");
		a=o.nextInt();
		System.out.println("Ener the 2st No.  ");
		b=o.nextInt();
		a+=b;
		b=a-b;
		a=a-b;
		System.out.println("Swiping No.  "+a+" "+b);
		System.out.println("You are try again Y/n");
		op=o.next().charAt(0);
	}while( op=='y'|| op=='Y');
}
}
class R extends S{
	void Sa() {
		System.out.println("Hii Ravi");
	}
}

public class ploym1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    R ob=new R();
    ob.Sa();
    S o=new S();
    o.Sa();
	}

}
