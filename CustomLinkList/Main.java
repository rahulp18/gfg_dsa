package CustomLinkList;

public class Main {
    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.insertAtHead(10);
        // obj.insertAtHead(895);
        // obj.insertAtHead(89);
        // obj.insertAtHead(15);

        obj.insertAtTail(12);
        obj.insertAtTail(89);
        obj.insertAtTail(8985);
        obj.insertAtTail(50);
        obj.insertAtTail(56);
        obj.printDLL();
        // obj.reverse();
        // System.out.println("\nAfter Reverse");
        System.out.println();
        // obj.deleteFromHead();
        // obj.deleteFromTail();
        // obj.deleteFromTail();
        // obj.deleteFromTail();
        // obj.deleteFromTail();
        obj.printDLL();
    }

}
