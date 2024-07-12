package ifs;
import java.util.Scanner;

public class Medical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// name of months
		
		
		int month;
		System.out.println("Enter the no: ");
		Scanner o4= new Scanner(System.in);
		month=o4.nextInt();
		
		
		switch(month)
		{
		case 1:
		     System.out.println("1st month january :");
		     break;
		case 2:
		     System.out.println("2nd month February :");
		     break;
		case 3:
		     System.out.println("3nd month March :");
		     break;
	    case 4:
		  System.out.println("4th month April :");
		   break;
		case 5:
			 System.out.println("5th month May : ");
		     break;
	    case 6:
		     System.out.println("6th month June :");
			 break;
		case 7:
	          System.out.println("7th month July : ");
		      break;
		case 8:
		     System.out.println("8th month October : ");
		     break;
		case 9:
		     System.out.println("9th month September :");
		     break;
	    case 10:
		  System.out.println("1oth month October  :");
		   break;
		case 11:
			 System.out.println("11th month November : ");
		     break;
	    case 12:
		     System.out.println("12th month December :");
			 break;
		
	     default:
	     {
	    	 System.out.println("Your input rong....");
	    	 System.out.println("please, try Again!!");
	     }
		}

	}

}
