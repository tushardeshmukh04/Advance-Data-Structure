import BinarySearchTree.BuildATree;

public class ValidateBST {
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
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static  boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int[] values = {5, 1, 3 ,4, 2, 7};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println();
        if(isValidBST(root, null, null)){
            System.out.println("is valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
