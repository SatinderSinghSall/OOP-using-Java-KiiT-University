/*
 Special 4-digit numbers like 3025

 Condition:
  If number = abcd
  first two digits = ab, last two digits = cd
  Check: (ab + cd)² == number
*/

public class Special4Digit {
    public static void main(String[] args) {
        System.out.println("Special 4-digit numbers are:");

        for (int num = 1000; num <= 9999; num++) {
            int firstTwo = num / 100;
            int lastTwo = num % 100;

            int sum = firstTwo + lastTwo;

            if (sum * sum == num) {
                System.out.println(num);
            }
        }
    }
}
