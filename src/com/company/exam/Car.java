package com.company.exam;

import java.util.Objects;

public class Car {

    private int year;
    private String model;
    private String color;
    private Engine engine;

    public Car() {

    }

    public Car(int year, String model, String color, Engine engine) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int hashCode() {

        int result = 1;

        result *= 31 + (model == null ? 0 : model.hashCode());

        result *= 31 + engine.hashCode();

        result *= 31 + year;

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {

            return true;
        }

        if ((obj == null) || obj.getClass() != this.getClass()) {

            return false;
        }

        Car car = (Car) obj;

        return (this.year == car.year && Objects.equals(this.model, car.model)
                && Objects.equals(this.engine, car.engine)); //this.engine.equals(car.engine)
    }
}
