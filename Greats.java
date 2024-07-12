package ifs;
  
import java.util.Scanner;
public class Greats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Nested if-else
		
		int n1 , n2 , n3;
		System.out.println("Enter the 1st No.");
		System.out.println("Enter the 2nd  No.");
		System.out.println("Enter the 3nd No.");
		Scanner o5=new Scanner(System.in);
		n1=o5.nextInt();
		n2=o5.nextInt();
		n3=o5.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("n1 is a Greatest : "+n1);
			}
			else
			{
				System.out.println("n3 is a Greatest :" +n3);
			}
		}
		else {
			if(n2>n3) {
				System.out.println("n2 is a Greatest : "+n2);
				
			}
			else {
				System.out.println("n3 is a Greatest : "+n3);
			}
		}

	}

}
