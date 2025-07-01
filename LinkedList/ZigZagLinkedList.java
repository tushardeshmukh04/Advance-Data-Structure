package LinkedList;

public class ZigZagLinkedList {
    class Node {
        int data ;
        Node next;
        Node(int data){
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
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void print(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    // Zig Zag LL implementation
    public void zigzag(){
        // find MidNode (slow fast approach)
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Alternate Merging
        Node rHead = prev;
        Node lHead = head;
        Node nextL;
        Node nextR;
        while(lHead != null && rHead != null){
            nextL = lHead.next;
            lHead.next = rHead;
            nextR = rHead.next;
            rHead.next = nextL;

            lHead = nextL;
            rHead = nextR;
        }
    }

    public static void main(String[] args){
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigzag();
        System.out.println();
        ll.print();
    }
}
