// Use of ++, -- and Assignment Operators:

/*
  Write a program to show the use of ++, -- and different assignment
  operators.
*/

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial a = " + a);

        System.out.println("Post-increment a++ = " + (a++));
        System.out.println("After post-increment a = " + a);

        System.out.println("Pre-increment ++a = " + (++a));
        System.out.println("After pre-increment a = " + a);

        System.out.println("Post-decrement a-- = " + (a--));
        System.out.println("After post-decrement a = " + a);

        System.out.println("Pre-decrement --a = " + (--a));
        System.out.println("After pre-decrement a = " + a);

        int b = 20;
        System.out.println("\nInitial b = " + b);

        b += 5;
        System.out.println("b += 5 -> " + b);

        b -= 3;
        System.out.println("b -= 3 -> " + b);

        b *= 2;
        System.out.println("b *= 2 -> " + b);

        b /= 4;
        System.out.println("b /= 4 -> " + b);

        b %= 3;
        System.out.println("b %= 3 -> " + b);
    }
}
