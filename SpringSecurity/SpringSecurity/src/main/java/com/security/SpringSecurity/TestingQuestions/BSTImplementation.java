package com.security.SpringSecurity.TestingQuestions;

public class BSTImplementation {

    //create node
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    //insert into BST
    Node insert(Node root, int value){

        if(root == null){
            return new Node(value);
        }

        if(value < root.data){
            root.left = insert(root.left, value);
        } else if(value > root.data){
            root.right = insert(root.right, value);
        }
        return root;
    }

    //standard delete
    Node delete(Node root, int value){

        if(root == null){
            return null;
        }

        //search left
        if(value < root.data){
            root.left = delete(root.left, value);
        } else if(value > root.data){
            root.right = delete(root.right, value);
        } else{
            //case 1: No child
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2: Only right child
            if(root.left == null){
                return root.right;
            }
            //case 2: Only left child
            if(root.right == null){
                return root.left;
            }

            //case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //get leaf node
    void getLeafNodes(Node root, StringBuilder result){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            result.append(root.data).append(" ");
            return;
        }

        getLeafNodes(root.left, result);
        getLeafNodes(root.right, result);

    }

    public static void main(String[] args) {

    }
}
