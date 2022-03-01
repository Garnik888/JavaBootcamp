package com.company.Day18;

import com.company.Day18.models.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Test exercise 1 and 2
//        System.out.print("Your first name - ");
//        String firstname = scan.nextLine();
//        if (!PersonValidations.firstNameLength(firstname)) {
//
//            System.out.println("Your first name must be in range 3 to 15");
//        }
//
//        System.out.print("Your last name - ");
//        String lastname = scan.nextLine();
//        if (!PersonValidations.lastNameLength(lastname)) {
//
//            System.out.println("Your last name must be in range 6 to 20");
//        }
//
//        System.out.print("Your Passport ID - ");
//        String passportID = scan.nextLine();
//        if (!PersonValidations.passportIDValid(passportID)) {
//
//            System.out.println("Your passportId must be start with “AN” and contain 6 digits");
//        }
//
//        System.out.print("How old are you - ");
//        int age = scan.nextInt();
//        if (!PersonValidations.ageRange(age)) {
//
//            System.out.println("Your age must be in range 18 - 99");
//        }
//
//
//        System.out.print("Your gender (male or female) - ");
//        String gender = scan.next();
//        if (!PersonValidations.genderValid(gender)) {
//
//            System.out.println("Gender must be male or female");
//        }
//
//        System.out.print("Your nationality - ");
//        String nationality = scan.next();
//        System.out.println();
//
//
//        if (PersonValidations.firstNameLength(firstname) && PersonValidations.lastNameLength(lastname)
//                && PersonValidations.passportIDValid(passportID) && PersonValidations.ageRange(age)
//                && PersonValidations.genderValid(gender)) {
//
//            Person person = new Person(firstname, lastname, passportID, age, gender, nationality);
//
//            person.display();
//        }

        //Test exercise 3

        System.out.print("Side A - ");
        double sideA = scan.nextDouble();

        System.out.print("Side B - ");
        double sideB = scan.nextDouble();

        System.out.print("Side C - ");
        double sideC = scan.nextDouble();

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        triangle.check();

        System.out.println("Is triangle right triangle  - " + triangle.check(sideA, sideB, sideC));

        triangle.areaTriangleOrPerimeter(sideA, sideB, sideC);

    }
}
