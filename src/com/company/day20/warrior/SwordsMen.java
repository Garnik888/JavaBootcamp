package com.company.day20.warrior;

public class SwordsMen extends Warrior{

    public SwordsMen(String name, String type, int power, int health) {
        super(name, type, power, health);
    }

    @Override
    public String toString() {
        return "SwordsMen{" + super.toString() + "}";
    }

    @Override
    public void hit() {
        System.out.println(toString());
    }
}
