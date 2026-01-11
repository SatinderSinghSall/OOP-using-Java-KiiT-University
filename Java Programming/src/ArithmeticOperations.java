// Arithmetic Operations:

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int remender = num1 % num2;
        int division = num1 / num2;

        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Product of " + num1 + " * " + num2 + " = " + product);
        System.out.println("Remender of " + num1 + " % " + num2 + " = " + remender);
        System.out.println("Division of " + num1 + " / " + num2 + " = " + division);
    }
}
