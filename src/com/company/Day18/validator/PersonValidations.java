package com.company.Day18.validator;


public class PersonValidations {

    private PersonValidations() {

    }

    public static boolean firstNameLength(String firstName) {

        return (firstName != null && firstName.length() > 3 && firstName.length() < 15);
    }

    public static boolean lastNameLength(String lastName) {

        return (lastName != null && lastName.length() > 6 && lastName.length() < 20);
    }

    public static boolean ageRange(int age) {

        return (age >= 18 && age < 99);
    }

    public static boolean genderValid(String gender) {

        return (gender != null && "male".equalsIgnoreCase(gender) || "female".equalsIgnoreCase(gender));
    }

    public static boolean passportIDValid(String passportId) {

        return (passportId != null &&"AN".equalsIgnoreCase(passportId.substring(0, 2))
                && passportId.length() - 2 == 6);
    }
}
