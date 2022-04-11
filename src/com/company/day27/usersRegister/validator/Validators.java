package com.company.day27.usersRegister.validator;

public class Validators {

    public static boolean isAgeCorrect(int age) {

        if (age > 18 && age < 90) {

            return true;
        } else {

            System.out.println("Your age mast be high 18 or low 90");

            return false;
        }
    }

    public static boolean isNameSurnameCorrect(String str) {

        return str.matches("^\\+?[a-z, A-Z]{6,18}$");
    }
}
