package com.zimal;
public class Singletonpattern {

    // static -> only one instance for entire class,
    // private -> cannot be accessed directly from other classes,
    private static Singletonpattern obj; // singleton instance

    private String name = "Database"; // instance variable

    // private constructor -> prevents object creation from outside
    private Singletonpattern() {
        System.out.println("Connected to Database");
    }

    // synchronized -> thread-safe method
    public static synchronized Singletonpattern getInstance() {

        if (obj == null) { // create object only once
            obj = new Singletonpattern();
        }

        return obj; // return same instance every time
    }

    // method to display data
    public void display() {
        System.out.println("Print Name: " + name);
    }

    // main method
    public static void main(String[] args) {

        Singletonpattern sp1 = Singletonpattern.getInstance();
        Singletonpattern sp2 = Singletonpattern.getInstance();

        // check both references point to same object
        System.out.println(sp1 == sp2); // true

        sp1.display();
    }
}