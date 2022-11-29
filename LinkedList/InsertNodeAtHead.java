// package LinkedList;

// public class InsertNodeAtHead {

// public static void main(String[] args) {

// Node head = null;
// head = insertAtHead(0, head);
// head = insertAtHead(50, head);
// head = insertAtHead(580, head);
// head = insertAtHead(90, head);
// printlist(head);
// }

// public static void printlist(Node head) {
// Node curr = head;
// while (curr != null) {
// System.out.print(curr.data + " ");
// curr = curr.next;
// }
// }

// public static Node insertAtHead(int data, Node head) {
// Node new_node = new Node(data);

// new_node.next = head;

// return new_node;
// }
// }

// class Node {
// int data;
// Node next;

// Node(int data) {

// this.data = data;
// this.next = null;
// }

// }
