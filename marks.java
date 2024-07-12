package ifs;
import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // MARKS OF SCHOOL STUDENT
		
		int m;
		System.out.println("Enter the marks of student : ");
		Scanner mo = new Scanner (System.in);
		m =mo.nextInt();
		if( m<25) {
			System.out.println("grade : F");
		}
		else if(m>=25 && m<=45)
		{
			System.out.println("grade : E");
		}
		else if(m>=45 && m<=50)
		{
			System.out.println("grade : D");
		}
		else if(m>=50 && m<=60)
		{
			System.out.println("grade : C");
		}
		else if(m>=60 && m<=80)
		{
			System.out.println("grade : B");
		}
		
		else
		{
			System.out.println("Grade : A");
		}
	}

}
