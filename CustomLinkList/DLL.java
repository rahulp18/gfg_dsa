package CustomLinkList;

public class DLL {
    Node head;

    public void insertAtHead(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }

        head = new_node;

    }

    public void insertAtTail(int data) {
        Node new_node = new Node(data);
        Node last = head;

        new_node.next = head;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;

    }

    public void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverse() {

        if (head == null || head.next == null) {
            return;
        }
        Node curr = head, prev = null;

        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        head = prev.prev;

    }

    public void deleteFromHead() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteFromTail() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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