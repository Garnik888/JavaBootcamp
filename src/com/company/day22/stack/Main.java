package com.company.day22.stack;

import com.company.day22.ParsInteger;

public class Main {

    public static void main(String[] args) {

        DefaultStack defaultStack = new DefaultStack();

        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());
        defaultStack.push(ParsInteger.parsInteger());


        defaultStack.display();

        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());
        defaultStack.display();
        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());


        defaultStack.display();
    }
}
