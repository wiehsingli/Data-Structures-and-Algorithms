/**
 * Created by Wie Hsing Li on 1/2/2017.
 * Implement stack using Linked List
 */


public class Stack {

    Node head = null;
    int size = 0;

    public void push(int data) {
        Node newNode = new Node(data);

        if (getSize() == 0) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
        System.out.println("Element: " + data + " is pushed to stack.");
        size++;
    }
    public void pop() {

        if (getSize() == 0) {
            System.out.println("Stack is empty");
            return;
        } else {
            head = head.next;
            size--;
        }

    }
    public int front() {
        int data = 0;
        if (getSize() == 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public void printStack() {

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
