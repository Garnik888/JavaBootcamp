package com.company.day19.company;

public class FinancialAccount extends TaxAccounting{

    private short salaryOfEmployees;

    //Constructors for FinancialAccount
    public FinancialAccount() {

    }

    public FinancialAccount(short salaryOfEmployees) {
        this.salaryOfEmployees = salaryOfEmployees;
    }

    public FinancialAccount(int countOfEmployers, String departmentName, int taxOfCompany, short salaryOfEmployees) {
        super(countOfEmployers, departmentName, taxOfCompany);
        this.salaryOfEmployees = salaryOfEmployees;
    }

    //Getters and setters for fields of FinancialAccount class

    public int getSalaryOfEmployees() {
        return salaryOfEmployees;
    }

    public void setSalaryOfEmployees(short salaryOfEmployees) {
        this.salaryOfEmployees = salaryOfEmployees;
    }

    //Methods for FinancialAccount class
    @Override
    public int account() {

        return salaryOfEmployees;
    }
}
