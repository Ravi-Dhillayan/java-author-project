package ifs;
import java.util.Scanner;

public class young {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Nested if-else
		
		
		   // 3 people user oldest , youngest 
		int aa,aa2,aa3;
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the age 1st preson :");
		aa=o.nextInt();
		System.out.println("Enter the age 2nd  preson :");
		aa2=o.nextInt()                                      ;
		System.out.println("Enter the age 3nd preson :");
		aa3=o.nextInt();
		if(aa>aa2 && aa>aa3) {
			System.out.println("1st preson is oldest :");
		}
		else if(aa2>aa3) {
			System.out.println("2nd preson is oldest :");
		}
		else {
			System.out.println("3nd preson is oldest :");
		}
		if(aa<aa2 && aa<aa3) {
			System.out.println("1st preson is Youngest :");
		}
		else if(aa2<aa3) {
			System.out.println("2nd preson is Youngest :");
		}
		else {
			System.out.println("3nd preson is Youngest :");
		}
		
		   

	}

}
