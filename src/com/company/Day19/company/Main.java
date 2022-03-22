package com.company.day19.company;

import com.company.day19.company.Accounting;

public class Main {

    public static void main(String[] args) {

        FinancialAccount accounting = new FinancialAccount((short) 150);

        System.out.println(accounting.getSalaryOfEmployees());
    }
}
