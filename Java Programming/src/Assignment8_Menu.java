import java.util.Scanner;

class Assignment8_Menu {

    static Scanner sc = new Scanner(System.in);

    // ---------- STUDENT ----------
    static class Student {
        int roll;
        String name;
        int m1, m2, m3;

        void input() {
            System.out.print("Roll No: ");
            roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Marks in 3 subjects: ");
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m3 = sc.nextInt();
        }

        void display() {
            int total = m1 + m2 + m3;
            double per = total / 3.0;
            System.out.println("Total = " + total);
            System.out.println("Percentage = " + per);
        }
    }

    // ---------- BANK ----------
    static class Bank {
        double bal;

        void deposit() {
            System.out.print("Enter amount: ");
            bal += sc.nextDouble();
        }

        void withdraw() {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            if (amt > bal)
                System.out.println("Insufficient Balance");
            else
                bal -= amt;
        }

        void show() {
            System.out.println("Balance = " + bal);
        }
    }

    // ---------- RECTANGLE ----------
    static class Rectangle {
        double l, b;

        void input() {
            System.out.print("Length & Breadth: ");
            l = sc.nextDouble();
            b = sc.nextDouble();
        }

        void display() {
            System.out.println("Area = " + (l * b));
            System.out.println("Perimeter = " + 2 * (l + b));
        }
    }

    // ---------- EMPLOYEE ----------
    static class Employee {
        double basic;

        void input() {
            System.out.print("Basic Salary: ");
            basic = sc.nextDouble();
        }

        void display() {
            double da = 0.65 * basic;
            double hra = 0.15 * basic;
            double ta = 0.24 * basic;
            double pf = 0.21 * basic;
            double gross = basic + da + hra + ta;
            double net = gross - pf;

            System.out.println("Gross Salary = " + gross);
            System.out.println("Net Salary = " + net);
        }
    }

    // ---------- MAIN MENU ----------
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("\n--- Assignment 8 Menu ---");
            System.out.println("1. Student");
            System.out.println("2. Bank Account");
            System.out.println("3. Rectangle");
            System.out.println("4. Employee");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student s = new Student();
                    s.input();
                    s.display();
                    break;

                case 2:
                    Bank b = new Bank();
                    b.deposit();
                    b.withdraw();
                    b.show();
                    break;

                case 3:
                    Rectangle r = new Rectangle();
                    r.input();
                    r.display();
                    break;

                case 4:
                    Employee e = new Employee();
                    e.input();
                    e.display();
                    break;
            }
        } while (ch != 0);
    }
}
