// Generate Armstrong numbers between 100 to 1000.

public class Armstrong100to1000 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 1000:");

        for (int n = 100; n <= 1000; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
