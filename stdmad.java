package ifs;

import java.util.Scanner;

public class stdmad {
	public static void main(String[] args) {

//  student Medical case yes no
	char med;
	System.out.println("you are medical case Y or N ");
	Scanner o3= new Scanner(System.in);
	med=o3.next().charAt(0);
	switch(med) {
	case 'y':
	
		System.out.println("You are not allow to sit ");
        break;
	case 'n':
		System.out.println("You are not allow to sit ");
	     break;
	case 'Y':
		System.out.println(" yes You are  allow to sit ");
       break;
	case 'N':

		System.out.println("You are not allow to sit ");
	     break;
	   default:
	    	 System.out.println("Your input rong....");
	    	 System.out.println("please, try Again!!");
	}
}
}