package com.company.Day5;

public class Employee {

    long id;
    String name;
    String department;
    int age;
    char gender;

    public Employee(String name, int age, char gender){

        this(0L, name, null, age, gender);
    }

    /**
     * All parameters constructor
     * @param id int type
     * @param name String type
     * @param department String type
     * @param age int type
     * @param gender char type
     */
    public Employee(long id, String name, String department, int age, char gender){

        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Print all information about employee
     */
    public void printInfo(){

        System.out.println("Employee information\nID - " + id + "\nName - " + name
               + "\nDepartment - " + department + "\nAge - " + age + "\nGender - " + gender + "\n");
    }



}
