package com.zimal;
import java.lang.ref.SoftReference;
import java.security.Key;
import java.util.*; // Import all utility classes (HashMap, Map, etc.)

//Null Value → Multiple null allowed in both HashMap & LinkedHashMap,but key is unique

public class Hashmap {

    public static void main(String[] args) {


        HashMap<Integer, String> studentMap = new HashMap<>();//make empty bucket,default size=16,load vfector 0.75(full->rehash),totaly entries=16*0.75=12
        // fast access-
        // unorder
        // Key: Roll Number (unique)
        // Value: Student Name
        //when bucket size increase all bucket index recalculate: hashCode % 32

        //Add
        studentMap.put(101, "Ali");   //key=101->hashcode->suppose=37->bucket indux=37%16=5,101,Ali store in 5indux
        studentMap.put(107, "Sara");//key=102->hashcode->suppose=40->bucket indux=40%16=8,102,Sara store in 8indux
        studentMap.put(102, "Ahmed");//key=103->hashcode->suppose=37->bucket indux=37%16=5,101,Ali store in 5indux->collision occure(when two key produce same hashcode,store same bucket)
        studentMap.put(103, "Zara");

        //Print the whole map
        System.out.println("Student Map: " + studentMap);
        System.out.println("Student with Roll 103: " + studentMap.get(103));
        //Check if a key exists
        boolean hasKey = studentMap.containsKey(105);
        System.out.println("Is Roll 105 present? " + hasKey);
        //Remove a student
        studentMap.remove(103);
        System.out.println("After removing Roll 103: " + studentMap);
        //Update a value
        studentMap.put(104, "Zara Khan");
        System.out.println("After updating Roll 104: " + studentMap);
        System.out.println("size of map:" +" " + studentMap.size());
            //Sorting key
        Map<Integer,String> sorting=  new TreeMap<>(studentMap);
        System.out.println("Sort Keys " + sorting);
                    //Sorting values (1-convert to lsit 2-sort,3-store back
        List<Map.Entry<Integer, String>> list = new ArrayList<>(studentMap.entrySet());
        Collections.sort(list,(a,b) -> a.getValue().compareTo(b.getValue()));
        for(Map.Entry<Integer,String> entry: list){
            System.out.println(" print sorting values"+entry.getKey() + entry.getValue());
        }

        for(Integer key: studentMap.keySet())//use when check keys
        {
            System.out.println(key);

        }
        for(String value : studentMap.values())//use when check values
        {
            System.out.println(value);
        }

        for(Map.Entry<Integer, String> entry : studentMap.entrySet())//used when need both key or value
        {
            //System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }
        studentMap.clear();//remove all key-value
        System.out.println("studentmap is empty?" + studentMap.isEmpty());

        //for(String value : studentMap.values()){
         //   studentMap.putt(5,"kilom");// iterator fail-fast(modify the map while looping → program crashes
       // }

//n/N=k
 //n=no of nodes
 //N=no of indux/bucket

    }
}