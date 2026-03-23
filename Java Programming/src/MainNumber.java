// Assignment – 19 (Interface) Q1: Int Operations Interface

import java.util.Scanner;

interface IntOperations {
    void checkPositive();
    void checkEvenOdd();
    void checkPrime();
    void checkPalindrome();
    void factorial();
    void sumOfDigits();
}

class MyNumber implements IntOperations {
    private int num;

    MyNumber() {
        num = 0;
    }

    MyNumber(int num) {
        this.num = num;
    }

    public void checkPositive() {
        if (num >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    public void checkEvenOdd() {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public void checkPrime() {
        int i, flag = 0;
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        System.out.println(flag == 0 ? "Prime" : "Not Prime");
    }

    public void checkPalindrome() {
        int temp = num, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(rev == num ? "Palindrome" : "Not Palindrome");
    }

    public void factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);
    }

    public void sumOfDigits() {
        int temp = num, sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

// Main Menu
public class MainNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        MyNumber obj = new MyNumber(n);

        int choice;
        do {
            System.out.println("\n1.Positive/Negative\n2.Even/Odd\n3.Prime\n4.Palindrome\n5.Factorial\n6.Sum of Digits\n0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: obj.checkPositive(); break;
                case 2: obj.checkEvenOdd(); break;
                case 3: obj.checkPrime(); break;
                case 4: obj.checkPalindrome(); break;
                case 5: obj.factorial(); break;
                case 6: obj.sumOfDigits(); break;
            }
        } while (choice != 0);
    }
}
