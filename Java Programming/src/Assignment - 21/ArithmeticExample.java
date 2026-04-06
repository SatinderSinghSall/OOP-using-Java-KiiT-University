// Program to demonstrate ArithmeticException

import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter numerator: ");
        int num = sc.nextInt();

        System.out.print("Enter denominator: ");
        int den = sc.nextInt();

        try {
            // Attempting division
            int result = num / den;

            // Printing result if no exception occurs
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            // This block runs if denominator is 0
            System.out.println("Error: Cannot divide by zero!");
        }

        sc.close();
    }
}
