import java.util.*; // Import all utility classes (HashMap, Map, etc.)

public class MapInterface {

    public static void main(String[] args) {

        //Create a Map to store Roll Number (Integer) → Student Name (String)
        Map<Integer, String> studentMap = new HashMap<>();
        // HashMap is used for fast access and unordered storage
        // Key: Roll Number (unique)
        // Value: Student Name

        //Add elements to the Map
        studentMap.put(101, "Ali");   // put(key, value) adds a new entry
        studentMap.put(102, "Sara");
        studentMap.put(103, "Ahmed");
        studentMap.put(104, "Zara");

        //Print the whole map
        System.out.println("Student Map: " + studentMap);
        // Automatically prints key-value pairs

        //Access a value by key
        String studentName = studentMap.get(102);
        // get(key) returns value for that key
        System.out.println("Student with Roll 102: " + studentName);

        //Check if a key exists
        boolean hasKey = studentMap.containsKey(105);
        // containsKey(key) returns true/false
        System.out.println("Is Roll 105 present? " + hasKey);

        //Remove a student
        studentMap.remove(103);
        // remove(key) deletes the entry with that key
        System.out.println("After removing Roll 103: " + studentMap);

        //Iterate over Map
        System.out.println("All Students:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            // entrySet() returns set of key-value pairs
            System.out.println("Roll: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        //Update a value
        studentMap.put(104, "Zara Khan");
        // put() with existing key updates the value
        System.out.println("After updating Roll 104: " + studentMap);
    }
}