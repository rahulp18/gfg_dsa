package CustomLinkList;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        // obj.insertInCircular(49);
        // obj.insertInCircular(89);
        // obj.insertInCircular(8945);
        // obj.insertInCircular(88);
        obj.insertAtHead(78);
        obj.insertAtHead(786);
        // obj.insertAtHead(758);
        // obj.insertAtHead(798);
        // obj.insertInCircular(45);

        obj.deleteFromKthPosition(1);

        obj.print();

    }

}
