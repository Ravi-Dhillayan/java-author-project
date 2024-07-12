package ifs;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
	int d;
	System.out.println("Enter the no: ");
	Scanner o2= new Scanner(System.in);
	d=o2.nextInt();
	
	
	switch(d)
	{
	case 1:
	     System.out.println("Day of sunday");
	     break;
	case 2:
	     System.out.println("Day of monday");
	     break;
	case 3:
	     System.out.println("Day of thusday");
	     break;
    case 4:
	  System.out.println("Day of wednesday");
	   break;
	case 5:
		 System.out.println("Day of thursday");
	     break;
    case 6:
	     System.out.println("Day of friday");
		 break;
	case 7:
          System.out.println("Day of staturday");
	      break;
     default:
     {
    	 System.out.println("Your input rong....");
     }
	}
}

}
