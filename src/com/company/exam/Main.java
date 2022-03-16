package com.company.exam;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(109, 180, 200.2);
        Engine engine2 = new Engine(109, 180, 200.2);

        System.out.println(engine1.hashCode());
        System.out.println(engine2.hashCode());

        System.out.println(engine1.equals(engine2));
        System.out.println(engine2.equals(engine1));

        Car car1 = new Car(2009, "Nissan", "Gold", engine1);
        Car car2 = new Car(2009, "Nissan", "Gold", engine2);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));
    }
}
