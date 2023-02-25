public class DoublyNode {

    DoublyNode head;

    int data;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode() {
        data = 0;
        prev = null;
        next = null;
    }

    DoublyNode(int data) {
        this.data = data;
    }

    public void insertAtBegin(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null)
            head = newNode;
        else {
            DoublyNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            newNode.prev = cur;

        }
    }

    public void insertAtPostion(int pos, int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (pos == 1)
            insertAtBegin(data);
        else {
            DoublyNode cur = head;
            for (int i = 1; i < pos - 1 && cur.next != null; i++) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            newNode.prev = cur;
            cur.next = newNode;
        }
    }

    public void printLL() {
        DoublyNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " - > ");
            cur = cur.next;
        }

    }

    public void deleteAtBegin() {
        if (head.next == null)
            head = null;
        else {
            head = head.next;
            head.next.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head.next == null)
            head = null;
        else {
            DoublyNode cur = head;
            while (cur.next.next != null) {
                cur = cur.next;
            }
            cur.next = null;
        }
    }

    public void deleteAtPostion(int pos) {
        if (pos == 1)
            deleteAtBegin();
        else {
            DoublyNode cur = head;
            for (int i = 1; i < pos - 1; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
           
        }
    }

}
