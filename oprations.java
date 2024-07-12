package pack2;
import java.util.Scanner;

//import pack1.hello;

class add {
	int a,b,c;
	public
	void sum() {
		System.out.println("Enter the two Number : ");
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		b=o.nextInt();
		c=a+b;
		System.out.println("Sum of two Number : "+c);
	}
}
public class oprations {

	public static void main(String[] args) {
		add a_obj=new add();
		a_obj.sum();
		

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

}
