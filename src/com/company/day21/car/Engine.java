package com.company.day21.car;

public class Engine {

    private int horsePow;
    private int mileage;
    private double weight;

    public Engine(int horsePow, int mileage, double weight) {
        this.horsePow = horsePow;
        this.mileage = mileage;
        this.weight = weight;
    }

    public Engine(Engine engine){

        this(engine.horsePow, engine.mileage, engine.weight);
    }

    public int getHorsePow() {
        return horsePow;
    }

    public void setHorsePow(int horsePow) {
        this.horsePow = horsePow;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Engine copy(){

        return new Engine(this);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePow=" + horsePow +
                ", mileage=" + mileage +
                ", weight=" + weight +
                '}';
    }
}
