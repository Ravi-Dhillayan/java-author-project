package mthod;
import java.util.Scanner;
class tab{
	void tb() {
		int t=0,n,i;
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<=n;i++) {
			t=n*i;
			System.out.println("*"+i+" " );
			System.out.println(t);
		}
}
public class arr {
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tab ob =new tab();
       ob.tb();
	}

}
}
