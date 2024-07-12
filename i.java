package mthod;

import java.util.Scanner;

public class i {
	void gt() {
		int l,b;
		Scanner obj=new Scanner(System.in);
		System.out.println(" Enter the langth");
		l=obj.nextInt();
		System.out.println(" Enter the breath");
		b=obj.nextInt();
		if(l==b)
		{
			System.out.println("This is a Squer ...");
		}
		else
		{
			System.out.println("This is not quer");
		}
		}
  int tg() {
	  System.out.println("Java Project ::");
	  return(0);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i o=new i();
		o.gt();
		o.tg();

	}

}
