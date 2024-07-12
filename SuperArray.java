package arr;

import allpattern.Patterns;
import java.util.Scanner;

class A {
    int i, n, j, f = 1;
    int isf = 0;

    A() {
        System.out.println("*********WELCOME TO THE PROGRAM**********");
    }

    void show() {
        System.out.println("Enter the size of array : ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the value of array : ");
        for (i = 0; i < n; i++) {
            a[i] = o.nextInt();
        }
        for (i = 0; i < n; i++) {
            f = f * a[i];
        }
        System.out.println("Multiplication of array elements: " + f);
    }
}

class B extends A {
    int i, j, n;

    B() {
        super();
        System.out.println("It is a class B constructor");
    }

    void show() {
        super.show();
        System.out.println("Enter the size of the array : ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values of the array : ");
        for (i = 0; i < n; i++) {
            a[i] = o.nextInt();
        }
        System.out.println("Enter the value to search: ");
        int n1 = o.nextInt();
        for (i = 0; i < n; i++) {
            j = i + 1;
            if (a[i] == n1) {
                System.out.println("Index & Your value : " + j + " " + a[i]);
                super.isf = 1;
            }
        }
        if (super.isf == 0) {
            System.out.println("Value not found.");
        }
    }
}

public class SuperArray {
    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        patterns.show();

        B ao = new B();
        ao.show();
    }
}
