package com.company.Day18.models;

public class Triangle {

    // Fields Triangle class
    private double sideA;
    private double sideB;
    private double sideC;

    //Constructors Triangle class
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private Triangle() {

    }

    //Getters and setters for fields of Triangle class
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    //Methods Triangle class

    /**
     * Is triangle is valid
     *
     * @return boolean type
     */
    private boolean isTriangleValid() {

        return (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB);
    }

    /**
     * Print is the triangle valid
     */
    public void check() {

        if (isTriangleValid()) {

            System.out.println("Valid triangle");
        } else {

            System.out.println("Invalid triangle");
        }
    }

    /**
     * Is the triangle right triangle
     *
     * @param sideA double type
     * @param sideB double type
     * @param sideC double type
     * @return boolean type
     */
    public boolean check(double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        return (Math.sqrt(sideB * sideB + sideA * sideA) == sideC ||
                Math.sqrt(sideB * sideB + sideC * sideC) == sideA ||
                Math.sqrt(sideC * sideC + sideA * sideA) == sideB);
    }

    /**
     * If triangle is right triangle return triangle area
     * else return triangle perimeter
     *
     * @param sideA double type
     * @param sideB double type
     * @param sideC double type
     * @return double type
     */
    public void areaTriangleOrPerimeter(double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        double areaTriangle = 0;
        double perimeterTriangle = 0;

        if (check(sideA, sideB, sideC)) {

            if (sideA > sideB) {

                if (sideA < sideC) {

                    areaTriangle = (sideB * sideA) / 2;
                } else {

                    areaTriangle = (sideB * sideC) / 2;
                }
            } else if (sideB > sideC) {

                areaTriangle = (sideC * sideA) / 2;
            } else {

                areaTriangle = (sideB * sideA) / 2;
            }

            System.out.println("The right triangle area = " + areaTriangle);
        } else {

            perimeterTriangle = sideA + sideB + sideC;

            System.out.println("The triangle perimeter = " + perimeterTriangle);
        }
    }
}
