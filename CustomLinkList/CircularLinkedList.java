package CustomLinkList;

public class CircularLinkedList {

    Node head = null;

    public void insertInCircular(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = head;

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
