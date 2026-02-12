class Complex {
    int real, imag;

    // Default constructor
    Complex() {
        real = 0;
        imag = 0;
    }

    // Parameterized constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Copy constructor
    Complex(Complex c) {
        real = c.real;
        imag = c.imag;
    }

    void showComplex() {
        System.out.println(real + " + " + imag + "i");
    }

    Complex addComplex(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    Complex subtractComplex(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    Complex multiplyComplex(Complex c) {
        return new Complex(
            real * c.real - imag * c.imag,
            real * c.imag + imag * c.real
        );
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        Complex sum = c1.addComplex(c2);
        Complex diff = c1.subtractComplex(c2);
        Complex prod = c1.multiplyComplex(c2);

        System.out.print("First Complex: ");
        c1.showComplex();

        System.out.print("Second Complex: ");
        c2.showComplex();

        System.out.print("Addition: ");
        sum.showComplex();

        System.out.print("Subtraction: ");
        diff.showComplex();

        System.out.print("Multiplication: ");
        prod.showComplex();
    }
}
