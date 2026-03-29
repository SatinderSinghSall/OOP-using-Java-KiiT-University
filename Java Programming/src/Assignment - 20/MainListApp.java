// Assignment - 20: Question 2: Linked List using Packages

import java.util.Scanner;
import listpack.LinkedList;

public class MainListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Node");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    list.addNode(value);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
