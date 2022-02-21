package com.company.Day5;

public class Person {
    String name;
    int age;
    String address;

    static int count;

    /**
     * No argument constructor by default
     */
    public Person(){

        this(null, 0, null);
    }

    /**
     * All arguments constructor
     * @param name String type
     * @param age int type
     * @param address String type
     */
    public Person(String name, int age, String address){

        this.name = name;
        this.age = age;
        this.address = address;
        this.count ++;

    }

    /**
     * Print all information about person
     */
    public void printInfo(){

        System.out.println("Person information \nName - " + this.name + "\nAge - " + this.age
                + "\nAddress - " + this.address + "\n");
    }
}
