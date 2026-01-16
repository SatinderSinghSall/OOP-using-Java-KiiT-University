// Multiply digits repeatedly till single digit (ignore zeros)

// Example: 406 → 4×6=24 → 2×4=8

public class DigitProductToSingle {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        while (n >= 10) {
            long product = 1;
            boolean hasNonZeroDigit = false;

            while (n > 0) {
                long digit = n % 10;
                if (digit != 0) {
                    product *= digit;
                    hasNonZeroDigit = true;
                }
                n /= 10;
            }

            // If number had only zeros (like 0, 00, 1000 etc.)
            if (!hasNonZeroDigit) {
                product = 0;
            }

            n = product;
        }

        System.out.println("Single digit = " + n);
    }
}
