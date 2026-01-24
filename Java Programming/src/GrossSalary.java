// Gross Salary Calculation:

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}

