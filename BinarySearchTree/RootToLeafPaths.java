package BinarySearchTree;

import java.util.ArrayList;

public class RootToLeafPaths {
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
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0 ; i < path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        int[] values = {8,5,3,6,10,11,14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println();
        printRootToLeaf(root, new ArrayList<>());
    }
}
