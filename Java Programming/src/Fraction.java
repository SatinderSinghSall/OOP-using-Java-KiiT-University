class Fraction {
    int num, den;

    // Default constructor
    Fraction() {
        num = 0;
        den = 1;
    }

    // One argument constructor
    Fraction(int n) {
        num = n;
        den = 1;
    }

    // Two argument constructor
    Fraction(int n, int d) {
        num = n;
        den = d;
    }

    // Copy constructor
    Fraction(Fraction f) {
        num = f.num;
        den = f.den;
    }

    void show() {
        System.out.println(num + "/" + den);
    }

    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    Fraction reduce() {
        int g = gcd(num, den);
        return new Fraction(num / g, den / g);
    }

    Fraction add(Fraction f) {
        return new Fraction(num * f.den + f.num * den, den * f.den).reduce();
    }

    Fraction subtract(Fraction f) {
        return new Fraction(num * f.den - f.num * den, den * f.den).reduce();
    }

    Fraction multiply(Fraction f) {
        return new Fraction(num * f.num, den * f.den).reduce();
    }

    Fraction div(Fraction f) {
        return new Fraction(num * f.den, den * f.num).reduce();
    }

    void compare(Fraction f) {
        if (num * f.den > f.num * den)
            System.out.println("First fraction is greater");
        else if (num * f.den < f.num * den)
            System.out.println("Second fraction is greater");
        else
            System.out.println("Both fractions are equal");
    }

    void mixed() {
        if (num > den) {
            int whole = num / den;
            int rem = num % den;
            System.out.println("Mixed Fraction: " + whole + " " + rem + "/" + den);
        } else {
            show();
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(7, 3);
        Fraction f2 = new Fraction(2, 3);

        Fraction sum = f1.add(f2);
        Fraction diff = f1.subtract(f2);
        Fraction prod = f1.multiply(f2);
        Fraction div = f1.div(f2);

        System.out.print("Addition: ");
        sum.show();

        System.out.print("Subtraction: ");
        diff.show();

        System.out.print("Multiplication: ");
        prod.show();

        System.out.print("Division: ");
        div.show();

        f1.compare(f2);

        System.out.print("Mixed form of first fraction: ");
        f1.mixed();
    }
}
