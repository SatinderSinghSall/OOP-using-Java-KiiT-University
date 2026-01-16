// 1 + 2³ + 3² + 4³ + ... + n (pattern: odd index → power 2, even index → power 3)

public class SeriesD {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            double term;

            if (i % 2 == 0) { // even -> cube
                term = Math.pow(i, 3);
                System.out.print(i + "^3");
            } else { // odd -> square
                term = Math.pow(i, 2);
                System.out.print(i + "^2");
            }

            sum += term;
            if (i < n) System.out.print(" + ");
        }

        System.out.println("\nSum = " + sum);
    }
}
