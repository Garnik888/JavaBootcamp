package com.company.day21.animal_exercis3;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    protected abstract void sound();
}
