package com.company.Day19.accounting;

public class Accounting {

    //Fields for Accounting class
    private int countOfEmployers;
    private String departmentName;

    //Constructors for Accounting class
    public Accounting(){

    }

    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    //Getters and setters for fields of Accounting class
    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int account(){

        return 0;
    }
}
