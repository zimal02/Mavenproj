package com.zimal; // Package declaration

// Class representing a single node in the linked list
public class Node {
    int data;      // Data stored in this node
    Node next;// next-> is mandatory to traverse forward in the list
    Node prev;//allows backward traversal

    // Constructor to create a new node
    Node(int data) {
        this.data = data; // Initialize the data
        this.next = null; // Next is initially null
        this.prev=null;//pre Null
    }

}

