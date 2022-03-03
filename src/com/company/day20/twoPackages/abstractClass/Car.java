package com.company.day20.twoPackages.abstractClass;

public abstract class Car {

    protected String type;
    protected String engine;

    public Car(){

    }

    public Car(String type, String engine) {
        this.type = type;
        this.engine = engine;
    }

    protected abstract void car();

}
