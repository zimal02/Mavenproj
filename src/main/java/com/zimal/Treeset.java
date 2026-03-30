package com.zimal;
import java.util.*;
public class Treeset
//TreeSet is a collection
//Duplicate allow dont allow ❌
//Data ko sorted (ascending order) me rakhta hai ✅
    //slower then hashset-but give sorted data
    //❌ Null mostly allow nahi (NullPointerException aa sakta hai)
{
    public static void main(String[] args){
        TreeSet<Integer> ids=new TreeSet<>();
        ids.add(1);
        ids.add(5);
        ids.add(2);
        ids.add(4);
        ids.add(3);
        System.out.println(ids);
        System.out.println("what first ids " + " " + ids.first());
        System.out.println("What last ids" + " " + ids.last()) ;
        ids.pollFirst();
        System.out.println(" After Remove 1st id" + " " + ids);
        ids.pollLast();
        System.out.println("After Remove last id" + " " + ids);
        System.out.println("Total size of ids:" + " " + ids.size());
        for(Integer Id : ids)//Iterate
        {
            System.out.println(Id);
        }
        System.out.println("Lower then 3" + " " + ids.lower(3) );// just smaller than 3
        System.out.println("Larger then 3" + " " + ids.higher(3));//just greater than 3
        System.out.println("Ceiling of 3" + " " + ids.ceiling(3));//>= 3
        System.out.println("floor of 3" + " " + ids.floor(3));//<= 3
        System.out.println("Descending order of id:" + " " + ids.descendingSet());//Rever set
        for(Integer Ids : ids.descendingSet()){
            System.out.println( Ids);//Reverse iterate

        }
        System.out.println("Small id" + " " + ids.headSet(3));//3sy chota
        System.out.println("large id" + " " + ids.tailSet(3));//3sy bhra
        System.out.println("Range of element" + " " + ids.subSet(2,4));//between 2include



    }
}
//🎯 Kab use karte hain?
//Jab sorted data chahiye
//like:
//marks list
//ranking system
//leaderboard
//auto-sorted IDs
//TreeSet internally Red-Black Tree use karta hai
//Har insert pe tree automatically balance hota hai
//Isliye hamesha sorted output milta hai