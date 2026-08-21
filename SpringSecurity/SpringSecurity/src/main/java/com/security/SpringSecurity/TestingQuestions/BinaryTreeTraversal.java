package com.security.SpringSecurity.TestingQuestions;

//Write a function to traverse a binary tree and find the minimum value.
public class BinaryTreeTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    //find minimum element in the tree
    public static int findMin(Node root){

        //if tree is empty
        if(root == null){
            return Integer.MAX_VALUE;
        }

        //find minimum in left subtree
        int leftMin = findMin(root.left);

        //find minimum in right subtree
        int rightMin = findMin(root.right);

        //compare root, left and right
        return Math.min(root.data, Math.min(leftMin, rightMin));

    }

    //find maximum element in the tree
    public static int findMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.left = new Node(15);
        root.right.right = new Node(25);

        System.out.println("Minimum value : "+findMin(root));
        System.out.println("Maximum value : "+findMax(root));
    }
}
