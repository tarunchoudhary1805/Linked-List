public class DoublyMain {
    public static void main(String[] args) {
        DoublyNode n1 = new DoublyNode();
        n1.insertAtBegin(1);   
        n1.insertAtBegin(3);   
        n1.insertAtEnd(6);
        n1.insertAtEnd(10);
        n1.printLL();
        System.out.println();
        n1.insertAtPostion(2,11);
        n1.printLL();
        System.out.println();
        n1.deleteAtBegin();
        n1.printLL();
        System.out.println();
        n1.deleteAtEnd();
        n1.printLL();
        System.out.println();
        n1.deleteAtPostion(2);
        n1.printLL();
        System.out.println();
    }
}
