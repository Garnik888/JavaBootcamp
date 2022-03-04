package com.company.day21.car;

public class Main {

    public static void main(String[] args) {

        int year = 2009;

        Engine engine = new Engine(109,180, 2500);

        System.out.println(engine.toString());

        Car car = new Car(year, "Nissan", "Tiida", engine);

        System.out.println(car.toString());

        System.out.println();

        engine.setHorsePow(200);

        System.out.println(engine.toString());

        System.out.println(car.toString());

    }
}
