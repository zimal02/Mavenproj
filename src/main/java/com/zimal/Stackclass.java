package com.zimal;
import java.util.Stack;

public class Stackclass {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push() → add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // peek() → top element
        System.out.println("Top element: " + stack.peek());

        // pop() → remove top element
        System.out.println("Removed element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // isEmpty() → check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // search() → position from top (1-based index)
        System.out.println("Position of 10: " + stack.search(10));
    }
}