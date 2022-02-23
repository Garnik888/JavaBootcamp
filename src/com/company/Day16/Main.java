package com.company.Day16;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Test exercise 1
//
//        System.out.print("Enter number from 1 to 15 - ");
//        int num = scan.nextInt();
//        System.out.println("The power 2 of " + num + " = " + numberPowers(num));
//
//        //Test exercise 2
//
//        System.out.print("Enter minutes - ");
//        howManyTime(scan.nextInt());
//
//        //Test exercise 3
//
//        System.out.print("Enter number - ");
//        int num = scan.nextInt();
//
//        if (isPrim(num)) {
//
//            System.out.println("The number " + num + " is PRIM");
//        } else {
//
//            System.out.println("The number " + num + " is NOT PRIM");
//        }
//
//        //Test exercise 5
//        System.out.print("Enter start number - ");
//        int startNum = scan.nextInt();
//        System.out.print("Enter stop number - ");
//        printAllPalindromeNumbers(startNum, scan.nextInt());
//
//        //Test exercise 6
//
//        String[] str = {"DOG", "cAT", "lip"};
//
//        printWordsFirstLetterCapitalized(str);
//
//        //Test exercise 7
//
//        System.out.print("Enter board size - ");
//        checkerboard(scan.nextInt());
//
//        //Test exercise 8
//
//        printGeometricProgression(3.2, 1.5, 4);
//
//        //Test exercise 9
//
//        System.out.print("Enter number - ");
//        printPrimeFactors(scan.nextInt());
//
//        //Test exercise 10
//
//        System.out.print("Enter row - ");
//        int row = scan.nextInt();
//
//        System.out.print("Enter column - ");
//        printMultiplicationTable(row, scan.nextInt());
//
        //Test exercise 11

        System.out.print("Enter row - ");
        int row = scan.nextInt();

        System.out.print("Enter column - ");
        createMatrixDiagonalADD(row, scan.nextInt());
