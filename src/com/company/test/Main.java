package com.company.test;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer integer : list);

        System.out.println(list);
    }
}