package com.zimal;

// Main linked list class
public class MyLinkedlist {
    Node head; // Head of the list (first node)

    // add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node with data

        if (head == null) { // If list is empty
            head = newNode; // New node becomes head
            return;
        }

        Node current = head; // Start from head
        while (current.next != null) { // traverse nodes until reaching the last node.
            current = current.next;    // link the new node to the end
        }
        current.next = newNode; // Link last node to new node
    }

    // Method to print the linked list
    public void printList() {
        Node current = head; // Start from head
        System.out.print("Linked List: ");
        while (current != null) { // Traverse until end
            System.out.print(current.data + " -> "); // Print current node
            current = current.next; // Move to next node
        }
        System.out.println("null"); // Indicate end of list
    }
    // Find middle node using fast & slow pointers
    Node middleElement()//returns a reference to the middle node itself, not just its value.
    {
        if (head == null)// empty list → return null
            return null;
        Node slow=head;// slow pointer moves 1 step at a time
        Node fast=head;// fast pointer moves 2 steps at a time
        while (fast!=null && fast.next!=null)// loop until fast reaches end
        {
            slow=slow.next;// move slow 1 step
            fast=fast.next.next;// move fast 2 steps
        }
        return slow;


    }
    void deletemeddleElement(){
        if(head ==null || head.next==null){
            head=null;
        return;}
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while (fast!=null && fast.next!=null){

        }

    }

}



