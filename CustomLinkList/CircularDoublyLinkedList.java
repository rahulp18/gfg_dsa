package CustomLinkList;

public class CircularDoublyLinkedList {
    Node head;

    public void insertAtHead(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            new_node.next = head;
            new_node.prev = head;
            return;
        }
        new_node.next = head;
        new_node.prev = head.prev;
        head.prev = new_node;
        head = new_node;
        head.prev.next = new_node;
    }

    public void insertAtTail(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            new_node.next = head;
            new_node.prev = head;
            return;
        }
        head.prev.next = new_node;
        new_node.prev = head.prev;
        new_node.next = head;
        head.prev = new_node;

    }

    public void printCDLL() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (head != temp);
    }

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}