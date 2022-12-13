package CustomLinkList;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    int Count = 0;

    public void insert(int data) {
        Node new_node = new Node(data);
        Count++;
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;

    }

    public void PrintLinkList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void findMiddle() {
        Node curr = head;
        for (int i = 0; i < Count / 2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public void efficentWayToFindMiddle() {
        if (head == null) {
            System.out.println("Chak nikal");
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        System.out.println(slow.data);
    }

    public void reverseList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        head = null;
        for (int i = list.size() - 1; i >= 0; i--) {

            insert(list.get(i));
        }
    }

    public void efficentWayTReverse() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        ;

    }

    public int Length() {
        return Count;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
