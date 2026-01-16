// Reduce the number to a single digit by adding digits repeatedly

// Example: 9875 → 9+8+7+5=29 → 2+9=11 → 1+1=2

public class DigitSumToSingle {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        while (n >= 10) {
            long sum = 0;
            while (n > 0) {
                sum += (n % 10);
                n /= 10;
            }
            n = sum;
        }

        System.out.println("Single digit = " + n);
    }
}
