package com.company.Day19.company;

public class SEO extends Marketing{

    //Constructor for SMM class
    public SEO(){

    }

    public SEO(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    //Methods for SMM class

    @Override
    protected void marketing() {

        System.out.println("SEO");
    }
}
