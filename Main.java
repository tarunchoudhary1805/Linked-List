public class Main {

    public static void main(String[] args) {
        Node n1 = new Node();
        n1.insertAtBegin(1);   
        n1.insertAtEnd(6);
        n1.insertAtEnd(10);
        n1.printLL();
        System.out.println();
        n1.insertAtPostion(2,11);
        n1.printLL();
        System.out.println();
    }
}
