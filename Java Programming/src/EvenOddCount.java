// Count even and odd numbers in an array.

class EvenOddCount {
    public static void main(String[] args) {
        int[] a = {3, 6, 7, 8, 10, 15};
        int even = 0, odd = 0;

        for (int i : a) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
