package LinkedList;

public class MergeSortOnLL {
    class Node {
        int data ;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            newNode.next = null;
        }
        tail.next = newNode;
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
    private Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find Mid
        Node midNode = findMid(head);

        // left and right mergeSort
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head); // store head pointer in newleft
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        MergeSortOnLL ll = new MergeSortOnLL();
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(2);
        ll.addLast(4);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();


    }
}
