// Greatest of 3 numbers:

import java.util.Scanner;

public class GratestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();
        int greatest = 0;

        if(num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num1 && num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        System.out.println("Greatest number among: " + num1 + ", " + num2 + " and " + num3 + " is " + greatest);
    }
}
