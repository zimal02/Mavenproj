package com.zimal;

// Node class (represents each element)
class Node {
    int data;      // Data stored
    Node next;     // next pointer
    Node prev;     // previous pointer (optional)

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Linked list class
public class MyLinkedlist {
    Node head; // first node

    // Add node at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current; // for doubly link
    }

    // Print list
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Find middle node
    Node middleElement() {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Delete middle node
    void deleteMiddleElement() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;
        if (slow.next != null) {
            slow.next.prev = prev; // maintain prev link
        }
    }

    // Main method
    public static void main(String[] args) {

        MyLinkedlist list = new MyLinkedlist();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List:");
        list.printList();

        Node middle = list.middleElement();
        if (middle != null) {
            System.out.println("Middle Element: " + middle.data);
        }

        list.deleteMiddleElement();

        System.out.println("After Deleting Middle:");
        list.printList();
    }
}