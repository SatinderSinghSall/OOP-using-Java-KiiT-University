// Mark Sheet using switch–case

import java.util.Scanner;

class MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int total = 0;
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;
        char grade;

        switch ((int) percentage / 10) {
            case 10:
            case 9: grade = 'O'; break;
            case 8: grade = 'E'; break;
            case 7: grade = 'A'; break;
            case 6: grade = 'B'; break;
            case 5: grade = 'C'; break;
            case 4: grade = 'D'; break;
            default: grade = 'F';
        }

        System.out.println("\n--- MARK SHEET ---");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + (grade == 'F' ? "Fail" : grade));
    }
}
