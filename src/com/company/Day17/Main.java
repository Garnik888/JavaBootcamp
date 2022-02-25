package com.company.Day17;

public class Main {

    public static void main(String[] args) {

//        //Test Exercise 4
//
//        int[] arr = {1, 2, 3, 4};
//        print(arr);
//        float[] arr1 = {1, 2, 3, 4};
//        print(arr1);
//        double[] arr2 = {1, 2, 3, 4};
//        print(arr2);
//
//        //Test Exercise 5
//
//        int[] arr = {1, 2, 3, 4};
//        System.out.println(search(arr));
//        System.out.println(search(arr, 3));
//        System.out.println(search(arr, 3,1));
//
//        //Test Exercise 6
//
//        System.out.println("Area of circle - " + area(10));
//        System.out.println("Area of square - " + area(4));
//        System.out.println("Area of rectangle - " + area(4, 5));
//
//        //Test Exercise 7
//
//        System.out.println("Max number - " + max(2, 5));
//        System.out.println("Max number - " + max(8, 5, 1));
//        System.out.println("Max number - " + max(3, 5, 1, 7));
//
//        //Test Exercise 8
//        distance(2, 4);
//        distance(2, 4, 6, 8);
//
//        //Test Exercise 9
//
//        fahrenheitCelsius(2.0f, 1);
//        System.out.println();
//        fahrenheitCelsius(2, 32.0f);

        //Test Exercise 10

        remainder(331);
        remainder(331, 5);

    }

    //Exercise 1 - 3

    //always use int int overload, you mast Cast the variable
    public static void add(short a, short b) {

        System.out.println("short short");
    }

    public static void add(int a, int b) {

        System.out.println("int int");
    }

    public static void add(float a, int b) {

        System.out.println("float int");
    }

    //Exercise 2 - 3

    public static int addNum(int a, int b) {

        return (a + b);
    }

    public static float addNum_1(int a, int b) {

        return (float) (a + b);
    }

    //Exercise 4

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void print(float[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void print(double[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    //Exercise 5

    /**
     * returns the size of array
     *
     * @param array int [] type
     * @return int type
     */
    public static int search(int[] array) {

        return array.length;
    }

    /**
     * returns an index of that argument
     *
     * @param array int [] array
     * @param a     int type
     * @return int type
     */
    public static int search(int[] array, int a) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == a) {

                return i;
            }
        }

        return -1;
    }

    /**
     * returns true if that element is in that place in array,
     *
     * @param array    int [] type
     * @param argument int type
     * @param index    int type
     * @return boolean type
     */
    public static boolean search(int[] array, int argument, int index) {

        return array[index] == argument;
    }

    //Exercise 6

    /**
     * Calculate the area of circle
     *
     * @param radius int type
     * @return float type
     */
    public static float area(int radius) {

        final float PI = 3.14f;
        return radius * radius * PI;
    }

    /**
     * Calculate the area of square
     *
     * @param size float type
     * @return float type
     */
    public static float area(float size) {

        return size * size;
    }

    /**
     * Calculate the area of rectangle
     *
     * @param size_1 int type
     * @param size_2 int type
     * @return float type
     */
    public static int area(int size_1, int size_2) {

        return size_1 * size_2;
    }

    //Exercise 7

    // Return max number
    public static int max(int a, int b) {

        if (a > b) {

            return a;
        }

        return b;
    }

    public static int max(int a, int b, int c) {

        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {

        return max(a, max(b, c, d));
    }

    //Exercise 8

    /**
     * return distance from 0, 0
     *
     * @param a_x int type
     * @param a_y int type
     */
    public static void distance(int a_x, int a_y) {

        double distance = Math.sqrt(Math.pow(a_x, 2) + Math.pow(a_y, 2));

        System.out.println("Distance from 0, 0  to " + a_x + " "
                + a_y + " = " + distance);

    }

    /**
     * return distance from a point to b point
     *
     * @param a_x int type
     * @param a_y int type
     * @param b_x int type
     * @param b_y int type
     */
    public static void distance(int a_x, int a_y, int b_x, int b_y) {

        double distance = Math.sqrt(Math.pow((b_x - a_x), 2) + Math.pow((b_y - a_y), 2));

        System.out.println("Distance from" + a_x + " "
                + a_y + " to " + b_x + " " + b_y + " = "
                + distance);
    }

    //Exercise 9

    /**
     * Calculate fahrenheit
     *
     * @param celsius float type
     * @param choice  int type
     */
    public static void fahrenheitCelsius(float celsius, int choice) {

        double fahrenheit = celsius * 9 / 5 + 32;

        switch (choice) {

            case 1:
                System.out.printf("Celsius %.2f = %d fahrenheit", celsius, (int) fahrenheit);
                break;
            case 2:
                System.out.printf("Celsius %.2f = %.2f fahrenheit", celsius, fahrenheit);
                break;
            default:
                System.out.println("Illegal argument");

        }
    }

    /**
     * Calculate celsius
     *
     * @param choice     int type
     * @param fahrenheit float type
     */
    public static void fahrenheitCelsius(int choice, float fahrenheit) {

        double celsius = (fahrenheit - 32) * 5 / 9;

        switch (choice) {

            case 1:
                System.out.printf("Fahrenheit %.2f = %d celsius", fahrenheit, (int) celsius);
                break;
            case 2:
                System.out.printf("Fahrenheit %.2f = %.2f celsius", fahrenheit, celsius);
                break;
            default:
                System.out.println("Illegal argument");

        }

    }

    //Exercise 10

    /**
     * Calculate and print sum of digit number
     *
     * @param number int type
     */
    public static void remainder(int number) {

        System.out.println("The digit sum of number " + number + " = " + sumDigits(number));
    }

    /**
     * Return reminder from sum of digits
     * divided to second parameter
     *
     * @param number int typ
     * @param div int type
     */
    public static void remainder(int number, int div) {

        System.out.println("The digit sum of number " + number + " mode divided " +
                div + " = " + sumDigits(number) % div);
    }

    // My necessary methods

    /**
     * Calculate sum of digits number
     * @param number int type
     * @return int type
     */
    public static int sumDigits(int number) {

        int sum = 0;

        while (number > 0) {

            sum += number % 10;

            number /= 10;
        }

        return sum;
    }
}
