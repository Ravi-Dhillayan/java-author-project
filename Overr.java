                                                /// Program for overriding
package ploymorhsm;
class Animals {
    void sound1() {
        System.out.println("Cat Sound ");
    }

    void sound() {
    	System.out.println("It is a Overloading : ");
    }
    void sound(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Animal Sound" + c);
    }
}

class Human extends Animals { // Use lowercase for class name
    void sound1() {
        System.out.println("It is a Man : ");
    }

    // Properly override the sound method
//    @Override
    void sound(int a, int b) {
        System.out.println("And Human is a man or Women");
    }
}

public class Overr {

    public static void main(String[] args) {
        Human ho = new Human();
        ho.sound1();
  
        ho.sound1();
        ho.sound(12, 1);
    }
}
