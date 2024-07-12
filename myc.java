package my;
import java.util.Scanner;
                        
public class myc {
//	int x, a= 10; // instance variable 
  //  static  double b=20.5;  // static variable

	public static void main(String[] args) {
		
		/* System.out.println(" Hello Java I'm Ravi Kumar.....");
      
    boolean c = true ; // local variable
     
   // myc sa =new myc();
      System.out.println(sa.a+" "+b+" "+c);
      System.out.println(b);
      System.out.println(c);
	} */
	/*int a,b,c; 
	
	//System.out.println("Enter the two no. ");
	//Scanner soo=new Scanner(System.in);
//	a=s.nextInt();
	//b=s.nextInt();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Nmbers ::");
	System.out.println("Enter second Nmbers::");


	a=sc.nextInt();
	b=sc.nextInt();
	
	c=a+b;
		 System.out.println("Two Nubers are Sum: " + c);
	System.out.println();*/
		
		                 //     PASSWORD USE FOR FORLOOP
		
	/*	int p=123,pwd, i=0;
		System.out.println("Enter password:=");
		Scanner ob=new Scanner(System.in);
		pwd=ob.nextInt();
		for(i=0;i<=pwd;) {
		if(pwd==p) {
			System.out.println("My name:= Ravi Kumar:");
			System.out.println("My roll no:=21");
			System.out.println("My mobile no:= 0000");
			System.out.println("My age:= 22");	
			break;
		}
		else {
			System.out.println("Wrong Password.....");
			System.out.println("Enter Correct Password!!");
		
		System.out.println("Enter password:=");
		pwd=ob.nextInt();
		i++;*/
		
		        // N NUMBER TABLE
		
	/*	int n,f=1,i;
		System.out.println("Enter the n No : ");
		Scanner o6=new Scanner(System.in);
		n=o6.nextInt();
		for(i=1;i<=n;i++) {
			f=f*1;
		}
		System.out.println("factorial of "+f);
		}*/
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
		int nu,i,tb=0;
		System.out.println("Enter the no. of table : ");
		Scanner o6=new Scanner(System.in);
		nu=o6.nextInt();
		for(i=1;i<=10;i++) {

			tb=nu*i;
			System.out.print(nu+"*"+i+"=");
			System.out.println(tb);
		}
		int i,num,term1=0 ,term2=1,nt;
		System.out.println("Enter the  N no. of Fibonacci : ");
		Scanner o8=new Scanner(System.in);
		num=o8.nextInt();
		System.out.println("Value of the Fibonacci Series : ");
		for(i=1;i<=num;++i) {
			System.out.println(term1);
			nt=term1+term2;
			term1=term2;
			term2=nt;
		}
	}		
  
}