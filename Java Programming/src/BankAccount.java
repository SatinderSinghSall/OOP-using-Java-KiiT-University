import java.util.Scanner;

class BankAccount {
    int accNo;
    String name;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amt;
            System.out.println("Amount Withdrawn Successfully");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        b.input();

        System.out.print("Enter amount to deposit: ");
        b.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        b.withdraw(sc.nextDouble());

        b.displayBalance();
    }
}
