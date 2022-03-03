package com.company.day20.shape;

public class Main {

    public static void main(String[] args) {

        double radius = 5;
        double side = 5;

        Circle circle = new Circle(radius);
        Square square = new Square(side);

        System.out.printf("Area of circle = %.2f\n", circle.getArea());
        System.out.printf("Perimeter of circle = %.2f\n", circle.getPerimeter());

        System.out.println("Area of square = " + square.getArea());
        System.out.println("Perimeter of square = " + square.getPerimeter());
    }
}
