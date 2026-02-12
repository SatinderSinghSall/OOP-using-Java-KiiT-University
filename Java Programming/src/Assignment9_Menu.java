import java.util.Scanner;

class Assignment9_Menu {

    static Scanner sc = new Scanner(System.in);

    // ---------- STUDENT ----------
    static class Student {
        int roll;
        String name;

        Student() {
            roll = 0;
            name = "NA";
        }

        Student(int r, String n) {
            roll = r;
            name = n;
        }

        Student(Student s) {
            roll = s.roll;
            name = s.name;
        }

        void show() {
            System.out.println("Roll: " + roll + " Name: " + name);
        }
    }

    // ---------- COMPLEX ----------
    static class Complex {
        int r, i;

        Complex(int r, int i) {
            this.r = r;
            this.i = i;
        }

        Complex add(Complex c) {
            return new Complex(r + c.r, i + c.i);
        }

        void show() {
            System.out.println(r + " + " + i + "i");
        }
    }

    // ---------- FRACTION ----------
    static class Fraction {
        int n, d;

        Fraction(int n, int d) {
            this.n = n;
            this.d = d;
        }

        Fraction add(Fraction f) {
            return new Fraction(n * f.d + f.n * d, d * f.d);
        }

        void show() {
            System.out.println(n + "/" + d);
        }
    }

    // ---------- MAIN MENU ----------
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("\n--- Assignment 9 Menu ---");
            System.out.println("1. Student Constructors");
            System.out.println("2. Complex Addition");
            System.out.println("3. Fraction Addition");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student s1 = new Student();
                    Student s2 = new Student(101, "Amit");
                    Student s3 = new Student(s2);
                    s1.show();
                    s2.show();
                    s3.show();
                    break;

                case 2:
                    Complex c1 = new Complex(2, 3);
                    Complex c2 = new Complex(4, 5);
                    Complex sum = c1.add(c2);
                    sum.show();
                    break;

                case 3:
                    Fraction f1 = new Fraction(1, 2);
                    Fraction f2 = new Fraction(1, 3);
                    Fraction res = f1.add(f2);
                    res.show();
                    break;
            }
        } while (ch != 0);
    }
}
