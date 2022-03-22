package com.company.day18.models;

public class Person {

    //Fields of Person class
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    //Constructor of Person class
    public Person(String firstName, String lastName, String passportId, int age, String gender, String nationality) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public Person() {

    }

    //Getters and setters for fields of Person class
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //Other methods for person class

    /**
     * This method print all information about person
     */
    public void display() {

        System.out.println("First Name is - " + firstName);
        System.out.println("Last Name is - " + lastName);
        System.out.println("Passport Id is - " + passportId);
        System.out.println("Age is - " + age);
        System.out.println("Gender is - " + gender);
        System.out.println("Nationality is - " + nationality);
    }
}

