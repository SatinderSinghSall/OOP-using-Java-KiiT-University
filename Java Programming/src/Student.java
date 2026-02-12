import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int m1, m2, m3;
    int total;
    double percentage;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;
    }

    void display() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.input();
        s1.calculate();
        s1.display();

        s2.input();
        s2.calculate();
        s2.display();
    }
}
