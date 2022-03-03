package com.company.day20.warrior;

public class Shooter extends Warrior{
    public Shooter(String name, String type, int power, int health) {
        super(name, type, power, health);
    }

    @Override
    public String toString() {
        return "Shooter{" + super.toString() + "}";
    }

    @Override
    public void hit() {
        System.out.println(toString());
    }
}
