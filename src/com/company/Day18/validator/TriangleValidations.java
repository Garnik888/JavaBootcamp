package com.company.day18.validator;

public class TriangleValidations {

    /**
     * Is trinagle side siz is valid
     * @param sideA double type
     * @param sideB double type
     * @param sideC double type
     * @return boolean type
     */
    public static boolean rangeTriangleSizeValidations(double sideA, double sideB, double sideC){

        return (sideA > 1 && sideA < 20 && sideB > 1 && sideB < 20 && sideC > 1 && sideC < 20);
    }
}
