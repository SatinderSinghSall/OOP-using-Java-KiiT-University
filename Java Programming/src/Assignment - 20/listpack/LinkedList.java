// Assignment - 20: Question 2: Linked List using Packages

package listpack;

import nodepack.Node;

public class LinkedList {

    private Node head;

    // Method to add node at end
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            // Traverse to last node
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // Method to display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
