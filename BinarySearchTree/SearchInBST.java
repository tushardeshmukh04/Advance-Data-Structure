package BinarySearchTree;

public class SearchInBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // Left SubTree
            root.left = insert(root.left, val);
        } else {
            // Right SubTree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        } else if(root.data > val){
            return search(root.left, val);
        } else{
            return search(root.right, val);
        }
    }
    public static void main(String[] args) {
        int[] values = {5, 1, 3 ,4, 2, 7};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        System.out.println(search(root, 4));
    }
}
