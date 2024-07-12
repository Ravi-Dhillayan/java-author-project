package inter1;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		int no5, p,i,res=1,k;
		System.out.println("Enter the  N no.: ");
		
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		p=o0.nextInt();
		for(i=1;i<=p;i++) {
			res=res*no5;
		}
		System.out.println(res);
	}
}
