package com.company.exam;

public class Engine {

    private int horsePow;
    private int mileage;
    private double weight;

    public Engine() {


    }

    public Engine(int horsePow, int mileage, double weight) {
        this.horsePow = horsePow;
        this.mileage = mileage;
        this.weight = weight;
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


    @Override
    public int hashCode() {

        int result = 1;
        result = result * 31 + horsePow;
        result = result * 31 + mileage;
        result = result * 31 + (int)weight;

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {

            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){

            return false;
        }

        Engine engine = (Engine) obj;

        return (this.horsePow == engine.horsePow && this.mileage == engine.mileage
                && this.weight == engine.weight);
    }
}
