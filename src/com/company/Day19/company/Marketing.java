package com.company.Day19.company;

public class Marketing extends ItCompany{

    //Fields of Marketing class
    private String departmentName;

    //Constructor for Marketing class

    public Marketing(){

    }

    public Marketing(String departmentName) {
        this.departmentName = departmentName;
    }

    public Marketing(int countOfEmployers, String departmentName) {
        super(countOfEmployers);
        this.departmentName = departmentName;
    }

    //Getters and setters for fields of Marketing class

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    //Methods for Marketing class

    protected void marketing() {

        System.out.println("Marketing");;
    }
}
