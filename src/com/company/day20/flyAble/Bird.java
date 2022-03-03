package com.company.day20.flyAble;

public class Bird implements flyAble{

    private boolean fly;

    public Bird(boolean fly) {
        this.fly = fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public boolean fly() {
        return fly;
    }
}
