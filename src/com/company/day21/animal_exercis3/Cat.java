package com.company.day21.animal_exercis3;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected void sound() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
