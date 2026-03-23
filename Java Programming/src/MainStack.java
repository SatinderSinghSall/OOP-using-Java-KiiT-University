// Assignment – 19 (Interface) Q2: Stack Operations Interface

import java.util.Scanner;

interface StackOperations {
    void push(int x);
    void pop();
    void peek();
}

class MyStack implements StackOperations {
    int stack[];
    int top, size;

    MyStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else {
            stack[++top] = x;
            System.out.println("Pushed: " + x);
        }
    }

    public void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    public void peek() {
        if (top == -1)
            System.out.println("Stack Empty");
        else
            System.out.println("Top Element: " + stack[top]);
    }
}

// Main
public class MainStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        MyStack s = new MyStack(size);

        int choice, x;
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
            }
        } while (choice != 0);
    }
}