//
//        //Test exercise 12
//
//        System.out.print("Enter row - ");
//        int row = scan.nextInt();
//
//        System.out.print("Enter column - ");
//        createMatrixSnakeADD(row, scan.nextInt());
//
//        //Test exercise 13
//        System.out.print("Enter N*N matrix size - ");
//        int[][] matrix = addMatrix(scan.nextInt());
//        System.out.print("If wont rotate matrix 90 degrees pres 1\n" +
//                "If wont rotate matrix 90 degrees pres 2\n" +
//                "enter number -");
//        int version = scan.nextInt();
//
//        printMatrix(matrix);
//        System.out.println();
//        rotateMatrixVersion(matrix, version);
    }

    //Exercise 1

    /**
     * Calculate two to the power of number
     *
     * @param number int type
     * @return int type
     */
    public static int numberPowers(int number) {

        if (number >= 1 && number < 15) {

            return powNumber(2, number);
        }

        System.out.print("The number is out of range - ");
        return 0;
    }

    //Exercise 2

    /**
     * Determine how many hours and minutes the digital
     * clock will show at this moment
     *
     * @param minutes int type
     */
    public static void howManyTime(int minutes) {

        LocalTime time = LocalTime.of(0, 0);
        time = time.plusMinutes(minutes);

        System.out.println(time);
    }

    //Exercise 3

        /*
         5.How many times will the body of the loop be executed?
            for (int i = 2; i <= 15; i ++) {...}  -- 14 times
            for (int i = 10; i <= 100; i = i+7) {...} -- 13 times
            for (float i = 1.5; i <= 10.3; i = i+0.4) {...} -- 23 times
         */

    //Exercise 4

    /**
     * Program to determine whether the number is prime or not.
     *
     * @param number int type
     * @return boolean type
     */
    public static boolean isPrim(int number) {

        if (number < 0) {

            number = -number;
        }

        if (number != 0 && number != 1) {

            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {

                    return false;
                }

            }
        }

        return true;
    }

    //Exercise 5

    /**
     * You are given two four-digit numbers A and B.
     * Print all four-digit numbers on the segment
     * from A to B, the record of which is a palindrome.
     *
     * @param start int type
     * @param stop  int type
     */
    public static void printAllPalindromeNumbers(int start, int stop) {

        if (!(start >= 1000 && start <= 9999 && stop >= 1000 && stop <= 9999)) {

            System.out.println("The start or stop is not four-digit numbers!!!");
        }

        if (start > stop) {

            start += stop;
            stop = start - stop;
            start -= stop;
        }

        int stopDig = stop / 1000;

        for (int i = start; i <= stop; i++) {

            if (i == reversNumber(i)) {

                System.out.println(i);

                i += 10;
            }
        }
    }

    //Exercise 6

    /**
     * The word consists only of Latin letters, small and large.
     * Print the same word, where the first letter is capitalized,
     * the rest are small.
     *
     * @param strings String [] type
     */
    public static void printWordsFirstLetterCapitalized(String[] strings) {

        for (String str : strings) {

            System.out.println(str.substring(0, 1).toUpperCase() +
                    str.substring(1).toLowerCase());
        }
    }

    //Exercise 7

    /**
     * Print checkerboard
     *
     * @param boardSIze int type
     */
    public static void checkerboard(int boardSIze) {

        for (int i = 0; i < boardSIze; i++) {

            for (int j = 0; j < boardSIze; j++) {

                System.out.print(j % 2 == 0 ? "O " : "X ");
            }

            System.out.println();
        }
    }

    //Exercise 8

    /**
     * Print the n-th term of a geometric progression
     *
     * @param term        double type
     * @param denominator double type
     * @param period      int type
     */
    public static void printGeometricProgression(double term, double denominator, int period) {

        double geometricProgression = term;

        for (int i = 1; i < period; i++) {

            geometricProgression *= denominator;
        }

        System.out.printf("The %d geometric progression %.2f end %.2f = %.2f",
                period, term, denominator, geometricProgression);
    }

    //Exercise 9

    /**
     * Expand it into prime factors
     *
     * @param number int type
     */
    public static void printPrimeFactors(int number) {

        if (number < 2) {

            System.out.println("The number is small 2 enter high number");
            return;
        }

        if (isPrim(number)) {

            System.out.println("Prime factors = " + number);
            return;
        }

        while (number > 1) {

            for (int i = 2; i <= number; ) {

                if (isPrim(i) && number % i == 0) {

                    if (number == i) {

                        System.out.print(i);

                    } else {

                        System.out.print(i + " * ");

                    }

                    number /= i;

                } else {

                    i++;
                }
            }
        }

    }

    //Exercise 10

    /**
     * Create a two-dimensional array A [n] [m], fill it with
     * the multiplication table A [i] [j] = i * j and display
     * it. In this case, you cannot use nested loops, the entire
     * filling of the array must be done in one cycle.
     *
     * @param row int type
     * @param col int type
     */
    public static void printMultiplicationTable(int row, int col) {

        int[][] matrix = new int[row][col];
        int countCol = 0;
        int countRow = 0;
        int loopSize = row % 2 == 0 ? col * row + row / 2 : col * row + row / 2 + 1;

        for (int i = 0; i <= loopSize; i++) {

            if (countCol < col) {

                matrix[countRow][countCol] = countCol * countRow;

                countCol++;
            } else {

                countCol = 0;

                countRow++;
            }
        }

        printMatrix(matrix);
    }

    //Exercise 11

    /**
     *
     * Print matrix diagonal add
     *
     * @param row int type
     * @param column int type
     */
    public static void createMatrixDiagonalADD(int row, int column) {

        int[][] matrix = new int[row][column];
        int value;
        int count;

        for (int i = 0; i < row; i++) {

            count = i + 1;

            value = i == 0 ? 0 : matrix[i - 1][0] + i + 1;

            for (int j = 0; j < column; j++) {

                matrix[i][j] = value;

                value += count;

                if (count < matrix.length && j < matrix[0].length - 2 - i) {

                    count++;
                } else if (j >= matrix[0].length - 2 - i) {

                    count--;
                }

            }
        }

        printMatrix2(matrix);
    }

    //Exercise 12

    /**
     * Given numbers n and m. Create an array A [n][m]
     * and fill it with a snake
     *
     * @param row    int type
     * @param column int type
     */
    public static void createMatrixSnakeADD(int row, int column) {

        int[][] matrix = new int[row][column];
        int val = 0;

        for (int i = 0; i < row; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < column; j++) {

                    matrix[i][j] = val++;
                }
            } else {

                for (int j = column - 1; j >= 0; j--) {

                    matrix[i][j] = val++;
                }
            }
        }

        printMatrix(matrix);
    }

    /**
     * Rotate matrix by 90 degrees or 180 degrees and print
     *
     * @param matrix   int [][] array type
     * @param rotCount int [ype
     */
    public static void rotateMatrixVersion(int[][] matrix, int rotCount) {

        switch (rotCount) {

            case 1:
                printMatrix(rotateMatrix90degrees(matrix));
                break;
            case 2:
                printMatrix(rotateMatrix90degrees(rotateMatrix90degrees(matrix)));
                break;
            default:
                System.out.println("Illegal choice");
        }
    }


    // My necessary methods

    /**
     * @param number int type
     * @param pow    int type
     * @return int type
     */
    public static int powNumber(int number, int pow) {

        int powNumber = 1;

        if (pow == 0) {

            return powNumber;
        }


        for (int i = 1; i <= pow; i++) {

            powNumber *= number;
        }

        return powNumber;
    }

    /**
     * revers number
     *
     * @param number int type
     * @return int type
     */
    public static int reversNumber(int number) {

        int reversNumber = 0;

        if (number < 0) {

            number = -number;
        }

        for (; number > 0; number /= 10) {

            reversNumber = reversNumber * 10 + number % 10;
        }

        return reversNumber;
    }

    /**
     * Initialize N x N matrix
     *
     * @param matrixSize int type
     * @return int [][] type
     */
    public static int[][] addMatrix(int matrixSize) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter matrix");

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.printf("Enter matrix element %d %d - ", i, j);

                matrix[i][j] = scan.nextInt();
            }

        }

        return matrix;
    }

    /**
     * Print matrix
     *
     * @param matrix int [][] type
     */
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

        }
    }

    /**
     * Print matrix
     *
     * @param matrix int [][] type
     */
    public static void printMatrix2(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] / 10 == 0) {

                    System.out.print(matrix[i][j] + "  ");
                } else if (matrix[i][j] / 100 == 0) {

                    System.out.print(matrix[i][j] + " ");
                }
            }

            System.out.println();

        }
    }

    /**
     * Rotate matrix by 90 degrees
     *
     * @param matrix int [][] array type
     * @return int [][] array type
     */
    public static int[][] rotateMatrix90degrees(int[][] matrix) {

        int[][] rotMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                rotMatrix[i][j] = matrix[j][matrix.length - 1 - i];
            }
        }

        return rotMatrix;
    }

}
