// 1 + 1/x + 1/x² + 1/x³ + ... + 1/xⁿ

public class SeriesB {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);

        double sum = 0;

        System.out.print("Series: ");
        for (int i = 0; i <= n; i++) {
            double term = 1.0 / Math.pow(x, i);
            sum += term;

            System.out.print("1/" + x + "^" + i);
            if (i < n) System.out.print(" + ");
        }

        System.out.println("\nSum = " + sum);
    }
}
