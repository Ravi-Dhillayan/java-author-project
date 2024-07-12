package inter1;

import java.util.Scanner;

public class Greatestis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter the two Number :");
		Scanner t =new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
		   System.out.println(" value of A & b\n "+a+" " +b);
		if(a>b) {
			System.out.println("Greatest of A : ");
		}
		else if(a<b){
			System.out.println("Greatest of B ");
		}
		else {
			System.out.println("A & B Equel ");
		}
	}

}
