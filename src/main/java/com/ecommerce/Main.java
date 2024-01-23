package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

//        for (String i: list){
//            System.out.println(i);
//        }

        System.out.println("get list = " + list);

//        System.out.println("get value at index [2] = " + list.get(2));
//        System.out.println("get value at index [1] = " + list.get(1));

//        System.out.println("remove value at index [2] = " + list.remove(2));
//        System.out.println("get list after remove at index [2] = " + list);

//        System.out.println("index of the number 2 is [" + list.indexOf("2") + "]");


//        list.add(2, "8");
//        System.out.println("after add new number at index [2] = " + list);

//        list.add(5, "9");
//        System.out.println("after add new number at index [5] = " + list);
//
//        list.clear();
//        System.out.println("after clear list = " + list);
//        System.out.println("check empty = " + list.isEmpty());

//        System.out.println("size of list = " + list.size());


        List<String> list1 = new ArrayList<>();

        list1.add("2");
        list1.add("3");
        list1.add("4");

//        list1.addAll(list);

//        System.out.println("get list 1 = " + list1);

//        System.out.println("after retain list 1 = " + list.retainAll(list1)); // retain = chỉ giữ lại những thằng mà list 1 có, còn lại delete
    }
}