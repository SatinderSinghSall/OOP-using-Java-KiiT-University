// Triangle type using 3 sides:

public class TriangleType {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Triangle validity check
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle.");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
