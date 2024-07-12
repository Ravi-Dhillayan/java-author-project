package allpattern;

import arr.Pattern;
import java.util.Scanner;

public class Patterns implements Pattern {
    int i, n, j, k, s;

    @Override
    public void show() {
        System.out.println("Select the pattern to display:");
        System.out.println("1. Pattern 1");
        System.out.println("2. Pattern 2");
        System.out.println("3. Pattern 3");
        System.out.println("4. Pattern 4");
        System.out.println("5. Pattern 5");
        System.out.println("6. Pattern 6");
        Scanner o = new Scanner(System.in);
        int choice = o.nextInt();
        switch (choice) {
            case 1:
                fun1();
                break;
            case 2:
                fun2();
                break;
            case 3:
                fun3();
                break;
            case 4:
                fun4();
                break;
            case 5:
                fun5();
                break;
            case 6:
                fun6();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    void fun1() {
        System.out.println("How many Lines of Pattern :: ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void fun2() {
        System.out.println("How many Lines of Pattern :: ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        for (i = 0; i < n; i++) {
            for (k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void fun3() {
        System.out.println("How many Lines of Pattern :: ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        for (i = 0; i <= n; i++) {
            for (k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void fun4() {
        System.out.println("How many Lines of Pattern :: ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        for (i = 0; i < n; i++) {
            for (j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void fun5() {
        System.out.println("How many Lines of Pattern :: ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        for (i = 0; i < n; i++) {
            for (k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void fun6() {
        System.out.println("How many Lines of Pattern :: ");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        for (i = 0; i <= n; i++) {
            for (k = 0; k < i; k++) {
                System.out.print(" ");
            }
            if (i != 0) {
                for (j = n * 2 - 1; j >= i * 2 - 1; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
