package com.company.day23;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

//        System.out.println("Is linkedList empty - " + linkedList.isEmpty());
//
//        System.out.println("The siz of linkedList = " + linkedList.size());

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

//        System.out.println("Is linkedList empty - " + linkedList.isEmpty());
//
//        System.out.println("The siz of linkedList = " + linkedList.size());

        System.out.println(linkedList.toString());

//        linkedList.add(0,8);
//
//        System.out.println(linkedList.toString());
//
//        int index = 4;
//        System.out.println("Get element " + index + " = " +linkedList.get(index));
//
//        linkedList.delete(0);
        linkedList.delete(2);

//        System.out.println("The siz of linkedList = " + linkedList.size());

        System.out.println(linkedList.toString());
    }
}
