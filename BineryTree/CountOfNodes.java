package BineryTree;

public class CountOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int lcount = countNode(root.left);
        int rcount = countNode(root.right);
        return lcount + rcount + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        System.out.println(countNode(root));
    }
}
