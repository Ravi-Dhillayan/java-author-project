                         //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

package my;

import java.util.Scanner;

public class ldw {
	public static void main(String[] args) {
		System.out.println("Enter the reversed No.");
		int n,rev=0,rem;
		Scanner o=new Scanner(System.in);
		n=o.nextInt();//123
		while(n!=0) {
		rem=n%10;//5
		rev=rev*10+rem;
		n=n/10;//1234
		
		
	}
		System.out.println("Your reverse No. :"+rev);
	}
	

}
