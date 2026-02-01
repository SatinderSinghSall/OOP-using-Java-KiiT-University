// Swap numbers without third variable

class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After XOR Swap: a=" + a + " b=" + b);

        // Restore using + and -
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Restore: a=" + a + " b=" + b);
    }
}
