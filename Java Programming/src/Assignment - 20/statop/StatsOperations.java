// Assignment - 20: Question 1: Packages mathop and statop

package statop;

import java.util.Arrays;

public class StatsOperations {

    // Method to calculate average
    public static double findAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    // Method to calculate median
    public static double findMedian(int[] arr) {
        Arrays.sort(arr); // sort array

        int n = arr.length;

        if (n % 2 == 0) {
            // even case
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            // odd case
            return arr[n / 2];
        }
    }
}
