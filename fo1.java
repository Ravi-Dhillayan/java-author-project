package inter1;

import java.util.Scanner;

public class fo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int i, nu, tb = 0;
        int a;
        System.out.println("Enter the number for the table: ");
        Scanner o6 = new Scanner(System.in);
        nu = o6.nextInt();
        
        for (i = 1; i <= 10; i++) { // Changed 'a' to 'i'
            tb = nu * i;
            System.out.print(nu + "*" + i + "=");
            System.out.println(tb);
        }

        int no, f = 1, j = 1;
        System.out.println("Enter the N number for factorial: ");
        Scanner o7 = new Scanner(System.in);
        no = o7.nextInt();
        
        for (i = no; i >= 1; --i) {
            f = f * i;
            System.out.println(f + "*" + i + "=" + f); // Removed unnecessary j=J++ comment
        }
        
        System.out.println("Factorial N Number: " + f);

        int num; // Corrected 'mum' to 'num'
        float fs = 0;
        System.out.println("Enter the N number for Fibonacci: ");
        Scanner o8 = new Scanner(System.in);
        num = o8.nextInt();
        System.out.println("Value of the Fibonacci Series: ");
        
        for (i = 1; i <= num; ++i) {
            fs += 1.0 / i; // Changed 1/i to 1.0/i to ensure float division
        }
        
        System.out.println(fs);

        int n4;
        System.out.println("Enter the N number: ");
        Scanner o9 = new Scanner(System.in);
        n4 = o9.nextInt();
        
        for (i = 0; i < 2; i++) {
            int digit = n4 % 10; // Extracting the last digit of n4
            System.out.print("(");
            System.out.print(digit + "*" + digit + "*" + digit);
            System.out.print(")");
            if (i < 1) {
                System.out.print(" + "); // Adding plus for the first iteration
            }
            n4 /= 10; // Removing the last digit of n4 for the next iteration
        }
        System.out.println(); // Newline for better output formatting
    }
}
