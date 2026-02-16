// Assignment - 10: Menu Driven

import java.util.Scanner;

class Assignment10 {
    int[] arr;
    int size;
    Scanner sc = new Scanner(System.in);

    Assignment10(int size) {
        this.size = size;
        arr = new int[size];
    }

    void input() {
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }

    void display() {
        System.out.print("Array elements: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    void countEvenOdd() {
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even = " + even + ", Odd = " + odd);
    }

    void maxMin() {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    void reverse() {
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void linearSearch() {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not found");
    }

    void sumAverage() {
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (float) sum / size);
    }

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

        System.out.println("Max and Min swapped.");
    }

    void uniqueOccurrence() {
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

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
        System.out.println("Greatest number = " + greatest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        Assignment10 obj = new Assignment10(n);
        obj.input();

        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Display Array");
            System.out.println("2. Count Even & Odd");
            System.out.println("3. Find Max & Min");
            System.out.println("4. Reverse Array");
            System.out.println("5. Linear Search");
            System.out.println("6. Sum & Average");
            System.out.println("7. Swap Max & Min");
            System.out.println("8. Occurrence of Unique Elements");
            System.out.println("9. Greatest Three-Digit Number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: obj.display(); break;
                case 2: obj.countEvenOdd(); break;
                case 3: obj.maxMin(); break;
                case 4: obj.reverse(); break;
                case 5: obj.linearSearch(); break;
                case 6: obj.sumAverage(); break;
                case 7: obj.swapMaxMin(); obj.display(); break;
                case 8: obj.uniqueOccurrence(); break;
                case 9: obj.greatestThreeDigit(); break;
                case 0: System.out.println("Exiting program..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
