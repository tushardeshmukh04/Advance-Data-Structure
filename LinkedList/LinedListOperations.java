package LinkedList;

public class LinedListOperations {
    class Node {
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

    // Add Operation

    // Add First
    public void addFirst(int data){
        /* Step1 - create new Node */
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        /* Step2 - newNode next = head; */
        newNode.next = head;

        /* Step3 = head = newNode */
        head = newNode;
    }
    // Add Last
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

    // Add middle

    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Print the linkedList

    public void print(){
        if(head == null){
            System.out.print("LinedList is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
         if(size == 0){
             System.out.println("LL is empty");
             return Integer.MIN_VALUE;
         } else if (size == 1) {
             int val = head.data;
             head = tail = null;
             size = 0;
             return  val;
         }
         int val = head.data;
         head = head.next;
         size--;
         return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return  val;
        }
        // prev = size - 2;
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        LinedListOperations ll = new LinedListOperations();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.addMiddle(2, 9);
        ll.print();
        System.out.println("size of linkedlist: " + size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("size of linkedlist: " + size);
    }
}
