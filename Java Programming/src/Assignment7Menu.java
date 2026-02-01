// Assignment - 7: Java Lab

import java.util.Scanner;

class Assignment7Menu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== ASSIGNMENT 7 MENU =====");
            System.out.println("1. Mark Sheet using Switch Case");
            System.out.println("2. Calculator using Switch Case");
            System.out.println("3. Number to Words");
            System.out.println("4. Bitwise Shift Operators");
            System.out.println("5. Bitwise Operators (& | ^ ~)");
            System.out.println("6. Swap Numbers without Third Variable");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: markSheet(); break;
                case 2: calculator(); break;
                case 3: numberToWords(); break;
                case 4: bitShift(); break;
                case 5: bitwiseOperators(); break;
                case 6: swapNumbers(); break;
                case 0: System.out.println("Exiting Program..."); break;
                default: System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }

    // Q1
    static void markSheet() {
        sc.nextLine();
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int total = 0;
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;
        char grade;

        switch ((int) percentage / 10) {
            case 10:
            case 9: grade = 'O'; break;
            case 8: grade = 'E'; break;
            case 7: grade = 'A'; break;
            case 6: grade = 'B'; break;
            case 5: grade = 'C'; break;
            case 4: grade = 'D'; break;
            default: grade = 'F';
        }

        System.out.println("\n--- MARK SHEET ---");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + (grade == 'F' ? "Fail" : grade));
    }

    // Q2
    static void calculator() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/': System.out.println("Result = " + (a / b)); break;
            default: System.out.println("Invalid Operator");
        }
    }

    // Q3
    static void numberToWords() {
        System.out.print("Enter number: ");
        String num = sc.next();

        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case '0': System.out.print("Zero "); break;
                case '1': System.out.print("One "); break;
                case '2': System.out.print("Two "); break;
                case '3': System.out.print("Three "); break;
                case '4': System.out.print("Four "); break;
                case '5': System.out.print("Five "); break;
                case '6': System.out.print("Six "); break;
                case '7': System.out.print("Seven "); break;
                case '8': System.out.print("Eight "); break;
                case '9': System.out.print("Nine "); break;
            }
        }
        System.out.println();
    }

    // Q4
    static void bitShift() {
        System.out.print("Enter value v: ");
        int v = sc.nextInt();
        System.out.print("Enter shift n: ");
        int n = sc.nextInt();

        System.out.println("Left Shift (v << n): " + (v << n));
        System.out.println("Right Shift (v >> n): " + (v >> n));
        System.out.println("Unsigned Right Shift (v >>> n): " + (v >>> n));
    }

    // Q5
    static void bitwiseOperators() {
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("AND (&): " + (num1 & num2));
        System.out.println("OR (|): " + (num1 | num2));
        System.out.println("XOR (^): " + (num1 ^ num2));
        System.out.println("NOT (~num1): " + (~num1));
    }

    // Q6
    static void swapNumbers() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // XOR swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After XOR Swap: a=" + a + " b=" + b);

        // Restore
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Restore: a=" + a + " b=" + b);
    }
}
