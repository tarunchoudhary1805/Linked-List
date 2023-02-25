public class Node {
    Node head;

    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    Node(int data) {
        this.data = data;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }

    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = newNode;

        }
    }
    public void insertAtPostion(int pos, int data){
        Node newNode = new Node(data);
        if (pos == 1) insertAtBegin(data);
        else {
            Node cur = head;
            for(int i = 1 ; i< pos-1 && cur.next != null; i++){
               cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
        }
    }
    public void printLL() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " - > " );
            cur = cur.next;
        }

    }
    public void deleteAtBegin(){
        if(head.next == null) head = null;
        else {
            head = head.next;
        }
    }
    public void deleteAtEnd(){
        if(head.next == null) head = null;
        else {
            Node cur = head;
            while(cur.next.next != null){
                cur = cur.next;
            }
            cur.next = null;
        }
    }
    public void deleteAtPostion(int pos){
      if(pos == 1) deleteAtBegin();
      else {
        Node cur = head;
        for(int i=1;i<pos-1;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
      }
    }
}  