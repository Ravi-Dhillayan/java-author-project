package ifs;
import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x;
		Scanner o1= new Scanner(System.in);
		System.out.println("Enter the vlaue of X : ");
		x=o1.next().charAt(0);
		if(x>='a' && x<='z') {
			System.out.println(" User entered Character  lower case :");
		}
		else if(x>='A' && x<='Z'){
			System.out.println("Usser entered character uper case :");
		}
		else if(x>='0' && x<='9')
		{
			System.out.println("User Entered  positive decimal no.");
		}
		else if(x>=0 && x<=-9){
			System.out.println("User Entered negative decimal no.");
		}
		
		
		else {
			System.out.println("user entered spacial characters :");
		}

	}

}
