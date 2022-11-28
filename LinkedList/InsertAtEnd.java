// package LinkedList;

// public class InsertAtEnd {
// public static void main(String[] args) {
// Node head = null;
// head = atEnd(200, head);
// head = atEnd(285, head);
// head = atEnd(892, head);
// head = atEnd(652, head);
// head = atEnd(202, head);
// // Printing the LinkedList
// Node curr = head;
// while (curr.next != null) {
// System.out.println(curr.data);
// curr = curr.next;
// }
// System.out.println(curr.data);
// }

// public static Node atEnd(int data, Node head) {
// Node new_node = new Node(data);
// if (head == null) {
// head = new_node;
// return head;
// }
// Node curr = head;
// while (curr.next != null) {
// curr = curr.next;
// }
// curr.next = new_node;

// return head;
// }
// }

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// next = null;
// }
// }