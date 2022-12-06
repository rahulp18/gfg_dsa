package CustomLinkList;

public class MiddleOfLL {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.findMiddle();
        // System.out.println(obj.Length());
        obj.efficentWayToFindMiddle();
        // obj.PrintLinkList();
    }

}
