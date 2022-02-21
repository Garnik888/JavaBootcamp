package com.company.Day4;

import java.util.Scanner;

public class HomeworkDay4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Exercise 1
//        System.out.print("Import byte number - ");
//        byte numB = scan.nextByte();
//        scan.close();
//        wideningCast(numB);
//
//        //Exercise 2
//        System.out.print("Import double number - ");
//        double numD = scan.nextDouble();
//        scan.close();
//        narrowingCast(numD);
//
//        //Exercise3
//        System.out.print("Import float number - ");
//        float fahrenheit = scan.nextFloat();
//        scan.close();
//        convertFahrenheitToCelsius(fahrenheit);
//
//        //Exercise4
//        System.out.print("Import radius of circle - ");
//        double rad = scan.nextDouble();
//        scan.close();
//        calcCircleAreaPerimeter(rad);
//
//        //Exercise5
//        printResultInFloatDouble();
//
//        //Exercise6
//        printNameAndYer(1986);
//
//        //Exercise7
//        System.out.println("Import char symbol - ");
//        char symbol = scan.next().charAt(0);
//        System.out.println("Char - " + symbol + " = " + convertCharToIne(symbol) + " -  Integer");
//
//        //Exercise8
//        System.out.print("Impute Yor name - ");
//        String name = scan.next();
//        scan.close();
//        System.out.println(name + " - " + avrOfNameLetters(name) );
//
//        //Exercise9
//        System.out.print("Type integer in range 32 - 127 - ");
//        int number = scan.nextInt();
//        scan.close();
//        System.out.println("Integer " + number + " = " + convertIntegerToChar(number) +" char.");
//        //Exercise 10
//        System.out.println(concatString("Garnik ", "Vardanyan"));
//
//        //Exercise 11
//        concatStringOrInt("name", 10, 5);
//
//        //Exercise 12
//        String txt = "354684164168\rt\bWe are the so-called \"Vikings\" from the \nnorth.";
//        System.out.println(txt);

        //Exercise 14
        swapInt(17,84);

    }

    /**
     * Widening Primitive Conversion with print
     * @param numB byte type
     */
    public static void wideningCast(byte numB){
        System.out.println("Byte number = " + numB);

        short numS = numB;
        System.out.println("Short number = " + numS);

        int numI = numS;
        System.out.println("Integer number = " + numI);

        long numL = numI;
        System.out.println("Long number = " + numL);

        float numF = numL;
        System.out.println("Float number = " + numF);

        double numD = numF;
        System.out.println("Double number = " + numD);
    }

    /**
     *Narrowing Primitive Conversion with print
     * @param numD double type
     */
    public static void narrowingCast(double numD){

        System.out.println("Double number = " + numD);

        float numF = (float) numD;
        System.out.println("Float number = " + numF);

        long numL = (long) numF;
        System.out.println("Long number = " + numL);

        int numI = (int) numL;
        System.out.println("Integer number = " + numI);

        short numS = (short) numI;
        System.out.println("Short number = " + numS);

        byte numB = (byte) numS;
        System.out.println("Byte number = " + numB);
    }

    /**
     * Convert fahrenheit to Celsius and print
     * @param fahrenheit float type
     */
    public static void convertFahrenheitToCelsius(float fahrenheit){

        float celsius = (fahrenheit - 32) * 5/ 9;

        System.out.printf(" %f Fahrenheit = %f Celsius", fahrenheit, celsius);
        System.out.printf("\n %d Fahrenheit = %d Celsius", (int) fahrenheit, (int) celsius);
    }

    /**
     * Compute area  and perimeter of circle and print them
     * @param radius double type
     */
    public static void calcCircleAreaPerimeter(double radius) {

        double pi = Math.PI;
        System.out.println("Radios of circle = " + radius);

        double circleArea = pi * radius * radius;
        double circlePerimeter = 2 * pi * radius;

        System.out.println("Area of circle = " + circleArea + ".");
        System.out.println("Perimeter of circle = " + circlePerimeter + ".");

    }

    /**
     * This method print result 1/3 in float and double
     */
    public static void printResultInFloatDouble(){

        double numD = (double) 1/3 ;
        float numF = (float) 1/3 ;

        System.out.println("Double of 1/3 = " + numD);
        System.out.println("Float of 1/3 = " + numF);
    }

    /**
     * Print your Name and year of birth using only char primitive and int types
     * @param birthYer int type
     */
    public static void printNameAndYer(int birthYer){

        System.out.println("" + '(' + 'G' + 'a' + 'r' + 'n' + 'i' + 'k' + ' ' + birthYer + ')');
    }

    /**
     * Convert char type to integer type
     * @param symbol char type
     * @return int type
     */
    public static int convertCharToIne(char symbol){

        int numChar = symbol;

        return numChar;
    }

    /**
     * Parses your name letters as integers, calculate average of them
     * @param name String type
     * @return double type
     */
    public static double avrOfNameLetters(String name){
        int nameInt = 0;

        for(int i = 0; i < name.length(); i++){
            char nameChar = name.charAt(i);
            nameInt += nameChar;
        }

        double average = (double) nameInt/name.length();

        return average;
    }

    /**
     * Find char value corresponding to that int value
     * @param charNum int type
     * @return char type
     */
    public static char convertIntegerToChar(int charNum){

        return (char)charNum;
    }

    /**
     * Concat two string
     * @param firstVar String type
     * @param secondVar String type
     * @return String type
     */
    public static String concatString(String firstVar, String secondVar){

        return firstVar + secondVar;
    }

    /**
     * Output principles
     * @param firstVar String type
     * @param firstNum int type
     * @param secondNum int type
     */
    public static void concatStringOrInt(String firstVar, int firstNum, int secondNum){

        System.out.print("Integer + Integer - ");
        System.out.println(firstNum + secondNum);

        System.out.print("String + Integer + Integer - ");
        System.out.println(firstVar + firstNum + secondNum);

        System.out.print("Integer + Integer + String - ");
        System.out.println(firstNum + secondNum + firstVar);


    }

    /**
     * Swap to integer numbers
     * @param firstNum int type
     * @param secondNum int type
     */
    public static void swapInt(int firstNum, int secondNum){

        System.out.println("First number = " + firstNum + "\nSecond number = " + secondNum);

        firstNum = firstNum + secondNum;// a+b
        secondNum = firstNum - secondNum;//a+b-b=a
        firstNum = firstNum - secondNum;//a+b-a=b

        System.out.println("After swap.\nFirst number = " + firstNum + "\nSecond number = " + secondNum);
    }
}
