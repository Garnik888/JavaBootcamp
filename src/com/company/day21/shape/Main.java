package com.company.day21.shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(7);

        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(5, 8);

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(square);
        shapes.add(circle);
        shapes.add(rectangle);

        System.out.println(shapes.get(0).getArea());
        System.out.println(shapes.get(0).getPerimeter());
        System.out.println();

        System.out.println(shapes.get(1).getArea());
        System.out.println(shapes.get(1).getPerimeter());
        System.out.println();

        System.out.println(shapes.get(2).getArea());
        System.out.println(shapes.get(2).getPerimeter());


    }
}
