package com.company.Day11;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Test exercise 1
//        System.out.print("Enter start number - ");
//        int startNumber = scan.nextInt();
//        System.out.print("Enter stop number - ");
//        int stopNumber = scan.nextInt();
//        printEvenNumberInRange(startNumber, stopNumber);
//
//        //Test exercise 2
//        System.out.print("Enter start number - ");
//        int startNumber = scan.nextInt();
//        System.out.print("Enter stop number - ");
//        int stopNumber = scan.nextInt();
//        System.out.print("Enter remainder number - ");
//        int remainder = scan.nextInt();
//        System.out.print("Enter div number - ");
//        int divNumber = scan.nextInt();
//        printRemainderNumberInRange(startNumber, stopNumber,
//                remainder, divNumber);
//
//        //Test exercise 3
//
//        System.out.print("Enter start number - ");
//        int startNumber = scan.nextInt();
//        System.out.print("Enter stop number - ");
//        int stopNumber = scan.nextInt();
//        printSqrtNumberInRange(startNumber, stopNumber);
//
//        //Test exercise 4
//        System.out.print("Enter number - ");
//        int number = scan.nextInt();
//        System.out.print("Enter digit - ");
//        int digit = scan.nextInt();
//        printCountOccursNumbers(number, digit);
//
//        //Test exercise 5
//        System.out.print("Enter number - ");
//        int number = scan.nextInt();
//        printReversNumber(number);
//
//        //Test exercise 6
//        System.out.print("Enter number - ");
//        int number = scan.nextInt();
//        System.out.printf("The smallest natural divisor for %d = %d",
//                number, smallestDivisor(number));
//
//        //Test exercise 7
//        System.out.print("Enter number - ");
//        int number = scan.nextInt();
//        printALLDivisor(number);
//
//        //Test exercise 8
//        System.out.print("Enter number - ");
//        int number = scan.nextInt();
//        System.out.printf("The count divisors for %d number = %d",
//                number, countNaturalDivisors(number));
//
//        //Test exercise 9
//        System.out.print("Enter count number - ");
//        int number = scan.nextInt();
//        System.out.println("The sum of enter number = " + sumEnterNumber(number));
//
//        //Test exercise 10
//        System.out.print("Enter binary number - ");
//        int binaryNumber = scan.nextInt();
//        System.out.println("The " + binaryNumber + " binary number  = "
//                + binaryConvertInteger(binaryNumber) + " integer number.");
//
//        //Test exercise 11
        System.out.print("Enter number - ");
        int number = scan.nextInt();
        printCountNumbersNegativePositiveZero(number);
