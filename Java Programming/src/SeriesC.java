// 1 + 1/2! + 1/3! + ... + 1/n!

public class SeriesC {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 1.0; // first term = 1
        long fact = 1;

        System.out.print("Series: 1");

        for (int i = 2; i <= n; i++) {
            fact *= i;
            double term = 1.0 / fact;
            sum += term;

            System.out.print(" + 1/" + i + "!");
        }

        System.out.println("\nSum = " + sum);
    }
}
