package BinarySearchTree;

public class MirrorOfBST {
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
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int[] values = {5, 1, 3 ,4, 2, 7};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        root = createMirror(root);
        preorder(root);
    }
}
