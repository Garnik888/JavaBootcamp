package com.company.day20.twoPackages;

import com.company.day20.twoPackages.abstractClass.Car;

public class SportCar extends Car {

    @Override
    protected void car() {
        System.out.println(this.type + "  " + this.engine);
    }
}
