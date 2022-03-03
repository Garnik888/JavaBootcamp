package com.company.day20.shape;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculate circle area
     * @return double type
     */
    @Override
    protected double getArea() {
        return PI * radius * radius;
    }

    /**
     * Calculate circle perimeter
     * @return double type
     */
    @Override
    protected double getPerimeter() {
        return 2 * PI * radius;
    }


}
