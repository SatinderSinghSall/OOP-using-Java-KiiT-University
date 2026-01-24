// Volume and Surface Area of Sphere:

public class SphereCalculation {
    public static void main(String[] args) {
        double pi = 3.14159;
        double[] radii = {1, 6, 12.2, 0.2};

        for (double r : radii) {
            double volume = (4.0 / 3.0) * pi * r * r * r;
            double area = 4 * pi * r * r;

            System.out.println("Radius = " + r);
            System.out.println("Volume = " + volume);
            System.out.println("Surface Area = " + area);
            System.out.println("----------------------");
        }
    }
}
