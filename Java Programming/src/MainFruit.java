// Assignment – 18 (Abstract Class) Q2: Fruit Abstract Class

abstract class Fruit {
    String colour, taste;

    Fruit(String c, String t) {
        colour = c;
        taste = t;
    }

    abstract void display();
}

class Apple extends Fruit {
    Apple() {
        super("Red", "Sweet");
    }

    void display() {
        System.out.println("Apple -> Colour: " + colour + ", Taste: " + taste);
    }
}

class Banana extends Fruit {
    Banana() {
        super("Yellow", "Sweet");
    }

    void display() {
        System.out.println("Banana -> Colour: " + colour + ", Taste: " + taste);
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Citrus");
    }

    void display() {
        System.out.println("Orange -> Colour: " + colour + ", Taste: " + taste);
    }
}

class Strawberry extends Fruit {
    Strawberry() {
        super("Red", "Sweet");
    }

    void display() {
        System.out.println("Strawberry -> Colour: " + colour + ", Taste: " + taste);
    }
}

// Main
public class MainFruit {
    public static void main(String[] args) {
        Fruit f;

        f = new Apple(); f.display();
        f = new Banana(); f.display();
        f = new Orange(); f.display();
        f = new Strawberry(); f.display();
    }
}
