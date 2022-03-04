package com.company.day21.polymorphism;

public class Dog extends Animal{

    protected String name;
    protected int age;


    //compile time polymorphism
    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age) {
        this.age = age;
    }


    //runtime polymorphism
    @Override
    protected void sound() {

        System.out.println("Dog");
    }
}