//
//        //Test exercise 12
//        System.out.print("Enter second - ");
//        int second = scan.nextInt();
//        gnche_1(second);
//
//        //Test exercise 13
//        System.out.print("Enter matrix size - ");
//        int matrix = scan.nextInt();
//        printPicture(matrix);
//
//        //Test exercise 14
//        System.out.print("Enter matrix size - ");
//        int matrix = scan.nextInt();
//        printCheckerboard(matrix);
//
//        //Test exercise 15
//        System.out.print("Enter table size - ");
//        int tableSize = scan.nextInt();
//        printMultiplicationTable(tableSize);
//
//        //Test exercise 16
//        System.out.print("Enter triangle size - ");
//        int triangleSize = scan.nextInt();
//        System.out.print("Enter what triangle type you want\n" +
//                "Input(A, B, C, D) - ");
//        char triangleType = scan.next().toUpperCase(Locale.ROOT).charAt(0);
//        printTriangle(triangleSize, triangleType);

    }

    //Exercise 1

    /**
     * Print all even numbers from a given range
     *
     * @param starNumber int type
     * @param stopNumber int type
     */
    public static void printEvenNumberInRange(int starNumber, int stopNumber) {

        printRemainderNumberInRange(starNumber, stopNumber, 0, 2);
    }

    //Exercise 2

    /**
     * Print all numbers on the segment from a to b that
     * give the remainder of c when divided by d
     *
     * @param startNumber int type
     * @param stopNumber  int type
     * @param remainder   int type
     * @param div         int type
     */
    public static void printRemainderNumberInRange(int startNumber, int stopNumber,
                                                   int remainder, int div) {

        if (startNumber > stopNumber) {

            startNumber += stopNumber;
            stopNumber = startNumber - stopNumber;
            startNumber -= stopNumber;

        }

        if (div != 0) {
            for (int i = startNumber; i <= stopNumber; i++) {

                if (i % div == remainder) {

                    System.out.print(i + ", ");
                }
            }
        }

    }

    //Exercise 3

    /**
     * Print all numbers on the segment from a to b that are exact squares
     *
     * @param starNumber int type
     * @param stopNumber int type
     */
    public static void printSqrtNumberInRange(int starNumber, int stopNumber) {

        for (int i = starNumber; i <= stopNumber; i++) {

            if (Math.sqrt(i) % 1 > 0) {

                continue;
            }

            System.out.print(i + ", ");
        }
    }

    //Exercise 4

    /**
     * Count and print one number - how many times the digit
     * occurs in the representation of a natural number.
     *
     * @param number int type
     * @param digit  int type
     */
    public static void printCountOccursNumbers(int number, int digit) {

        int count = 0;

        int digitSize = defineDigitSize(digit);

        for (; number > 0; ) {

            if (number % digitSize == digit) {

                count++;


                number /= digitSize;

            } else {

                number /= 10;
            }
        }

        System.out.printf("The %d is repeat in %d time.", digit, count);
    }

    //Exercise 5

    /**
     * Print enter number revers number
     *
     * @param number int type
     */
    public static void printReversNumber(int number) {

        int reversNumber = 0;

        if (number < 0) {

            number = -number;
        }

        for (; number > 0; ) {

            reversNumber = reversNumber * 10 + number % 10;

            number /= 10;
        }

        System.out.println("The revers number = " + reversNumber);

    }

    //Exercise 6

    /**
     * Find the smallest natural divisor
     *
     * @param number int type
     * @return smallDiv int type
     */
    public static int smallestDivisor(int number) {

        int smallDiv = 0;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

                smallDiv = i;

                return smallDiv;
            }
        }

        return number;
    }

    //Exercise 7

    /**
     * Print all natural divisors of the number
     *
     * @param number int type
     */
    public static void printALLDivisor(int number) {

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                System.out.print(i + ", ");
            }
        }

    }

    //Exercise 8

    /**
     * Return count the number of natural divisors
     *
     * @param number int type
     * @return countDiv int type
     */
    public static int countNaturalDivisors(int number) {

        int countDiv = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                countDiv++;
            }
        }

        return countDiv;
    }

    //Exercise 9

    /**
     * Calculate the sum of the given
     *
     * @param numberCount int type
     * @return sumNumber int type
     */
    public static int sumEnterNumber(int numberCount) {

        Scanner scan = new Scanner(System.in);

        int sumNumbers = 0;

        for (int i = 0; i < numberCount; i++) {

            System.out.print("Enter " + (i + 1) + " number - ");
            sumNumbers += scan.nextInt();
        }

        return sumNumbers;
    }

    //Exercise 10

    /**
     * Convert a natural number from binary to decimal
     *
     * @param binaryNumber int type
     * @return decimalNumber int type
     */
    public static int binaryConvertInteger(int binaryNumber) {

        int decimalNumber = 0;

        for (int i = 0; binaryNumber > 0; i++, binaryNumber /= 1) {

            decimalNumber += (int) (binaryNumber % 10 * Math.pow(2, i));

        }

        return decimalNumber;

    }

    //Exercise 11

    /**
     * Enter the number N, followed by N integers.
     * <p>
     * -Count how many zeros, positive numbers, negative numbers among the given N numbers.
     * <p>
     * -It is necessary to print first the number of zeros, then the number of positive and negative numbers
     *
     * @param howManyNumbers int type
     */
    public static void printCountNumbersNegativePositiveZero(int howManyNumbers) {

        Scanner scan = new Scanner(System.in);

        int countZero = 0;
        int countNegative = 0;

        int number;

        for (int i = 1; i <= howManyNumbers; i++) {

            System.out.print("Enter number " + i + " - ");
            number = scan.nextInt();

            if (number == 0) {

                countZero++;
                continue;
            }

            if (number < 0) {

                countNegative++;
                continue;
            }
        }

        System.out.printf("The zero numbers count = %d\nThe positive numbers count = %d\n" +
                "The negative numbers count = %d\n", countZero, howManyNumbers - countZero - countNegative, countNegative);
    }

    //Exercise 12

    /**
     * "GNCHE-1" is a complex electronic device that issues
     * every second the next sequence number
     *
     * @param second int type
     */
    public static void gnche_1(int second) {

        int count = 0;

        for (int i = 1; i <= second; i++) {

            for (int j = 1; j <= i; j++) {

                count++;

                if (count <= second) {

                    System.out.print(i + " ");
                } else {

                    break;
                }
            }

        }

    }

    //Exercise 13

    /**
     * Print N*N matrix picture
     *
     * @param matrix int type
     */
    public static void printPicture(int matrix) {

        if (matrix < 0) {

            matrix = -matrix;
        }


        for (int i = 0; i < matrix; i++) {

            for (int j = 0; j < matrix; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Exercise 14

    /**
     * Print checkerboard
     *
     * @param matrix int type
     */
    public static void printCheckerboard(int matrix) {

        if (matrix < 0) {

            matrix = -matrix;
        }


        for (int i = 0; i < matrix; i++) {

            for (int j = 0; j < matrix; j++) {
                if (i % 2 == 0) {

                    System.out.print("* ");
                } else {

                    System.out.print(" *");
                }

            }
            System.out.println();
        }
    }

    //Exercise 15

    /**
     * Print the multiplication table
     *
     * @param tableSize int type
     */
    public static void printMultiplicationTable(int tableSize) {

        if (tableSize < 0) {

            tableSize = -tableSize;
        }

        //Print table Head
        System.out.print("*  |");

        for (int i = 1; i <= tableSize; i++) {

            if (i < 10) {

                System.out.print(i + "   ");
            } else {

                System.out.print(i + "  ");
            }
        }

        System.out.println();

        for (int i = 0; i < tableSize * 2 + 2; i++) {

            System.out.print("_ ");
        }

        System.out.println();

        //Print multiplication table
        for (int i = 1; i <= tableSize; i++) {

            if (i < 10) {
                System.out.print(i + "  |");
            } else {

                System.out.print(i + " |");
            }


            for (int j = 1; j <= tableSize; j++) {

                if (i * j < 10) {

                    System.out.print(i * j + "   ");
                } else if (i * j < 100) {

                    System.out.print(i * j + "  ");
                } else {

                    System.out.print(i * j + " ");
                }
            }

            System.out.println();

        }
    }

    //Exercise 16

    /**
     * Print triangle accordance with the type
     *
     * @param sideSize int type
     * @param type     char type
     */
    public static void printTriangle(int sideSize, char type) {

        if (sideSize < 0) {

            sideSize = -sideSize;
        }
        switch (type) {

            case 'A':
                for (int i = 1; i <= sideSize; i++) {

                    for (int j = 1; j <= i; j++) {

                        System.out.print("* ");
                    }

                    System.out.println();
                }

                break;

            case 'B':
                for (int i = 1; i <= sideSize; i++) {

                    for (int j = 4; j >= i; j--) {

                        System.out.print("* ");
                    }

                    System.out.println();
                }

                break;

            case 'C':
                for (int i = 1; i <= sideSize; i++) {

                    for (int j = 1; j <= sideSize; j++) {

                        if (j >= i) {

                            System.out.print("* ");
                        } else {

                            System.out.print("  ");
                        }
                    }

                    System.out.println();
                }

                break;

            case 'D':
                for (int i = 1; i <= sideSize; i++) {

                    for (int j = 4; j > 0; j--) {

                        if (j > i) {

                            System.out.print("  ");
                        } else {

                            System.out.print("* ");
                        }
                    }

                    System.out.println();
                }

                break;

            default:
                System.out.println("Invalid triangle type");

        }
    }


    //My necessary methods

    /**
     * Define size of digit
     * @param digit int type
     * @return digitSize int type
     */
    public static int defineDigitSize(int digit) {

        int digitSize = 10;

        for (int i = 1; ; i *= 10) {

            if (digit / (10 * i) == 0) {

                break;
            }

            digitSize *= 10;
        }

        return digitSize;
    }
}

