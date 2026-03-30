package com.zimal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedlist {

    Node head; // head of the linked list
    int size;

    // Node class
    class Node {
        int data;// value of node
        Node next;// reference to next node,

        Node(int data) { // constructor
            this.data = data;
            this.next = null;

        }
    }

    // Add node at the beginning
    void addFirst(int value) {
        Node newNode = new Node(value); // create new node

        if (head == null) { // if list is empty
            head = newNode;
            size++;
            return;
        }

        newNode.next = head; // link new node to current head
        head = newNode;// update head
        size++;

    }

    // Add node at the end
    void addLast(int value) {
        Node newNode = new Node(value); // create new node

        if (head == null) { // if list is empty
            head = newNode;
            size++;
            return;
        }

        Node current = head; // start from head

        while (current.next != null) { // move to last node
            current = current.next;
        }

        current.next = newNode; // attach new node at end
        size++;
    }

    //delete first node
    void deleteNode(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }
    //delete last node
    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.next==null){//if we have only one node
            head=null;
            size--;
            return;
        }
        Node secondlast=head;
        while (secondlast.next.next!=null){
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        size--;
    }
    // Print the linked list
    void printList() {
        if (head == null) { // check if empty
            System.out.println("List is empty");
            return;
        }

        Node current = head; // start from head

        while (current != null) { // traverse list
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null"); // end of list

    }
    void printSize(){
        System.out.println("size of list" + size);
    }

    // Main method
    public static void main(String[] args) {
        MyLinkedlist list = new MyLinkedlist(); // create list

        list.addFirst(1); // 1
        list.addFirst(2); // 2 -> 1
        list.addFirst(3); //3->2->1
        list.addLast(4);
        list.printList(); // print list
        list.deleteNode();
        list.printList();
        list.deleteLast();
        list.printList();
        list.printSize();
        //Built-in function
        LinkedList<String> set=new LinkedList(Arrays.asList("Waki","opee","toki"));
        System.out.println(set);
        set.remove();//remove first element
        System.out.println(set);
        set.add("sym");//add at last
        System.out.println(set);
        String sett=set.get(2);//what at 2index
        System.out.println(sett);
        boolean set1=set.contains("opee");//oppe exist?
        System.out.println(set1);
        set.add(3,"kiki");
        System.out.println(set);
        Collections.reverse(set);//reverse list
        System.out.println(set);


    }
}