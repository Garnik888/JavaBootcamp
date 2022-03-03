package com.company.day20.shape;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculate square area
     * @return double type
     */
    @Override
    protected double getArea() {
        return side * side;
    }

    /**
     * Calculate square perimeter
     * @return double type
     */
    @Override
    protected double getPerimeter() {
        return side * 4;
    }
}
