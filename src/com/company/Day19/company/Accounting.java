package com.company.day19.company;

public class Accounting extends ItCompany{

    //Fields of Accounting class

    private  String departmentName;

    //Constructor for Accounting class

    public Accounting() {

    }

    public Accounting(String departmentName) {
        this.departmentName = departmentName;
    }

    public Accounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers);
        this.departmentName = departmentName;
    }

    //Getters and setters for fields of Accounting class

    //Methods for Accounting class
    @Override
    protected int account() {

        return 0;
    }
}
