package com.company.Day19.company;

public class ItCompany {

    //Fields for ItCompany class
    private int countOfEmployers;
    private final String companyName = "ACA";

    //Constructor for ItCompany class
    public ItCompany(){

    }

    public ItCompany(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    //Getters and setters for fields of ItCompany class

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    //Methods for ItCompany class
    protected int account(){

        return 0;
    }
}
