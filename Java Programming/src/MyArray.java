// Full Program. (All operations included)

import java.util.Scanner;

class MyArray {
    int[] arr;
    int size;

    // Constructor
    MyArray(int size) {
        this.size = size;
        arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 0;
    }

    // Input elements
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }

    // Display elements
    void display() {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // Sum and average
    void sumAverage() {
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (float) sum / size);
    }

    // Swap max and min
    void swapMaxMin() {
        int max = arr[0], min = arr[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) { max = arr[i]; maxIndex = i; }
            if (arr[i] < min) { min = arr[i]; minIndex = i; }
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }

    // Occurrence of unique elements
    void uniqueOccurrence() {
        for (int i = 0; i < size; i++) {
            int count = 1;
            if (arr[i] == -1) continue;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    // Make single digit
    int singleDigit(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    // Three-digit numbers & greatest
    void greatestThreeDigit() {
        int greatest = 0;

        for (int i = 0; i < size; i += 3) {
            int d1 = (i < size) ? singleDigit(arr[i]) : 0;
            int d2 = (i + 1 < size) ? singleDigit(arr[i + 1]) : 0;
            int d3 = (i + 2 < size) ? singleDigit(arr[i + 2]) : 0;

            int num = d1 * 100 + d2 * 10 + d3;
            System.out.println("New number: " + num);

            if (num > greatest)
                greatest = num;
        }
        System.out.println("Greatest value: " + greatest);
    }
}

class MyArrayDemo {
    public static void main(String[] args) {
        MyArray m = new MyArray(6);
        m.input();
        m.display();
        m.sumAverage();
        m.swapMaxMin();
        m.display();
        m.uniqueOccurrence();
        m.greatestThreeDigit();
    }
}
