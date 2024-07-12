package xyz;

import java.util.Scanner;

public class mularr {
	void gt() {
		long mul=1;
		int n,i,size;
		System.out.println("Enter the size of array");
		Scanner o= new Scanner(System.in);
		n=o.nextInt();
		
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		System.out.println("Printed Array Elements  : ");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		System.out.println("multiple Array Elements  : ");
		
		for(i=0;i<n;i++) {
				mul=mul*a[i];
			}
			System.out.println(mul);
			mul=1;
		}
	
	public static void main(String[] ar) {
		
	mularr o=new mularr();
	o.gt();
	}

}
