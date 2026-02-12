import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basic, ta, da, hra, pf, gross, net;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    void calculate() {
        da = basic * 0.65;
        hra = basic * 0.15;
        ta = basic * 0.24;
        pf = basic * 0.21;

        gross = basic + da + hra + ta;
        net = gross - pf;
    }

    void display() {
        System.out.println("\n--- Salary Slip ---");
        System.out.println("Emp ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.calculate();
        e.display();
    }
}
