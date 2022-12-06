package CustomLinkList;

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
