// Smaller and Greater Using Ternary Operator:

/*
  WAP in JAVA to find the smaller and greater number among two
  numbers  using ternary operator.
*/

import java.util.Scanner;

public class MinMaxTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int smaller = (a < b) ? a : b;
        int greater = (a > b) ? a : b;

        System.out.println("Smaller number = " + smaller);
        System.out.println("Greater number = " + greater);

        sc.close();
    }
}
