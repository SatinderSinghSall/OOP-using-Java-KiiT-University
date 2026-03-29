// Assignment - 20: Question 1: Packages mathop and statop

import java.util.Scanner;
import mathop.MathsOperations;
import statop.StatsOperations;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling methods from packages
        System.out.println("Maximum: " + MathsOperations.findMax(arr));
        System.out.println("Minimum: " + MathsOperations.findMin(arr));
        System.out.println("Average: " + StatsOperations.findAverage(arr));
        System.out.println("Median: " + StatsOperations.findMedian(arr));

        sc.close();
    }
}
