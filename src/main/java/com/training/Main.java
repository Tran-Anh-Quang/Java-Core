package com.training;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("Bài tập ArrayList:");
        System.out.println("============================================");

        List<String> list = new java.util.ArrayList<>();

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


        List<String> list1 = new java.util.ArrayList<>();

        list1.add("2");
        list1.add("3");
        list1.add("4");

//        list1.addAll(list);

        System.out.println("get list 1 = " + list1);

//        System.out.println("after retain list 1 = " + list.retainAll(list1)); // retain = chỉ giữ lại những thằng mà list 1 có, còn lại delete

        System.out.println("============================================");
        System.out.println("Bài tập LinkedList:");
        System.out.println("============================================");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Một");
        linkedList.add("Hai");
        linkedList.add("Ba");
        linkedList.add("Bốn");
        linkedList.add("Năm");

        System.out.println(linkedList);

//        linkedList.add(5, "Sáu");
//        System.out.println("After add new value at index [5] = " + linkedList);

//        linkedList.addFirst("Không");
//        System.out.println("after add first a new value = " + linkedList);

//        linkedList.addLast("Sáu");
//        System.out.println("after add last a new value = " + linkedList);

//        System.out.println("get first = " + linkedList.getFirst());
//        System.out.println("get last = " + linkedList.getLast());

//        System.out.println("size of linked list = " + linkedList.size());

//        if (linkedList.contains("Một")){
//            System.out.println("Có chứa nha");
//        }else{
//            System.out.println("Không có nha");
//        }

//        System.out.println(linkedList.remove()); // auto delete thằng đầu tiên nếu không truyền index
//        System.out.println(linkedList.remove(4));

//        System.out.println(linkedList.indexOf("Ba"));
//        System.out.println(linkedList.lastIndexOf("Bốn"));

        System.out.println("============================================");
        System.out.println("Bài tập Vector:");
        System.out.println("============================================");

        Vector<String> vector = new Vector<>();

        vector.add("Sáu");
        vector.add("Bảy");
        vector.add("Tám");
        vector.add("Chín");
        vector.add("Mười");

        System.out.println(vector);

//        vector.add(5, "Mười một");
//        System.out.println("after add new value at index [5] = " + vector);

//        vector.clear();
//        System.out.println("after clear = " + vector);

//        System.out.println(vector.contains("Mười"));

//        System.out.println(vector.indexOf("Tám"));

//        System.out.println("get index [2] = " + vector.get(2));


        Vector<String> vector1 = new Vector<>();

        vector1.add("Tám");
        vector1.add("Chín");

//        vector1.addAll(vector);
//        System.out.println(vector1);

//        vector1.addElement("Mười");
//        System.out.println(vector1);

//        System.out.println("after retain vector 1 = " + vector.retainAll(vector1));

        System.out.println("============================================");
        System.out.println("Bài tập Vector:");
        System.out.println("============================================");

        Queue<String> queue = new LinkedList<>();

        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.add("7");

        System.out.println(queue);

//        System.out.println(queue.offer("1"));
//        System.out.println(queue.remove());

//        queue.clear();
//        System.out.println(queue.poll());

//        System.out.println(queue.element());

//        queue.clear();
//        System.out.println(queue.peek());

    }
}