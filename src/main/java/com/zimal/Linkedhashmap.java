package com.zimal;
import java.util.LinkedHashMap;
import java.util.Map;//LinkedHashmap
// order preserve-,slow due †ø order maintained
//1null key allow,multiple null value
//LinkedHashMap = HashMap + doubly linked list
//HashMap part → stores key-value pairs in buckets based on hashCode
//Result → fast access + insertion order maintained
//Doubly Linked List part->Every entry also has prev and next pointer,Keeps track of insertion order
public class Linkedhashmap{
    public static void main(String[] args){
        LinkedHashMap<Integer, String> user = new LinkedHashMap<>();
        user.put(01, "Wasim");
        user.put(02, "sara");
        user.put(03,"ali");
        System.out.println(user);
        System.out.println("get value:" + user.get(01));//You know the key and want its value
        System.out.println("Exist..?" + user.containsValue("sara"));
        //System.out.println("get key" + user.get("ali"));//The hashing mechanism is designed to find value by key, not key by value
        System.out.println(user.keySet());//Returns all keys as a Set
        System.out.println(user.values());//Returns all values as a Collection
        System.out.println(user.entrySet());
        for(Map.Entry<Integer,String> entry : user.entrySet())
        // for-each loop: used to iterate (visit) each element one by one
        // : means "for each" Read: for each entry in user.entrySet()
        // students.entrySet()->returns all key-value pairs from the map as a Set
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
            // entry.getKey() → gets the key from current entry
            //entry.getValue() → gets the value from current entry

        }

    }
    //when used?
    //Jab order important ho, jaise reports ya forms me data dikhana.
    //Jab cache banani ho (recently used items track karna).
    //Jab key unique ho aur order maintain karna ho.


        }