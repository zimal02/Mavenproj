package com.zimal;
import java.util.*;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList(Arrays.asList("Ali","Ahmad","Sara","Fajr"));
        System.out.println("Collection in arr is :" + arr);
        for(String arr1 : arr){
            System.out.println(arr1);
        }
        Collections.sort(arr);//show element in ascending order-,
        System.out.println("After Sorting :" + arr);
        System.out.println("size of arr" + arr.size());//size() method returns the number of elements present in the ArrayList
        //when element increase capacity automatically increase, default capacity 10
        Collections.sort(arr,Collections.reverseOrder());// sort the ArrayList in descending order we will use two methods Collections.reverseOrder() method and Collections.sort() method.
        System.out.println("Element in Descending order" + arr);
        arr.add("Faheem");//add new element
        arr.add(5,"Ali");//duplicate value
        System.out.println(arr);

        ArrayList<String> arr3=new ArrayList(Arrays.asList("Shafeeq","Rafeeq","Halem"));
        arr.addAll(arr3);//append collection(add other collection )
        System.out.println(arr);
        //insert all the Collection Elements at the Specified position in ArrayList
        arr.addAll(2,arr3);
        System.out.println(arr);
        arr.remove(1);//remove element at index 1
        System.out.println(arr);
        boolean ex=arr.remove("Sara");//remove sara then print true
        System.out.println(ex);
        System.out.println("After remove sara" +arr);
        Collections.reverse(arr);//Reverse All element
        System.out.println(arr);

    }
}