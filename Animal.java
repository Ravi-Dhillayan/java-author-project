package ploymorhsm;

import java.util.Scanner;


	


class mn{
	void sound() {
		// Write a Program to the addition of two matrices.
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int sum[][]=new int[2][2];
		int i,j;
		Scanner o=new Scanner(System.in);
		System.out.println("Enter 1st Matrice Elements : ");
		for( i=0;i<2;i++) {
			for( j=0;j<2;j++) {
				a[i][j]=o.nextInt();
				
				
			}
		}
		System.out.println("Enter the 2nd Matrice Elements : ");
		for( i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				b[i][j]=o.nextInt();
				
				
			}
		}
		System.out.println(" 1st Matrix :");
		for( i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println("\n ");
			
		}
		
		System.out.println(" 2nd Matrix :");
		for( i=0;i<2;i++) {
			for( j=0;j<2;j++) {
				System.out.print(b[i][j]+" ");
				
				
			}
			System.out.println("\n ");
			
		}
		System.out.println("Sum of Matrix :");
		for( i=0;i<2;i++) {
			for( j=0;j<2;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
				
				
			}
			System.out.println("\n ");
			
		}
		
		
		
	}

		void so() {
			System.out.println("sound for Animal : ");
		}
}
class Cat extends mn{
	void sound() {
		System.out.println("Sound for Cat ::");
	}
}
public class Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat obj=new Cat();
       obj.sound();
       mn ob=new mn();
       ob.sound();
       ob.so();
       Animal bo=new Animal();
       bo.sound();
       bo.Data();
	}
	void sound() {
		System.out.println("Animal sound");
		
	}
	void Data() {
		System.out.println("Data");
	}
	}

