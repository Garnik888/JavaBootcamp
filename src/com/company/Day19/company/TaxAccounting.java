package com.company.Day19.company;

public class TaxAccounting extends Accounting {

    private int taxOfCompany;

    //Constructors for TaxAccounting

    public TaxAccounting() {
    }

    public TaxAccounting(int taxOfCompany) {
        this.taxOfCompany = taxOfCompany;
    }

    public TaxAccounting(int countOfEmployers, String departmentName, int taxOfCompany) {
        super(countOfEmployers, departmentName);
        this.taxOfCompany = taxOfCompany;
    }

    //Getters and setters for fields of FinancialAccount class

    public int getTaxOfCompany() {
        return taxOfCompany;
    }

    public void setTaxOfCompany(int taxOfCompany) {
        this.taxOfCompany = taxOfCompany;
    }

    //Methods for TaxAccounting class
    @Override
    public int account() {

        return taxOfCompany;
    }
}
