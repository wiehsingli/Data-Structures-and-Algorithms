/**
 * Created by Wie Hsing Li on 1/4/2017.
 * Implement Queue using linked list
 */

public class Queue {
    Node head = null;
    int size = 0;

    public void add(int data) {
        Node newNode = new Node(data);
        if (getSize() == 0) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;
        }
        size++;
        System.out.println("Added: " + newNode.data + " to end of queue");
    }

    public int peek() {
        int data = 0;
        if (getSize() == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public void remove() {
        if (getSize() == 0) {
            System.out.println("Queue is empty");
            return;
        } else {
            head = head.next;
            size--;
        }
    }

    public void printQueue() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public int getSize(){
        return size;
    }
}
