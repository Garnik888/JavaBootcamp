package com.company.Day10;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //System.out.println(8&8-1);

        Scanner scan = new Scanner(System.in);

//        //Test exercise 1
//        printAllIntNumbers(1, 10);
//
//        //Test exercise 2
//        printAllEvenNumbers(1, 20);
//
//
//        //Test exercise 3
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printSquares(number);
//
//        //Test exercise 4
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printSmallestNaturalDivisor(number);
//
//        //Test exercise 5
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printAllPowerNumberOfTwo(number);
//
//        //Test exercise 6
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printAllIntNumbersDescendingOrder(number);
//
//        //Test exercise 7
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printAllMultiplyNumbersForTwo(number);
//
//        //Test exercise 8
//        printCountInput();
//
//        //Test exercise 9
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printSmallestMultiplyOfTwo(number);
//
//        //Test exercise 10
//        printTheTableOfCharacters();
//
//        //Test exercise 11
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printAllNumberExceptMultiplyThree(number);
//
//        //Test exercise 12
//        System.out.print("Enter integer number - ");
//        int number = scan.nextInt();
//        printIsTheNumberFibonacci(number);
//
//        //Test exercise 13
//        System.out.print("Enter athlete speed  - ");
//        double speed = scan.nextDouble();
//        System.out.print("Enter mileage  speed  - ");
//        double mileage  = scan.nextDouble();
//        printRunDays(speed, mileage);
//
//        //Test exercise 14
//        System.out.print("Enter deposit  - ");
//        int deposit = scan.nextInt();
//        System.out.print("Enter percent  - ");
//        int percent = scan.nextInt();
//        System.out.print("Enter contribution  - ");
//        int contribution = scan.nextInt();
//
//        int year = contributionYear(deposit, percent, contribution);
//        System.out.printf("You mast wait %d year", year);
//
//        //Test exercise 15
//        System.out.println("The second larges number = " + secondLargesNumber());
//
//        //Test exercise 16
//        findNumber();

        //Test exercise 17
        System.out.print("Enter number  - ");
        int number = scan.nextInt();
        System.out.println("Digits sum of number + " + number
        + " = " + sumDigit(number));


    }

    //Exercise 1

    /**
     * Print all integer number in between given numbers
     *
     * @param fromNum tnt type
     * @param toNum   int type
     */
    public static void printAllIntNumbersAscendingOrder(int fromNum, int toNum) {

        while (true) {

            if (fromNum > toNum) {

                break;
            }

            System.out.print(fromNum + ", ");

            fromNum++;
        }
    }

    //Exercise 2

    /**
     * Print all even integer number in between given numbers
     *
     * @param fromNum int type
     * @param toNum   int type
     */
    public static void printAllEvenNumbers(int fromNum, int toNum) {

        while (fromNum <= toNum) {

            if (fromNum > toNum) {

                break;
            }
            if (fromNum % 2 == 0) {

                System.out.print(fromNum + ", ");
            }

            fromNum++;
        }
    }

    //Exercise 3

    /**
     * Print all exact squares of natural
     * numbers that are not
     * exceeding a given positive integer
     *
     * @param number int type
     */
    public static void printSquares(int number) {
        int sqr = 1;
        if (number > 0) {

            while (true) {

                if (sqr * sqr > number) {

                    break;
                }

                System.out.println(sqr * sqr);

                sqr++;
            }
        } else {

            System.out.println("You mast enter positive number!!!");
        }


    }

    //Exercise 4

    /**
     * Find and print the
     * smallest natural divisor other
     * than 1 for a given number
     *
     * @param number int type
     */
    public static void printSmallestNaturalDivisor(int number) {
        int div = 2;
        if (number > 2) {

            while (true) {

                if (number % div == 0) {

                    System.out.printf("The small natural divisor for %d = %d", number, div);

                    break;
                }

                div++;
            }

        } else {

            System.out.println("Enter number greater than 2!!!");
        }
    }

    //Exercise 5

    /**
     * Print all integer powers of two not exceeding number in ascending
     * order
     *
     * @param number int type
     */
    public static void printAllPowerNumberOfTwo(int number) {

        int power = 1;

        while (true) {

            if (power > number) {
                break;
            }

            System.out.print(power + ", ");

            power *= 2;// power  = power << 1;
        }
    }

    //Exercise 6

    /**
     * Print all integers in descending order.
     *
     * @param number int type
     */
    public static void printAllIntNumbersDescendingOrder(int number) {

        while (true) {

            if (number < 1) {

                break;
            }

            System.out.print(number + ", ");

            number--;
        }
    }

    //Exercise 7

    /**
     * For a given integer number, print all integers that are
     * multiple of 2 in descending order.
     *
     * @param number int type
     */
    public static void printAllMultiplyNumbersForTwo(int number) {

        while (true) {
            if (number < 2) {

                break;
            }

            if ((number & number - 1) == 0) {//do it

                System.out.print(number + ", ");
            }

            number -= 1;
        }
    }

    //Exercise 8

    /**
     * Input N natural number till N would be the exact power of 2.If N is
     * the exact power of 2.
     * - Print N
     * - Print count of input integers
     */
    public static void printCountInput() {

        int count = 1;

        while (true) {

            System.out.print("Enter number - ");
            int number = new Scanner(System.in).nextInt();

            if ((number & number - 1) == 0) {

                System.out.printf("The enter number - %d\nCount input number = %d", number, count);

                break;
            }

            count += 1;

        }

    }

    //Exercise 9

    /**
     * 9.For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.
     *
     * @param number int type
     */
    public static void printSmallestMultiplyOfTwo(int number) {

        while (true) {

            number++;

            if ((number & number - 1) == 0) {

                int count = 1;

                while (number > 2) {

                    number /= 2;

                    count += 1;
                }

                System.out.println("The multiply of two = " + count);

                break;
            }
        }
    }

    //Exercise 10

    /**
     * print the table of characters that are
     * equivalent to the Ascii codes
     */
    public static void printTheTableOfCharacters() {

        int startPoint = 32;

        int count;

        while (true) {


            if (startPoint > 66) {

                break;
            }

            count = 0;

            while (count < 10) {
                count += 1;

                if (startPoint > 66) {

                    break;
                }

                System.out.print((char) startPoint + " ");

                startPoint += 1;

            }

            System.out.println();
        }
    }

    //Exercise 11

    /**
     * Print all integer numbers from 1 to N, except that are multiple of 3.
     *
     * @param number int type
     */
    public static void printAllNumberExceptMultiplyThree(int number) {

        int startPoint = 0;

        while (startPoint <= number) {

            startPoint++;

            if (startPoint % 3 == 0) {

                continue;
            }

            System.out.print(startPoint + ", ");

        }

    }

    //Exercise 12

    /**
     *define is the enter number Fibonacci number
     * @param number int type
     */
    public static void printIsTheNumberFibonacci(int number) {

        int fibonacciEXeNum = 1;
        int fibonacciNum = 1;
        int temp;

        while (true) {

            temp = fibonacciNum;
            fibonacciNum += fibonacciEXeNum;
            fibonacciEXeNum = temp;

            if(fibonacciNum < number){
                continue;
            }
            if (fibonacciNum == number){
                System.out.printf("such number %d that  φn = %d",
                        number, fibonacciNum);
                break;
            } else {

                System.out.println(-1);
                break;
            }
        }
    }

    //Exercise 13

    /**
     * Determine the number of the day for which the athlete's
     * mileage will be at least y kilometers
     * @param startMileage double type
     * @param mileage double type
     */
    public static void printRunDays(double startMileage, double mileage){

        int days = 1;

        while (true){

            if(startMileage < mileage ){

                startMileage += startMileage * 10/100;

                days ++;

                continue;
            }

            System.out.println("Run of days = " + days);
            break;
        }
    }

    //Exercise 14

    /**
     * Determine how many years the contribution will
     * be at least desirable dollars
     * @param deposit int type
     * @param percent int type
     * @param contribution int type
     * @return year int type
     */
    public static int contributionYear(int deposit, int percent, int contribution){
        int year = 0;

        while(true){

            if(deposit <= contribution){

                deposit = deposit + deposit * percent / 100;

                year += 1;
                System.out.println(deposit);

                continue;
            }

            break;
        }

        return year;
    }

    //Exercise 15

    /**
     * The sequence consists of different natural
     * numbers and ends with the number 0. Determine
     * the value of the second larges element in this sequence.
     * @return int type
     */
    public static int secondLargesNumber(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number - ");
        int inputNumber = scan.nextInt() ;
        int maxNumber = inputNumber;
        int secondMaxNumber = inputNumber;


        while(true){

            System.out.print("Enter number - ");
            inputNumber = scan.nextInt();

            if(inputNumber != 0){

                if(inputNumber > secondMaxNumber && inputNumber < maxNumber){

                    secondMaxNumber = inputNumber;
                    continue;
                }
                if(inputNumber > maxNumber){

                    secondMaxNumber = maxNumber;
                    maxNumber = inputNumber;
                    continue;
                }///to do
            }

            return secondMaxNumber;
        }


    }

    //Exercise 16

    /**
     * Program the generates a random number and asks
     * the user to guess what the number is
     */
    public static void findNumber(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bound for random number - ");
        int bound = scanner.nextInt();

        int unknownNumber = new Random().nextInt(bound);

        while (true){

            System.out.print("Enter the number to guess  - ");
            int guessNumber = scanner.nextInt();

            if(guessNumber > unknownNumber){

                System.out.println("Too high, try again\n");
                continue;
            }

            if (guessNumber < unknownNumber){

                System.out.println("Too low, try again\n");
                continue;
            }

            if(unknownNumber == guessNumber){
                System.out.println("Yes, you guessed the number - " + guessNumber);
                break;
            }


        }
    }

    //Exercise 17

    /**
     * Compute the Sum of Digits in a given number
     * @param number int type
     * @return sum int type
     */
    public static int sumDigit(int number){

        int sum = 0;

        if(number < 0){
            number = - number;
        }

        while (true){

            if(number != 0){

                sum += number % 10;

                number /= 10;

                continue;
            }

            return sum;
        }
    }

}