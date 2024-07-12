package ploymorhsm;

import java.util.Scanner;

class arr{
	void ar(){
		int i,s,f=1;
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		s=o.nextInt();
		
		int a[]=new int[s];
		
		for(i=0;i<s;i++) {
			a[i]=o.nextInt();
		}
		
		System.out.println("Printed Your Array :");
		for(i=0;i<s;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Your final array : ");
		for(i=0;i<s;i++) {
			for(int j=1;j<=a[i];j++) {
				f=f*j;
			}
			System.out.println(f);
			f=1;
		}
		
		
		
	}
	void ar(int x) {
		System.out.println("*************");
	}
}
class aa extends arr{
//	@Override
//	void ar()
	void aas() {
		System.out.println("************\n This is Overriding function :"
				+ "\n*************");
	}
}


public class Overridi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa oo = new aa();
		oo.ar();
//		oo.ar();
		

	}

}
