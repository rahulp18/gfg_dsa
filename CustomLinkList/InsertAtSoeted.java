package CustomLinkList;

public class InsertAtSoeted {

    Node head = null;

    public void insert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;

        while (temp.next == null) {
            if (temp.data < data) {

            }
            temp = temp.next;
        }
        new_node.next = temp;
        temp.next = new_node;

    }

    public void PrintLinkList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
