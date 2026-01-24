// Difference Between - and ~ Operators:

/*
  WAP to observe the difference between – and ~ operators.
*/

import java.util.Scanner;

public class MinusVsBitwiseNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Unary minus (-x) = " + (-x));
        System.out.println("Bitwise NOT (~x) = " + (~x));
        System.out.println("Check: ~(x) = -(x+1) => " + (-(x + 1)));

        sc.close();
    }
}
