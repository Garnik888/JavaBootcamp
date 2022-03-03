package com.company.day20.warrior;

public class Main {

    public static void main(String[] args) {

        Shooter shooter = new Shooter("Jon", "Cowboy", 12, 100);
        SwordsMen swordsMen = new SwordsMen("Atos", "Musketeers", 4, 80);

        shooter.hit();
        swordsMen.hit();
    }
}
