package com.company.day19.accounting;

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

    @Override
    public int account() {

        return taxOfCompany;
    }
}
