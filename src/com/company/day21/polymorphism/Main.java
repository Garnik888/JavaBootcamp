package com.company.day21.polymorphism;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog(10);
        Dog dog2 = new Dog("Rex");
        Dog dog3 = new Dog("Rex", 10);

        dog1.sound();
    }
}
