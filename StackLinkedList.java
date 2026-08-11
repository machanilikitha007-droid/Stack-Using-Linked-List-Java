import java.util.Scanner;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node top = null;

    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Element pushed successfully.");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped element: " + top.data);
            top = top.next;
        }
    }

    static void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        Node current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STACK USING LINKED LIST =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    push(sc.nextInt());
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
