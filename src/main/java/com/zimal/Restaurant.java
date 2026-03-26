package com.zimal;
import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant {
    int salary;
    String worker;
    Restaurant(int salary,String worker){
        this.salary=salary;
        this.worker=worker;
    }
    public void useArrylist(){
        ArrayList<String> emplist= new ArrayList<>();
        emplist.add("Kavid(Chef)");
        emplist.add("salo(Manager)");
        emplist.add("qaolo(Waiter)");
        emplist.add(3,"gulam(waiter)");//add at indux 3
        emplist.remove(2);//remove element which indux number is 2
        emplist.add(2,"Romo(waiter)");//Add Romo at indux 2
        System.out.println("Arraylist of Employ"+ emplist);
        System.out.println(emplist.size());//size->check size of element
        System.out.println(emplist.get(2));//get->element on indux 2
        System.out.println(emplist.contains("Romo"));//contain->Romo exist in list or not?
        System.out.println(emplist.isEmpty());//isEmpty->Check list empty are not?
        for(String allPrint:emplist)//Print All Eelement
        {
            System.out.println(allPrint);
        }
        emplist.clear();//Clear All element


    }
    public void useLinkedlist(){
        LinkedList<String> order=new LinkedList<>();
        order.add("Order-01--Pizza");
        order.add("Order-02--Pasta");
        order.add("Order-03--Wrap");
        System.out.println("Linkedlist of order" + order);
        //if we want remove order-02
        System.out.println("get first order" + order.getFirst());
        System.out.println("Get last order" + order.getLast());
        int Index = 0;
        System.out.println("order at Index" + order.get(Index));
        System.out.println("check pasta exist?"+ order.contains("Order-02--Pasta"));
        System.out.println("size of list" +order.size());
        order.remove(1);//remove element at index 1 if exist
        order.clear();

    }
}