import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and Breadth: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter details of Rectangle 1:");
        r1.input();

        System.out.println("Enter details of Rectangle 2:");
        r2.input();

        r1.display();
        r2.display();

        if (r1.area() > r2.area())
            System.out.println("Rectangle 1 has larger area");
        else if (r2.area() > r1.area())
            System.out.println("Rectangle 2 has larger area");
        else
            System.out.println("Both rectangles have equal area");
    }
}
