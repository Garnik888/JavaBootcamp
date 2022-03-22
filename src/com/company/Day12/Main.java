package com.company.day12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Test Exercise 1
//
//        System.out.print("Enter array size - ");
//        printArrayEvenIndex(scan.nextInt());
//
//        //Test Exercise 2
//
//        System.out.print("Enter array size - ");
//        printArrayEvenItems(scan.nextInt());
//
//        //Test Exercise 3
//
//        System.out.print("Enter array size - ");
//        printArrayPositiveElements(scan.nextInt());
//
//        //Test Exercise 4
//
//        System.out.print("Enter array size - ");
//        printArrayLargerPreviousElements(scan.nextInt());
//
//        //Test Exercise 5
//
//        System.out.print("Enter array size - ");
//        printTwoSameSignAdjacentElements(scan.nextInt());
//
//        //Test Exercise 6
//
//        System.out.print("Enter array size - ");
//        printLargestElementAndIndex(scan.nextInt());
//
//        //Test Exercise 7
//
//        System.out.print("Enter array size - ");
//        printSmallestPositiveElement(scan.nextInt());
//
//        //Test Exercise 8
//
//        System.out.print("Enter array size - ");
//        int [] array = enterArray(scan.nextInt());
//
//        System.out.printf("The array list have  - %d elements", howManyDifferentElements(array));
//
//        //Test Exercise 9
//
//        System.out.print("Enter array size - ");
//       backPrintArray(enterArray(scan.nextInt()));
//
//        //Test Exercise 10
//
//        System.out.print("Enter array size - ");
//        printReversArray(enterArray(scan.nextInt()));
//
//        //Test Exercise 11
//
//        System.out.print("Enter array size - ");
//        printArray(rearrangeArrayAdjacentElements(enterArray(scan.nextInt())));
//
//        //Test Exercise 12
//
//        System.out.print("Enter array size - ");
//        int [] array = enterArray(scan.nextInt());
//        System.out.print("Enter shift count - ");
//        printArray(shiftArray(array,scan.nextInt()));
//
//        //Test Exercise 13
//
//        System.out.print("Enter array size - ");
//        printArray(changeMinMaxItems(enterArray(scan.nextInt())));
//
//        //Test Exercise 14
//
//        System.out.print("Enter array size - ");
//        int [] array = enterArray(scan.nextInt());
//        System.out.print("Enter remove index - ");
//        removeTheElementWithIndex(array, scan.nextInt());
//
//        //Test Exercise 15
//
//        System.out.print("Enter array size - ");
//        printThoseElements(enterArray(scan.nextInt()));
//
//        //Test Exercise 16
        System.out.print("Enter array size - ");
        int[] array = enterArray(scan.nextInt());
        moveZeroElementsToRight(array);
    }

    //Exercise 1

    /**
     * Print all elements of the array with even indices
     *
     * @param arrSize int type
     */
    public static void printArrayEvenIndex(int arrSize) {

        int[] array = enterArray(arrSize);

        for (int i = 0; i < array.length; i += 2) {

            System.out.print(array[i] + ", ");
        }


    }

    //Exercise 2

    /**
     * Print all even numbered items in the list
     *
     * @param arrSize int type
     */
    public static void printArrayEvenItems(int arrSize) {

        int[] array = enterArray(arrSize);

        for (int i : array) {

            if ((i & 1) == 0) {

                System.out.print(i + ", ");
            }
        }

    }

    //Exercise 3

    /**
     * Print all positive numbered items in the list
     *
     * @param arrSize int type
     */
    public static void printArrayPositiveElements(int arrSize) {

        int[] array = enterArray(arrSize);

        for (int i : array) {

            if (i > 0) {

                System.out.print(i + ", ");
            }
        }

    }

    //Exercise 4

    /**
     * Print all the elements of the list that
     * are larger than the previous element
     *
     * @param arrSize int type
     */
    public static void printArrayLargerPreviousElements(int arrSize) {

        int[] array = enterArray(arrSize);

        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[i - 1]) {

                System.out.print(array[i] + ", ");
            }
        }

    }

    //Exercise 5

    /**
     * If it has two adjacent
     * elements of the same sign, print these numbers.
     *
     * @param arrSize int type
     */
    public static void printTwoSameSignAdjacentElements(int arrSize) {

        int[] array = enterArray(arrSize);

        for (int i = 1; i < array.length - 1; i++) {

            if (array[i - 1] > 0 && array[i] > 0 ||
                    array[i - 1] < 0 && array[i] < 0) {

                System.out.println(array[i - 1] + ", " + array[i]);

                break;
            }
        }
    }

    //Exercise 6

    /**
     * Print the value of the largest element in the array,
     * and then the index of that element
     *
     * @param arrSize int type
     */
    public static void printLargestElementAndIndex(int arrSize) {

        int[] array = enterArray(arrSize);

        int largestElement = array[0];
        int indexElement = 0;

        for (int i = 1; i < array.length; i++) {

            if (largestElement < array[i]) {

                largestElement = array[i];

                indexElement = i;
            }

        }

        System.out.printf("The largest is %d\tindex is %d", largestElement, indexElement);
    }

    //Exercise 7

    /**
     * Print the value of the smallest of all positive elements in the list.
     * It is known that the list contains at least one positive element,
     * and the absolute value of all elements of the list does not exceed 1000.
     *
     * @param arrSize int type
     */
    public static void printSmallestPositiveElement(int arrSize) {

        int[] array = enterArray(arrSize);
        boolean flag = false;
        int smallArray = array[0];
        int sumArray = 0;


        for (int i : array) {

            if (i > 0) {

                flag = true;
                sumArray += i;
            } else {

                sumArray += -i;
            }
        }

        if (!flag) {

            System.out.println("Incorrect enter, you mast enter at least one positive element");
            return;
        }

        if (sumArray > 1000) {

            System.out.println("The absolute value of all elements of the " +
                    "list does not exceed 1000");
            return;
        }

        for (int j : array)

            if (j > 0 && j < smallArray) {

                smallArray = j;
            }

        System.out.println("The smallest positive element = " + smallArray);
    }

    //Exercise 8

    /**
     * Determine how many different elements are in it
     *
     * @param array int [] array type
     * @return countElements int type
     */
    public static int howManyDifferentElements(int[] array) {

        sortedList(array);

        int countElements = 1;

        for (int i = 1; i < array.length; i++) {

            if (array[i - 1] != array[i]) {

                countElements += 1;
            }
        }

        return countElements;
    }

    //Exercise 9

    /**
     * Print array start last element
     *
     * @param array int [] type
     */
    public static void backPrintArray(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }
    }

    //Exercise 10

    /**
     * Print the elements of the given list in reverse order
     * without changing the list itself.
     *
     * @param array int [] array
     */
    public static void printReversArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            changeArrayElements(array, array.length - 1 - i, i);
        }

        printArray(array);
    }

    //Exercise 11

    /**
     * Rearrange the adjacent elements of the array
     *
     * @param array int [] type
     * @return int [] type
     */
    public static int[] rearrangeArrayAdjacentElements(int[] array) {

        if (array.length % 2 != 0) {

            for (int i = 0; i < array.length - 2; i += 2) {

                changeArrayElements(array, i, i + 1);
            }
        } else {

            for (int i = 0; i < array.length - 1; i += 2) {

                changeArrayElements(array, i, i + 1);
            }
        }

        return array;
    }

    //Exercise 12

    /**
     * Right shift array list
     *
     * @param array      int [] array type
     * @param shiftCount int type
     * @return int [] array type
     */
    public static int[] shiftArray(int[] array, int shiftCount) {

        int temp;

        for (int i = 1; i <= shiftCount; i++) {

            temp = array[array.length - 1];
            for (int j = 0; j < array.length; j++) {

                array[j] += temp;

                temp = array[j] - temp;

                array[j] -= temp;
            }
        }

        return array;
    }

    //Exercise 13

    /**
     * Change max min elements place
     *
     * @param array int [] array type
     * @return int [] array type
     */
    public static int[] changeMinMaxItems(int[] array) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[maxIndex] < array[i]) {

                maxIndex = i;
            }

            if (array[minIndex] > array[i]) {

                minIndex = i;
            }
        }

        changeArrayElements(array, minIndex, maxIndex);

        return array;
    }

    //Exercise 14

    /**
     * Remove the element with index k from the list by
     * moving all elements to the right of the element
     * with index k to the left.
     *
     * @param array       int [] array type
     * @param indexRemove int type
     */
    public static void removeTheElementWithIndex(int[] array, int indexRemove) {

        if (indexRemove > array.length - 1) {

            System.out.println("The index is out of bound");
            return;
        }

        for (int i = indexRemove; i < array.length - 1; i++) {

            changeArrayElements(array, i, i + 1);

        }

        for (int i = 0; i < array.length - 1; i++) {

            System.out.print(array[i] + " ");
        }
    }

    //Exercise 15

    /**
     * Print those elements of it that appear
     * in the list only once
     *
     * @param array int [] array type
     */
    public static void printThoseElements(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            boolean flag = true;

            for (int j = i; j < array.length; j++) {

                if (array[i] == array[j] && i != j) {

                    flag = false;

                    break;
                }

            }

            if (flag) {

                System.out.print(array[i] + " ");
            }

        }
    }

    //Exercise 16

    /**
     * It is required to “compress” it by moving all
     * non-zero elements to the left side of the array
     * without changing their order, and all zeros to the
     * right side
     *
     * @param array int [] array type
     */
    public static void moveZeroElementsToRight(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length - 1 - count; i++) {

            if (array[i] == 0) {

                for (int j = i; j < array.length - 1 - count; j++) {

                    changeArrayElements(array, j, j + 1);

                }

                count++;

                if (array[i] == 0 /*&& i < array.length - 1 - count*/) {

                    i--;
                }

            }
        }

        printArray(array);
    }

    // My necessary methods

    /**
     * Construct array
     *
     * @param arrSize int typr
     * @return int array type
     */
    public static int[] enterArray(int arrSize) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[arrSize];

        for (int i = 1; i <= arrSize; i++) {

            System.out.printf("Enter %d array elements - ", i);
            array[i - 1] = scan.nextInt();
        }

        return array;

    }

    /**
     * Print array
     *
     * @param array int [] array type
     */
    public static void printArray(int[] array) {

        for (int i : array) {

            System.out.print(i + " ");
        }
    }

    /**
     * Sorting list program
     *
     * @param array int [] array
     */
    public static void sortedList(int[] array) {

        int minNum;

        for (int i = 0; i < array.length; i++) {

            minNum = array[i];

            for (int j = i; j < array.length; j++) {

                if (minNum > array[j]) {

                    array[i] = array[j];

                    array[j] = minNum;

                    minNum = array[i];
                }
            }
        }
    }

    /**
     * Change arrays elements place
     *
     * @param array   int [] array type
     * @param index_1 int type
     * @param index_2 int type
     */
    public static void changeArrayElements(int[] array, int index_1, int index_2) {

        int type = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = type;

    }

}
