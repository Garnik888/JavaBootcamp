package com.company.day24;

import com.company.day23.MyIntegerArrayList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        MyIntegerArrayList arrayList = new MyIntegerArrayList();

//        System.out.println("Size array list - " + arrayList.size());
//        System.out.println("Is array list empty - " + arrayList.isEmpty());

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

//        System.out.println("Size array list - " + arrayList.size());
//        System.out.println("Is array list empty - " + arrayList.isEmpty());
//        System.out.println(arrayList);

        arrayList.add(2, 3);

//        System.out.println("Size array list - " + arrayList.size());
//        System.out.println(arrayList);

        System.out.println(arrayList.size);

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }


//
//        int number = 40;
//        System.out.println("Return index of value - " + number + " = " + arrayList.indexOf(number));
//
//        arrayList.set(3 ,52);
//        System.out.println(arrayList);
//
//        int index = 0;
//        System.out.println("Get the list value in index " + index + " = " + arrayList.get(index));
//
//        arrayList.remove(5);
//
//        System.out.println("Size array list - " + arrayList.size());
//        System.out.println(arrayList);
//
//        int number = 4;
//        System.out.println("Have the list value " + number + " - " + arrayList.contains(number));
//
//        int number1 = 10;
//        System.out.println("Have the list value " + number1 + " - " + arrayList.contains(number1));
    }
}
