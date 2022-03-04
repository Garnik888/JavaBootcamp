package com.company.day21.car;

public class Car {

    private final int year;
    private final String model;
    private final String mark;
    private final Engine engine;

    public Car(int year, String model, String mark, Engine engine) {

        this.year = year;
        this.model = model;
        this.mark = mark;
        this.engine = engine.copy();
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine.copy();
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }
}
