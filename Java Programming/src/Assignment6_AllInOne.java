import java.util.Scanner;

public class Assignment6_AllInOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Assignment 6 Menu ======");
        System.out.println("1. Gross Salary Calculation");
        System.out.println("2. Minimum Currency Notes");
        System.out.println("3. Fahrenheit <-> Celsius Conversion");
        System.out.println("4. Volume & Surface Area of Sphere");
        System.out.println("5. Smaller & Greater using Ternary Operator");
        System.out.println("6. ++, -- and Assignment Operators Demo");
        System.out.println("7. Difference between - and ~ operators");
        System.out.print("Enter your choice (1-7): ");

        int choice = sc.nextInt();

        switch (choice) {

            // 1) Gross Salary
            case 1: {
                System.out.print("Enter Basic Salary: ");
                double basic = sc.nextDouble();

                double hra, da, gross;

                if (basic < 12000) {
                    hra = 0.20 * basic;
                    da = 1.15 * basic;
                } else {
                    hra = 0.15 * basic;
                    da = 0.90 * basic;
                }

                gross = basic + hra + da;

                System.out.println("HRA = " + hra);
                System.out.println("DA = " + da);
                System.out.println("Gross Salary = " + gross);
                break;
            }

            // 2) Minimum Currency Notes
            case 2: {
                System.out.print("Enter amount in Rs: ");
                int amount = sc.nextInt();

                int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

                System.out.println("Minimum notes required for Rs. " + amount + ":");

                for (int note : notes) {
                    int count = amount / note;
                    amount = amount % note;

                    if (count > 0) {
                        System.out.println(note + " * " + count);
                    }
                }
                break;
            }

            // 3) Fahrenheit <-> Celsius
            case 3: {
                double[] fahrenheitValues = {68, 150, 212, 0, -22, -200};

                System.out.println("Fahrenheit to Celsius Conversion:");
                for (double f : fahrenheitValues) {
                    double c = (5.0 / 9.0) * (f - 32);
                    System.out.println("Celsius value for Fahrenheit " + f + " is " + c);
                }

                System.out.print("\nEnter Celsius value to convert into Fahrenheit: ");
                double celsius = sc.nextDouble();

                double fahrenheit = (9.0 / 5.0) * celsius + 32;
                System.out.println("Fahrenheit value for Celsius " + celsius + " is " + fahrenheit);
                break;
            }

            // 4) Sphere Volume & Surface Area
            case 4: {
                double pi = 3.14159;
                double[] radii = {1, 6, 12.2, 0.2};

                System.out.println("Sphere Volume and Surface Area:");
                for (double r : radii) {
                    double volume = (4.0 / 3.0) * pi * r * r * r;
                    double area = 4 * pi * r * r;

                    System.out.println("\nRadius = " + r);
                    System.out.println("Volume = " + volume);
                    System.out.println("Surface Area = " + area);
                }
                break;
            }

            // 5) Smaller & Greater using ternary operator
            case 5: {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                int smaller = (a < b) ? a : b;
                int greater = (a > b) ? a : b;

                System.out.println("Smaller number = " + smaller);
                System.out.println("Greater number = " + greater);
                break;
            }

            // 6) ++, -- and Assignment Operators Demo
            case 6: {
                int a = 10;
                System.out.println("Initial a = " + a);

                System.out.println("Post-increment a++ = " + (a++));
                System.out.println("After post-increment a = " + a);

                System.out.println("Pre-increment ++a = " + (++a));
                System.out.println("After pre-increment a = " + a);

                System.out.println("Post-decrement a-- = " + (a--));
                System.out.println("After post-decrement a = " + a);

                System.out.println("Pre-decrement --a = " + (--a));
                System.out.println("After pre-decrement a = " + a);

                int b = 20;
                System.out.println("\nInitial b = " + b);

                b += 5;
                System.out.println("b += 5 -> " + b);

                b -= 3;
                System.out.println("b -= 3 -> " + b);

                b *= 2;
                System.out.println("b *= 2 -> " + b);

                b /= 4;
                System.out.println("b /= 4 -> " + b);

                b %= 3;
                System.out.println("b %= 3 -> " + b);

                break;
            }

            // 7) Difference between - and ~
            case 7: {
                System.out.print("Enter a number: ");
                int x = sc.nextInt();

                System.out.println("Unary minus (-x) = " + (-x));
                System.out.println("Bitwise NOT (~x) = " + (~x));
                System.out.println("Check: ~(x) = -(x+1) => " + (-(x + 1)));
                break;
            }

            default:
                System.out.println("Invalid choice! Please run again and enter 1-7.");
        }

        sc.close();
    }
}
