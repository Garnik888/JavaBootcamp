package com.company.day9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Exercise 1
//        System.out.print("Enter String 1 - ");
//        String str_1 = scan.next();
//        System.out.print("Enter String 1 - ");
//        String str_2 = scan.next();
//        stringVariablesCompare(str_1, str_2);
//
//        //Exercise 2
//        String str_3 = "123456";
//        String str_4 = new String();
//        str_4 = str_3;
//        stringVariablesCompare(str_3, str_4);
//
//        //Exercise 3
//        System.out.print("Enter number - ");
//        int n = scan.nextInt();
//        useTernaryOperator(n);
//
//        //Exercise 4
//        System.out.print("Enter number  1 - ");
//        int a = scan.nextInt();
//        System.out.print("Enter number  2 - ");
//        int b = scan.nextInt();
//        useTernaryOperMaxNumber(a, b);
//
//        //Exercise 5
//        System.out.print("Enter number - ");
//        int a = scan.nextInt();
//        useTernaryOperABSNumber(a);
//
//        //exercise 6
//        useTernaryOperatorForString("");
//
//        //Exercise 7
//        System.out.print("Enter number  1 - ");
//        int a = scan.nextInt();
//        System.out.print("Enter number  2 - ");
//        int b = scan.nextInt();
//        System.out.print("Enter number  3 - ");
//        int c = scan.nextInt();
//        useTernaryOperThreeMaxNumber(a, b, c);
//
//        //Exercise 9
//        System.out.println("What is the correct way to declare a variable to store " +
//                "an integer value in Java?\n" +
//                "   a. int 1x=10;\n" +
//                "   b. int x=10;\n" +
//                "   c. float x=10.0f;\n" +
//                "   d. string x=\"10\";\n");
//        System.out.print("Enter your choice:  ");
//        char ch = scan.next().charAt(0);
//        correctAnswerAQuestion(ch);
//
//        //Exercise 10
//        System.out.print("Enter a latter to check Vowel or Consonant - ");
//        char ch = scan.next().charAt(0);
//        isTheLetterVowelOrConsonant(ch);
//
//        //Exercise 11
//        System.out.print("Enter a number from 0 to 9  - ");
//        char ch = scan.next().charAt(0);
//        pressNumber(ch);
//
//        //Exercise 12
//        System.out.print("Enter a number  - ");
//        int number = scan.nextInt();
//        switchOddEven(number);
//
//        //Exercise 13
//        System.out.print("Enter a first number  - ");
//        double firstNum = scan.nextDouble();
//        System.out.print("Enter operator (+, -, / or *)  - ");
//        char operator = scan.next().charAt(0);
//        System.out.print("Enter a second number  - ");
//        double secondNum = scan.nextDouble();
//        miniCalculator(firstNum, secondNum, operator);
//
//        //Exercise 14
//        System.out.print("Enter a week day name  - ");
//        String weekDay = scan.next().toLowerCase(Locale.ROOT);
//        numberOfWeekDay(weekDay);

        testScore(39, 40, 40);


    }

    /**
     * Which has 2 String variables
     * -Compare them with == assignment
     * -Compare them with equals to
     *
     * @param str_1 String type
     * @param str_2 String type
     */
    public static void stringVariablesCompare(String str_1, String str_2) {

        System.out.println("Str_1 == Str_2 -  " + (str_1 == str_2));
        System.out.println("Str_1 equals Str_2 -  " + (str_1.equals(str_2)));
    }

    /**
     * Use ternary operator for print is the int number negative or positive
     *
     * @param n int type
     */
    public static void useTernaryOperator(int n) {

        System.out.println((n >= 0) ? "n is positive" : "n is negative");
    }

    /**
     * Use ternary operator for print is the int number negative
     * or positive or equal 0
     *
     * @param n int type
     */
    public static void useDubleTernaryOperator(int n) {

        System.out.println((n >= 0) ? (n == 0) ? "n is zero" : "n is positive" : "n is negative");
    }

    /**
     * Use ternary operator for print max number of two enter numbers
     *
     * @param a int type
     * @param b int type
     */
    public static void useTernaryOperMaxNumber(int a, int b) {

        System.out.printf("The max number of %d and %d - %d", a, b, a > b ? a : b);
    }

    /**
     * Use ternary operator for print module number of enter number
     *
     * @param a int type
     */
    public static void useTernaryOperABSNumber(int a) {

        System.out.printf("The number %d module = %d", a, a < 0 ? -a : a);
    }

    /**
     * Use ternary operator for print is the String
     * - a null so return -1
     * - if given String is  “ ” return  0
     * - else return 1
     *
     * @param str String type
     */
    public static void useTernaryOperatorForString(String str) {

        System.out.println((str != null) ? (str != "") ? 1 : 0 : -1);
    }

    /**
     * Use ternary operator for print max number of two enter numbers
     *
     * @param a int type
     * @param b int type
     * @param c int type
     */
    public static void useTernaryOperThreeMaxNumber(int a, int b, int c) {

        System.out.printf("The max number of %d, %d and %d - %d", a, b, c,
                a > b || b < c ? a > c || b > c ? a : c : b);
    }

    /**
     * choose the correct answer of a question.
     * If  choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalid choice”.
     *
     * @param ch char type
     */
    public static void correctAnswerAQuestion(char ch) {

        switch (ch) {
            case 'a':
            case 'c':
            case 'd':
                System.out.println("Invalid choice");
                break;
            case 'b':
                System.out.println("Congratulation");
                break;

            default:
                System.out.println("There is no such answer");

        }

    }

    /**
     * Check Vowel or Consonant
     *
     * @param ch char type
     */
    public static void isTheLetterVowelOrConsonant(char ch) {

        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'v':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'V':
            case 'Y':
                System.out.println("" + ch + " is  a Vowel");
                break;
            default:
                System.out.println("" + ch + " is  a Consonant ");


        }
    }

    /**
     * Press number 0-9
     *
     * @param ch char type
     */
    public static void pressNumber(char ch) {

        switch (ch) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.printf("You pressed number - %s", ch);
                break;
            default:
                System.out.println("Not allowed");
        }
    }

    /**
     * Print is the number odd or even
     *
     * @param number int type
     */
    public static void switchOddEven(int number) {

        switch (number % 2) {

            case 0:
                System.out.printf("The %d number is even.", number);
                break;
            case 1:
                System.out.printf("The %d number is odd.", number);
                break;
        }
    }

    /**
     * Mini calculator for two int numbers
     *
     * @param firstNum  int type
     * @param secondNum int type
     * @param operator  char type
     */
    public static void miniCalculator(double firstNum, double secondNum, char operator) {

        switch (operator) {

            case '+':
                System.out.printf("%,.1f %s %,.1f = %,.1f", firstNum, operator,
                        secondNum, firstNum + secondNum);
                break;
            case '-':
                System.out.printf("%,.1f %s %,.1f = %,.1f", firstNum, operator,
                        secondNum, firstNum - secondNum);
                break;
            case '/':
                if (secondNum != 0) {
                    System.out.printf("%,.1f %s %,.1f = %,.1f", firstNum, operator,
                            secondNum, firstNum / secondNum);
                }
                break;
            case '*':
                System.out.printf("%,.1f %s %,.1f = %,.1f", firstNum, operator,
                        secondNum, firstNum * secondNum);
                break;
            default:
                System.out.println("Not valid operator");
        }
    }

    /**
     * Print week dey number
     *
     * @param weekDay String type
     */
    public static void numberOfWeekDay(String weekDay) {

        switch (weekDay) {

            case "monday":
                System.out.printf("Monday is a %d day", 1);
                break;
            case "tuesday":
                System.out.printf("Tuesday is a %d day", 2);
                break;
            case "wednesday":
                System.out.printf("Wednesday is a %d day", 3);
                break;
            case "thursday":
                System.out.printf("Thursday is a %d day", 4);
                break;
            case "friday":
                System.out.printf("Friday is a %d day", 5);
                break;
            case "saturday":
                System.out.printf("Saturday is a %d day", 6);
                break;
            case "sunday":
                System.out.printf("Sunday is a %d day", 7);
                break;
            default:
                System.out.println("Incorrect week day name");
        }
    }

    /**
     * Print grade a test
     *
     * @param quiz       int type
     * @param midTerm    int type
     * @param finalScore int type
     */
    public static void testScore(int quiz, int midTerm, int finalScore) {
        int average = (quiz + midTerm + finalScore) / 3;

        switch (average / 20) {

            case 4:
            case 5:
                System.out.println("Your grade is A.");
                break;
            case 3:
                System.out.println("Your grade is B.");
                break;
            case 2:
                System.out.println("Your grade is C.");
                break;
            case 0:
            default:
                System.out.println("Your grade is F.");
        }
    }

}
