package com.company.day21.animal_exercis3;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Simba", 2);

        System.out.println(cat.name + "  " + cat.age);

        cat.sound();

        Animal animal = new Cat("Murzik", 5);

        System.out.println(animal.name + "  " + animal.age);

        animal.sound();
    }
}
