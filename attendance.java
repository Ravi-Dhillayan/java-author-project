package ifs;
import java.util.Scanner;

public class attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Student attendance
				float clas, att,per;
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
					}
					

	}

}
