public class SinglyLinkedList {

    public Node head = null ;

    public class Node {
        private int data ;
        private Node next ;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addNodeAtTheBeginning(int val){
        Node nn = new Node(val) ;

        if (this.head != null) {
            nn.next = this.head;
        }
        this.head = nn ;
    }

    public void printSinglyLL(){

        if(this.head == null){
            System.out.println("Linked list is empty");
        }else {
            Node tn = this.head ;
            while(tn!=null){
                System.out.println(tn.data);
                tn = tn.next ;
            }
        }


    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList() ;
        linkedList.addNodeAtTheBeginning(10);
        linkedList.addNodeAtTheBeginning(20);
        linkedList.printSinglyLL();
    }
}

/* OUTPUT:
* 20
*10
* */