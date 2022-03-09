package com.company.day22.stack;

import com.company.day22.ParsInteger;

public class Main {

    public static void main(String[] args) {

        int [] arr = new int[DefaultStack.MAX_SIZE];

        DefaultStack defaultStack = new DefaultStack(arr);

        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());


        defaultStack.display();

        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());


        defaultStack.display();
    }
}
