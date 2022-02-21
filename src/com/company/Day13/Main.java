package com.company.Day13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Test exercise 1
//
//        System.out.print("Enter N * N matrix size - ");
//        printMatrix(initializeIdentityMatrix(scan.nextInt()));
//
//        //Test exercise 2
//
//        System.out.print("Enter N * N matrix size - ");
//        initializeMatrix(scan.nextInt());
//
//        //Test exercise 3
//
        System.out.print("Enter N * N matrix size - ");
        int[][] matrix = addMatrix(scan.nextInt());
        boolean flag = isTheMatrixSymmetrical(matrix);
        if (flag) {

            printMatrix(matrix);
            System.out.println("Yes is symmetrical");
        } else {

            printMatrix(matrix);
            System.out.println("No is not symmetrical");
        }
//
//        //Test exercise 4
//
//        System.out.print("Enter row size - ");
//        int athlete = scan.nextInt();
//        System.out.print("Enter column size - ");
//        maxSumOfLine(athlete, scan.nextInt());
//
//        //Test exercise 5
//
//        System.out.print("Enter row size - ");
//        int athlete = scan.nextInt();
//        System.out.print("Enter column size - ");
//        bestResult(athlete, scan.nextInt());
//
//        //Test exercise 6
//        System.out.print("Enter row size - ");
//        int row = scan.nextInt();
//        System.out.print("Enter column size - ");
//        bestResultsAndMaxRow(row, scan.nextInt());
//
//        //Test exercise 8
//        System.out.print("Enter 1 matrix size - ");
//        int[][] matrix_1 = addMatrix(scan.nextInt());
//        System.out.print("Enter 2 matrix size - ");
//        int[][] matrix_2 = addMatrix(scan.nextInt());
//
//        concatenationMatrixHorizontal(matrix_1, matrix_2);
//
//        //Test exercise 9
//        System.out.print("Enter matrix size - ");
//        spiralMatrix_0_1(scan.nextInt());
//
//        //Test exercise 10
//        System.out.print("Enter matrix size - ");
//        spiralMatrixPlusNumber(scan.nextInt());
    }

    //Exercise 1

    /**
     * Initialize identity matrix for N * N matrix
     *
     * @param matrixSize int type
     * @return int [][] type
     */
    public static int[][] initializeIdentityMatrix(int matrixSize) {

        int[][] matrix = addMatrixFillZero(matrixSize, matrixSize);

        for (int i = 0; i < matrix.length; i++) {

            matrix[i][matrix.length - 1 - i] = 1;
        }

        return matrix;
    }

    //Exercise 2

    /**
     * Initialize N*N matrix with rules:
     * - numbers above this diagonal are equal to 0;
     * - the numbers below this diagonal are equal to 2
     *
     * @param matrixSize int [][] type
     */
    public static void initializeMatrix(int matrixSize) {

        int[][] matrix = addMatrixFillZero(matrixSize, matrixSize);

        for (int i = 1; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length - 1; j++) {

                if (i > j) {

                    matrix[i][j] = 2;
                }
            }

        }

        printMatrix(matrix);
    }

    //Exercise 3

    /**
     * Is the matrix symmetrical
     *
     * @param matrix int [][] array type
     * @return boolean type
     */
    public static boolean isTheMatrixSymmetrical(int[][] matrix) {

        boolean flag;

        for (int i = 0; i <= matrix.length / 2; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] != matrix[j][i] && i != j) {

                    return flag = false;
                }
            }
        }

        return flag = true;
    }

    //Exercise 4

    /**
     * Print winner athlete result and ID
     * The winner is the athlete who has the maximum result for all throws.
     *
     * @param row    int type
     * @param column int type
     */
    public static void maxSumOfLine(int row, int column) {

        int[][] matrix = addMatrix(row, column);

        int[] maxSum = rowSumMatrixPositiveItems(matrix);

        printMatrix(matrix);

        System.out.println("The max sum result of athletes - " + arrayMaxNumberAnaID(maxSum)[0]);
        System.out.println("The winner athlete is a athlete number - " + (arrayMaxNumberAnaID(maxSum)[1] + 1));
    }

    //Exercise 5

    /**
     * prints out the value of the maximum element,
     * then the row number and the column number
     *
     * @param athletes        int type
     * @param hammerCompeting int type
     */
    public static void bestResult(int athletes, int hammerCompeting) {

        int[][] matrix = addMatrix(athletes, hammerCompeting);
        int row = 0;
        int column = 0;
        int sum = 0;


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < 0) {

                    System.out.println("The hammer competing result " +
                            "cane not be negative");
                    return;
                }

                if (matrix[i][j] > sum) {

                    sum = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        printMatrix(matrix);

        System.out.println("The max result of athletes - " + sum);
        System.out.println("The winner athlete is a athlete number - " + (row + 1));
        System.out.println("The winner athlete result number - " + (column + 1));
    }

    //Exercise 6

    /**
     * Print max result if then mor print that max result how row sum is a max
     *
     * @param athletes        int type
     * @param hammerCompeting int type
     */
    public static void bestResultsAndMaxRow(int athletes, int hammerCompeting) {

        int[][] matrix = addMatrix(athletes, hammerCompeting);
        int row = 0;
        int column = 0;
        int sum = 0;

        int[] athletesSumResults = rowSumMatrixPositiveItems(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < 0) {

                    System.out.println("The hammer competing result " +
                            "cane not be negative");
                    return;
                }

                if (matrix[i][j] == sum && athletesSumResults[row] < athletesSumResults[i]) {

                    sum = matrix[i][j];
                    row = i;
                    column = j;
                }

                if (matrix[i][j] > sum) {

                    sum = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        printMatrix(matrix);

        System.out.println("The max result of athletes - " + sum);
        System.out.println("The winner athlete is a athlete number - " + (row + 1));
        System.out.println("The winner athlete result number - " + (column + 1));
    }

    //Exercise 8

    /**
     * Concatenation two matrix
     *
     * @param matrix_1 int [][] type
     * @param matrix_2 int [][] type
     */
    public static void concatenationMatrixHorizontal(int[][] matrix_1, int[][] matrix_2) {

        if (matrix_1.length != matrix_2.length) {

            System.out.println("Matrix length is not equal");
            return;
        }

        int rowMatrix_1 = matrix_1[0].length;
        int rowMatrix_2 = matrix_2[0].length;
        //chek concat matrix row length
        int rowConcatMatrix = rowMatrix_1 + rowMatrix_2;
        int[][] concatMatrix = new int[matrix_1.length][rowConcatMatrix];


        for (int i = 0; i < matrix_1.length; i++) {

            for (int j = 0; j < rowConcatMatrix; j++) {
                if (j < rowMatrix_1) {

                    concatMatrix[i][j] = matrix_1[i][j];
                } else {

                    concatMatrix[i][j] = matrix_2[i][j - rowMatrix_1];
                }
            }
        }

        printMatrix(matrix_1);
        System.out.println();
        printMatrix(matrix_2);
        System.out.println();
        printMatrix(concatMatrix);
    }

    //Exercise 9

    /**
     * print NxN spiral matrix whid number 1 and 0
     *
     * @param matrixSize int type
     */
    public static void spiralMatrix_0_1(int matrixSize) {

        int[][] matrix = addMatrixFillZero(matrixSize, matrixSize);

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        boolean flag = false;
        int count = 0;

        while (top <= bottom && left <= right) {

            if (count >= 4) {

                flag = true;
                count = 0;
                right--;
                bottom--;
            }

            switch (count) {

                case 0: // left to right


                    for (int i = left; i <= right; i++) {

                        matrix[top][i] = 1;

                    }
                    top++;
                    break;
                case 1: // top to bottom

                    for (int i = top; i <= bottom; i++) {

                        matrix[i][right] = 1;
                    }

                    right--;
                    break;
                case 2: // right to left

                    if (flag) {

                        left++;
                    }
                    for (int i = right; i > left; i--) {
                        matrix[bottom][i] = 1;
                    }

                    break;
                case 3: // bottom to top

                    top++;

                    for (int i = bottom; i >= top; i--) {

                        matrix[i][left] = 1;
                    }

                    bottom--;
                    left++;

                    break;
            }

            count++;
        }

        printMatrix(matrix);
    }

    //Exercise 10

    /**
     * Create an array A [2 * n + 1] [2 * n + 1] and fill it in a spiral,
     * starting with the number 0 in the first cell A [0] [0].
     * The spiral goes left, then turns down.
     *
     * @param number int type
     */
    public static void spiralMatrixPlusNumber(int number) {

        int matrixSize = 2 * number + 1;

        int[][] matrix = new int[matrixSize][matrixSize];

        //int[][] matrix = addMatrix(matrixSize);

        int matrixValueStart = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int count = 0;

        while (top <= bottom && left <= right) {

            if (count >= 4) {

                count = 0;
            }

            switch (count) {

                case 0: // left to right

                    for (int i = left; i <= right; i++) {

                        matrix[top][i] = matrixValueStart++;
                    }

                    top++;
                    break;
                case 1: // top to bottom

                    for (int i = top; i <= bottom; i++) {

                        matrix[i][right] = matrixValueStart++;
                    }

                    right--;
                    break;
                case 2: // right to left

                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = matrixValueStart++;
                    }

                    bottom--;
                    break;
                case 3: // bottom to top

                    for (int i = bottom; i >= top; i--) {

                        matrix[i][left] = matrixValueStart++;
                    }

                    left++;
                    break;
            }

            count++;
        }

        printMatrix(matrix);
    }


    // My necessary methods

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
     * Initialize N x M matrix
     *
     * @param matrixLineSize    int type
     * @param matrixColumnsSize int type
     * @return int [][] type
     */
    public static int[][] addMatrix(int matrixLineSize, int matrixColumnsSize) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter matrix");

        int[][] matrix = new int[matrixLineSize][matrixColumnsSize];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.printf("Enter matrix element %d %d - ", i, j);

                matrix[i][j] = scan.nextInt();
            }

        }

        return matrix;
    }

    /**
     * Initialize N x M matrix ang retyur default matrix all elements = 0
     *
     * @param matrixLineSize    int type
     * @param matrixColumnsSize int type
     * @return int [][] type
     */
    public static int[][] addMatrixFillZero(int matrixLineSize, int matrixColumnsSize) {

        int[][] matrix = new int[matrixLineSize][matrixColumnsSize];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                matrix[i][j] = 0;
            }

        }

        return matrix;
    }

    /**
     * Calculate sum of row matrix
     *
     * @param matrix int [][] type
     * @return int[] array type
     */
    public static int[] rowSumMatrixPositiveItems(int[][] matrix) {

        int[] array = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < 0) {

                    System.out.println("The hammer competing result " +
                            "cane not be negative");
                    return null;
                }

                array[i] += matrix[i][j];
            }

        }


        return array;
    }

    /**
     * Calculate max number in array and return max number and id of number
     *
     * @param array int [] type
     * @return int[2] array type
     */
    public static int[] arrayMaxNumberAnaID(int[] array) {

        int maxNumber = array[0];

        int maxNumberRow = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > maxNumber) {

                maxNumber = array[i];

                maxNumberRow = 0;
            }
        }

        return new int[]{maxNumber, maxNumberRow};
    }
}


