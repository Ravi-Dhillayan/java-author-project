package inter1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int no,x,i,sum=0,rem;
		System.out.println("Enter the  N no.: ");
		
		Scanner o0=new Scanner(System.in);
		no=o0.nextInt();
		x=no;
	 {	
		while(x!=0) {
		rem=x%10;
		sum=sum+rem*rem*rem;
		x=x/10;
		}
		if(no==sum) {
			System.out.println(sum+"This is Armstrong No");
		}
		else {
			System.out.println("This is not Armstrong No");
		}
	}//p=o0.nextInt();*/
		
	}
}
