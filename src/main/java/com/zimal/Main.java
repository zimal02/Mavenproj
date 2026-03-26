package com.zimal;//class belongs to folder com.zimal


public class Main {

    public static void main(String[] args) {

        UserLogger userLogger = new UserLogger();
        // Create instance of UserLogger to call non-static methods

        // Test logging multiple users
        userLogger.logUser("Alice", "mySecret123", "alice@example.com", "9876543210");
        userLogger.logUser("Bob", "pass123", "bob@gmail.com", "12345");

        System.out.println("Users processed. Check logs in logs/user.log");
        // Print confirmation to console


        // Main method to test linked list

            MyLinkedlist list = new MyLinkedlist(); // Create linked list

            // Add elements
            list.add(10); // Add first element
            list.add(20); // Add second element
            list.add(30);// Add third element
            // Print the list
        System.out.println(list);



    }
}