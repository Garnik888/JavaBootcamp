package com.company.Day18.models;

public class Store {

    //Fields of Store class
    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private int [] numbers;

    //Constructor for Store class
    public Store(int countOfWorkers, String name, int phoneNumber, int[] numbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.numbers = numbers;
    }

    private Store(){

    }

    //Getters and setters for fields of Store class
    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    
}
