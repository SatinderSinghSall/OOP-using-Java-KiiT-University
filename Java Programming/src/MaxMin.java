// Find maximum and minimum element.

class MaxMin {
    public static void main(String[] args) {
        int[] a = {25, 11, 7, 75, 56};
        int max = a[0], min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
