package com.company.Day19.company;

public class SMM extends Marketing {

    //Constructor for SMM class
    public SMM(){

    }

    public SMM(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    //Methods for SMM class

    @Override
    protected void marketing() {

        System.out.println("SMM");
    }
}
