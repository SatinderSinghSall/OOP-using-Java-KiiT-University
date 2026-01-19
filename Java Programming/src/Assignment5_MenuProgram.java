// Assignment-5 Menu Driven Program. (Q1 to Q6)

import java.util.Scanner;

public class Assignment5_MenuProgram {

    // Q1: Quadratic Roots
    static void quadraticRoots(Scanner sc) {
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root1 = " + r1);
            System.out.println("Root2 = " + r2);
        } else if (d == 0) {
            double r = (-b) / (2 * a);
            System.out.println("Roots are real and same:");
            System.out.println("Root = " + r);
        } else {
            double real = (-b) / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root1 = " + real + " + " + imag + "i");
            System.out.println("Root2 = " + real + " - " + imag + "i");
        }
    }

    // Q2: Palindrome Check
    static void palindromeCheck(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (original == rev)
            System.out.println(original + " is a Palindrome Number.");
        else
            System.out.println(original + " is NOT a Palindrome Number.");
    }

    // Q3: Fibonacci Series
    static void fibonacciSeries(Scanner sc) {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Q4: Perfect Number Check
    static void perfectNumberCheck(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (sum == n && n != 0)
            System.out.println(n + " is a Perfect Number.");
        else
            System.out.println(n + " is NOT a Perfect Number.");
    }

    // Q5: Armstrong Numbers 100 to 1000
    static void armstrong100to1000() {
        System.out.println("Armstrong numbers between 100 and 1000:");

        for (int n = 100; n <= 1000; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp = temp / 10;
            }

            if (sum == n)
                System.out.println(n);
        }
    }

    // Q6: GCD of Two Numbers
    static void gcdTwoNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = 1;
        int min = (a < b) ? a : b;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }

        System.out.println("GCD = " + gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Assignment-5 Menu =====");
            System.out.println("1. Roots of Quadratic Equation");
            System.out.println("2. Check Palindrome Number");
            System.out.println("3. Generate Fibonacci Series");
            System.out.println("4. Check Perfect Number");
            System.out.println("5. Armstrong Numbers (100 to 1000)");
            System.out.println("6. Find GCD of Two Numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    quadraticRoots(sc);
                    break;
                case 2:
                    palindromeCheck(sc);
                    break;
                case 3:
                    fibonacciSeries(sc);
                    break;
                case 4:
                    perfectNumberCheck(sc);
                    break;
                case 5:
                    armstrong100to1000();
                    break;
                case 6:
                    gcdTwoNumbers(sc);
                    break;
                case 0:
                    System.out.println("Exiting Program... Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
