package CustomLinkList;

public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    public void insertInCircular(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;

        } else {
            tail.next = new_node;
        }

        tail = new_node;
        tail.next = head;
    }

    public void insertAtHead(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
            new_node.next = tail;
            return;
        }

        new_node.next = head;
        head = new_node;
        tail.next = head;
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("You have to insert something before deleleting...");
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    public void deleteFromKthPosition(int k) {
        if (head.next == head) {
            if (k == 1) {
                head = null;
                tail = null;
                return;
            }
        }
        if (k == 1) {
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head;
        for (int i = 2; i < k; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public void print() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (temp == head) {
                break;
            }
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
