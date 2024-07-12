package inter1;
import java.util.Scanner;

public class Ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no5, i,j,k=0;
		System.out.println("Enter the  N no.: ");
		
		Scanner o0=new Scanner(System.in);
		no5=o0.nextInt();
		for(i=1;i<=5;i++,k=0)
		{
			for(j=1;j<=no5-i;++j)
			{
				System.out.print("  ");
				
				//break;
			}
			while(k!=2*i-1) {
			System.out.print(" *");
			++k;
		}
		

System.out.println();
}
	}

}
