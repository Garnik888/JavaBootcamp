package com.company.day19.accounting;

public class FinancialAccount extends TaxAccounting {


    private int salaryOfEmployees;

    //Constructors for FinancialAccount
    public FinancialAccount() {

    }

    public FinancialAccount(int salaryOfEmployees) {
        this.salaryOfEmployees = salaryOfEmployees;
    }

    public FinancialAccount(int countOfEmployers, String departmentName, int taxOfCompany, int salaryOfEmployees) {
        super(countOfEmployers, departmentName, taxOfCompany);
        this.salaryOfEmployees = salaryOfEmployees;
    }

    @Override
    public int account() {

        return salaryOfEmployees;
    }
}
