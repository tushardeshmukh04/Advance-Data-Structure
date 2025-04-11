package LinkedList;



public class RemoveNthNodeFromLast {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data){
        /* create new node */
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        /* newNode next = null; */
        tail.next = newNode;

        /* tail = newNode; */
        tail = newNode;
    }
    public static void print(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteNthNodeFromLast(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if( n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromLast ll = new RemoveNthNodeFromLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.deleteNthNodeFromLast(3);
        ll.print();
    }

}
