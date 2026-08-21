package com.security.SpringSecurity.TestingQuestions;

//implementing circular linked list
public class CircularLinkedList {

    //Node class
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    //Add node at the end
    public void add(int data){

        Node newNode = new Node(data);

        //if list is empty
        if(head == null){
            head = newNode;
            newNode.next = head;  //points to itself
            return;
        }
        Node temp = head;

        //find the last node
        while(temp.next != head){
            temp = temp.next;
        }

        //last node points to new node
        temp.next = newNode;

        //new node points back to head
        newNode.next = head;
    }

    //display the list
    public void display(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do{
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        } while(temp != head);{
            System.out.println("(back to head)");
        }

    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.display();
    }
}
