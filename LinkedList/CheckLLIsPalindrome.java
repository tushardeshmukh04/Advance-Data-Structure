package LinkedList;

public class CheckLLIsPalindrome {
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data) {
        /* create new node */
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        /* newNode next = null; */
        tail.next = newNode;

        /* tail = newNode; */
        tail = newNode;
    }
    public Node findMid(Node head){
        // slow-fast approach
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next;  // +2
        }
        return slow ; // slow is a mid
    }

    public boolean checkPalindrome(){
        // base case
        if(head == null || head.next == null){
            return true;
        }
        // 1. find mid
        Node midNode = findMid(head);

        // 2. 2nd half reverse

        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head

        // 3. check left = right

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
    public static void main(String[] args){
        CheckLLIsPalindrome ll = new CheckLLIsPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }

}
