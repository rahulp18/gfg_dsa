// package LinkedList;

// public class DeleteAtHead {
// public static void main(String[] args) {
// Node head = null;
// head = atEnd(200, head);
// head = atEnd(285, head);
// head = atEnd(892, head);
// head = atEnd(652, head);
// head = atEnd(202, head);
// head = deleteFromTail(head);

// Node curr = head;
// while (curr.next != null) {
// System.out.println(curr.data);
// curr = curr.next;
// }
// System.out.println(curr.data);
// }

// public static Node deleteNode(Node head) {
// if (head == null) {
// return head;
// }
// head = head.next;
// return head;
// }

// public static Node deleteFromTail(Node head) {

// if (head == null) {
// return head;
// }
// Node temp = head;
// while (temp.next.next != null) {
// temp = temp.next;

// }
// temp.next = null;

// return head;
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

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }
