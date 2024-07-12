package ploymorhsm;
abstract  class Animal
{
	Animal(){
		System.out.println("All Animal ....");
		
	}
	abstract void sound();
}
class dog extends Animal{
	dog(){
		super();
	}
	public void sound() {
		System.out.println("Dog is Barking ..");
	}
}
class Lion extends Animal{
	Lion(){
		super();
		
	}
	public void sound() {
		System.out.println("Lion is Roar..");
	}
}
public class Animl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion ob=new Lion();
		ob.sound();
		dog obj=new dog();
		obj.sound();

	}

}
