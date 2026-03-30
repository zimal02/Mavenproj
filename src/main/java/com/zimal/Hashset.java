package com.zimal;
import java.util.*;

class Hashset
//Features:
//Duplicate allow ❌
//Order ❌ (random hota hai)
//Fast (O(1))
    //like: unique IDs, emails check karna
{
    public static void main(String[] args) {
        HashSet<String> email= new HashSet<>();
        email.add("Ali@gmail.com");
        email.add("Baro@gmail.com");
        //email.add("Fati@gmail.com");//ignore
        email.add("qum@gmail.com");
        email.add("Fati@gmail.com");//print
        System.out.println(email);
        System.out.println("Fati@gmail.com is present?" + " " + email.contains("Fati@gmail.com"));
        System.out.println("Remove 'Fati@gmail.com'" + " " + email.remove("Fati@gmail.com"));
        System.out.println(email);
        for(String Email : email)//iterate
        {
            System.out.println(Email);
        }
        System.out.println("Size of email?" + " " + email.size());
        email.clear();
        System.out.println("Set is empty?" + " " + email.isEmpty());


    }
    }