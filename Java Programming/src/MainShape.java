// Assignment – 18 (Abstract Class) Q1: Shape Abstract Class

abstract class Shape {
    double length, breadth, height;

    Shape(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    abstract void volume();
    abstract void surfaceArea();
}

// Cube
class Cube extends Shape {
    Cube(double side) {
        super(side, side, side);
    }

    void volume() {
        System.out.println("Cube Volume: " + (length * length * length));
    }

    void surfaceArea() {
        System.out.println("Cube Surface Area: " + (6 * length * length));
    }
}

// Cuboid
class Cuboid extends Shape {
    Cuboid(double l, double b, double h) {
        super(l, b, h);
    }

    void volume() {
        System.out.println("Cuboid Volume: " + (length * breadth * height));
    }

    void surfaceArea() {
        System.out.println("Cuboid Surface Area: " + 
            (2 * (length * breadth + breadth * height + height * length)));
    }
}

// Cylinder
class Cylinder extends Shape {
    Cylinder(double r, double h) {
        super(r, r, h);
    }

    void volume() {
        System.out.println("Cylinder Volume: " + 
            (Math.PI * length * length * height));
    }

    void surfaceArea() {
        System.out.println("Cylinder Surface Area: " + 
            (2 * Math.PI * length * (length + height)));
    }
}

// Main Class
public class MainShape {
    public static void main(String[] args) {
        Shape s;

        s = new Cube(3);
        s.volume();
        s.surfaceArea();

        s = new Cuboid(2, 3, 4);
        s.volume();
        s.surfaceArea();

        s = new Cylinder(2, 5);
        s.volume();
        s.surfaceArea();
    }
}