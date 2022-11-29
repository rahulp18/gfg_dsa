package CustomLinkList;

public class SortedInsert {

    Node head = null;

    public void insert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data > data) {
                new_node.next = temp;
                temp.next = new_node;
                break;
            }
            temp = temp.next;
        }
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
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }
}
