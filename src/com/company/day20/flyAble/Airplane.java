package com.company.day20.flyAble;

public class Airplane implements FlyAble{

    private boolean fly;

    public Airplane(boolean fly) {
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
