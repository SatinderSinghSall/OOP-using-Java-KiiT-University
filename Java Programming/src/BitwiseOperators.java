// Bitwise Operators (&, |, ^, ~)

class BitwiseOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;
        int num3;

        num3 = num1 & num2;
        System.out.println("AND (&): " + num3);

        num3 = num1 | num2;
        System.out.println("OR (|): " + num3);

        num3 = num1 ^ num2;
        System.out.println("XOR (^): " + num3);

        num3 = ~num1;
        System.out.println("NOT (~): " + num3);
    }
}
