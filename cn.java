package inter1;

import java.util.Scanner;

public class cn {

	public static void main(String[] args) {
		/*int length =35, breadth = 345;
		 //if(length<=345 && breadth <= 345)
		if(length==breadth){
			 System.out.println("this is a squre :");
			 
		 }
		 else
		 {
			 System.out.println("It is not squre :");
		 }
		// TODO Auto-generated method stub
		/* int a,b;
		 	System.out.println("Enter the 1st Number :");
			Scanner t =new Scanner(System.in);
			a=t.nextInt();                          
			b=t.nextInt();
			if(a>b) {
			   System.out.println("  A is a greatest  "+a);
			}
			
			else
			{
				 System.out.println("  B is a greatest : "+b);
			}*/
		                 // MARKS OF SCHOOL STUDENT 
		/*int m;
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
		}*/
		                // Nested if-else
		/*
		int n1 , n2 , n3;
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
		}*/
		
		   // 3 people user oldest , youngest 
		/*int aa,aa2,aa3;
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
		
		     // Student attendance
		/*float clas, att,per;
		Scanner oo = new Scanner(System.in);
		System.out.println("Enter the total class : ");
		clas=oo.nextInt();
		System.out.println("Enter the total attendance : ");
		att=oo.nextInt();
		per=(att*100)/clas;
		if(per>=75) {
			System.out.println("A Student will be allowed to sit in exam if his/her : ");
		}
		else {
			System.out.println("A Student will not be allowed to sit in exam if his/her : ");
			
		}*/
		
		//char x;
		//Scanner o1= new Scanner(System.in);
		/*System.out.println("Enter the vlaue of X : ");
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
		       // year is leap year
		int y;
		System.out.println("Enter the Year :");
		y=o1.nextInt();
		if(y%4==0 && y%100!=0||y%400==0)
		{
			System.out.println(y+" year is a leap Year");
		}
		else {
			System.out.println(y+" not year is a leap Year");
		}
		*/
		/*int d;
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
		}*/
		           //  student Medical case yes no 
		
		
		/*int month;
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
		}*/
		          // PROGRAM FOR LOOP
		/*int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		/*int i1,sum=0;
		for(i1=1;i1<=10;i1++)
		{
			
			sum=sum+i1;
		}
		System.out.println(sum);
			}*/
		/*int nu,i,tb=0;
		System.out.println("Enter the no. of table : ");
		Scanner o6=new Scanner(System.in);
		nu=o6.nextInt();
		for(i=1;i<=10;i++) {

			tb=nu*i;
			System.out.print(nu+"*"+i+"=");
			System.out.println(tb);
		}*/
		/*int no,f=1,i,j=1;
		System.out.println("Enter the  N no. of Factorial : ");
		Scanner o7=new Scanner(System.in);
		no=o7.nextInt();
		for(i=no;i>=1;--i) {
		f=f*i;
		//j=J++;
		System.out.println(f+"*"+i+"="+f);
		//System.out.println(f);

			
		}
		System.out.println("Factorial N No.."+f);
		
	}*/
		/*
		      // FIBONACCI
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
		}*/
		
	/*int n4,v=0,v1=0,mul=1;
	System.out.println("Enter the  N no.: ");
	//Scanner o9=new Scanner(System.in);
	Scanner o9=new Scanner(System.in);
	n4=o9.nextInt();
	for(int i=0;i<=n4;i++) {
		
		for(int j=1;j<=i;j++) {
			v=n4%10; //3
			v1=n4/10;	
			v1=v1/10;
			mul=mul*v1;
			System.out.println(mul);
		}
		
		//System.out.print("(");
		
		  //System.out.print(")+");
	}*/
		
	  
		/*int no5, i,j;
		System.out.println("Enter the  N no.: ");
		//Scanner o9=new Scanner(System.in);
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
				
				//break;
				
			}
			System.out.println(" ");
		}*/
		/*int no5, i,j;
		System.out.println("Enter the  N no.: ");
		//Scanner o9=new Scanner(System.in);
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
				
				//break;
				
			}
			System.out.println("");
		}*/
		/*int no5, i,j;
		System.out.println("Enter the  N no.: ");
		//Scanner o9=new Scanner(System.in);
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print("* ");
				
				//break;
				
			}
			System.out.println(" ");
		}*/
	/*	int no5, i,j;
		System.out.println("Enter the  N no.: ");
		//Scanner o9=new Scanner(System.in);
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				
				//break;
				
			}
			System.out.println(" ");
		}*/
	/* int no5, i,j;
		System.out.println("Enter the  N no.: ");
		//Scanner o9=new Scanner(System.in);
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++)  //2
		
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print(i); 
				
				//break;
				
			}
			System.out.println(" ");
		}*/
		/*float sum=0, i,n;
		System.out.println("Enter the X no.");
		Scanner o0=new Scanner(System.in);
		n=o0.nextFloat();
		for(i=1;i<=n;i++) {
			sum=sum+(1/i);
		}
		System.out.println(sum);*/
		/*int no5, i,j;
		System.out.println("Enter the  N no.: ");
		//Scanner o9=new Scanner(System.in);
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
				
				//break;
				
			}
			System.out.println("");
		}*/
		
		
	}
}
