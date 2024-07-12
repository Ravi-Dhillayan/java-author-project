package inter1;
import java.util.Scanner;

public class powe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int po=1,n, nu,i,j;
		System.out.println("Enter the 2 No. : ");
		Scanner o6=new Scanner(System.in);
		nu=o6.nextInt();
		n=o6.nextInt();
		for(i=1;i<=n;i++) {

			po=po*nu;
		}
  System.out.println(po);
	}

}
