package scopee;
class X{
	void A() {
		{
			int a,b,c;
			a=12;
			b=123;
			c=a+b;
			System.out.println("sum of two Number : "+c);
			
		}
		//c=a+b; a,b,c variable  you are not Accessed because a,b,c variable under to { } using Scope 
		//System.out.println("sum of two Number : "+c); c variable is not access c error display to complier 

	}
}

public class sc1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t\t\t\t.........WELCOME..............");
		X o=new X();
		o.A();
		System.out.println(" End this program ;");
		
		
	
		
	}

}
