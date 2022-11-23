package CustomLinkList;

public class RLinkList {
    static Node head = null;

    public static void main(String[] args) {

        // insertAtBeggining(85);
        // insertAtBeggining(895);
        // insertAtBeggining(8565);
        insertAtEnd(8);
        insertAtEnd(88);
        insertAtEnd(8889);
        insertAtEnd(888998);
        // insertAtAnyPosition(778, 3);
        // System.out.println(searchItem(88899));
        // System.out.println(recursiveSearch(888998, head, 1));
        System.out.println(recursive(8889, head));
        PrintLinkList(head);

    }

    public static int recursiveSearch(int data, Node temp, int position) {

        if (temp == null) {

            return -1;
        }

        if (temp.data == data) {
            return position;
        }
        temp = temp.next;
        position++;
        return recursiveSearch(data, temp, position);
    }

    public static int recursive(int data, Node temp) {
        if (temp == null)
            return -2;
        if (temp.data == data) {
            return 1;
        } else {
            int res = recursive(data, temp.next);
            if (res == -1)
                return -1;
            else {
                return res + 1;
            }
        }
    }

    public static void insertAtAnyPosition(int data, int position) {
        Node new_node = new Node(data);
        if (head == null) {
            return;
        }
        if (position == 1) {
            new_node.next = head;
            head = new_node;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp.next != null) {

                temp = temp.next;
            }
        }
        System.out.println(temp.data);
        new_node.next = temp.next;
        temp.next = new_node;
    }

    public static void insertAtBeggining(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;

    }

    public static void insertAtEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public static void PrintLinkList(Node head) {
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

    public static int searchItem(int data) {
        int position = 1;
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == data) {
                return position;
            }
            position++;
            temp = temp.next;
        }

        return -1;
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
