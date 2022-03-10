package com.company.day20.flyAble;

public class Bird implements FlyAble{

    private boolean fly;

    public Bird(){}

    public Bird(boolean fly) {
        this.fly = fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    /**
     * is fly
     * @return boolean type
     */
    @Override
    public boolean fly() {
        return fly;
    }
}
