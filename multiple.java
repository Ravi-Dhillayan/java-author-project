package pack1;

//import pack1.hello;
import java.util.Scanner;

class A implements hello{
	int a,b,c;
	public
	void sum() {
		System.out.println("Enter the two Number : ");
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		b=o.nextInt();
		c=a*b;
		System.out.println("Multiple of two Number : "+c);
	}
}
public class multiple {
	public static void main(String[] args) {
		
A o=new A();
o.sum();
	}

}
