package com.company.Day18;

public class StoreValidations {

    private StoreValidations(){

    }

    public static boolean isRangeCountOfWorkers(int countOfWorkers){

        return (countOfWorkers > 2 && countOfWorkers < 50);
    }

    public static boolean nameLength(String name) {

        return (name.length() > 3);
    }

    public static boolean phoneNumberLength(int phoneNumber){

        return (phoneNumber > 0 && phoneNumber / 10_000_000 < 10 && phoneNumber / 10_000_000 > 0);
    }
}
