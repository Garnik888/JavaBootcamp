package com.company.day20.warrior;

public abstract class Warrior {

    private String name;
    private String type;
    private int power;
    private int health;

    public Warrior(){

    }

    public Warrior(String name, String type, int power, int health) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", power=" + power +
                ", health=" + health +
                '}';
    }

    public abstract void hit();
}
