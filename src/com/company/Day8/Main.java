package com.company.day8;

import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

//        //Test Exercise 1 start
//        System.out.print("How old are you ? - ");
//        printEligibleToVote(scan.nextInt());
//        //Test Exercise 1 end
//
//        //Test Exercise 2 start
//        System.out.print("Impute numbers - ");
//        printNumberEvenOrNot(scan.nextInt());
//        //Test Exercise 2 end
//
//        //Test Exercise 2 end
//        randomNumber(rand.nextInt());
//        //Test Exercise 3 start
//
//        //Test exercise 4 start
//        System.out.print("Impute numbers - ");
//        printNumberMultiple5OrNot(scan.nextInt());
//        //Test Exercise 4 end
//
//        //Test exercise 5 start
//        System.out.print("Impute numbers 1 - ");
//        int num1 = scan.nextInt();
//        System.out.print("Impute numbers 2 - ");
//        int num2 = scan.nextInt();
//        System.out.print("Impute numbers 3 - ");
//        int num3 = scan.nextInt();
//        printGreatestNumber(num1, num2, num3);
//        //Test Exercise 5 end
//
//        //Test exercise 6 start
//        System.out.print("Impute float number - ");
//        printInfoRangeFlot(scan.nextFloat());
//        //Test Exercise 6 end
//
//        //Test exercise 7 start
//        System.out.print("Impute number of week day from 1 to 7 - ");
//        weekNumber(scan.nextInt());
//        //Test Exercise 7 end
//
//        //Test exercise 8 start
//        System.out.print("Impute number of bales ice cream - ");
//        canBuyIceCream(scan.nextInt());
//        //Test Exercise 8 end
//
//        //Test exercise 9 start
//        System.out.print("Enter the year so you know is the year leap - ");
//        printIsYearLeap(scan.nextInt());
//        //Test Exercise 9 end
//
//        //Test exercise 10 start
//        randomValueInfo(rand.nextInt());
//        //Test Exercise 10 end
//
//        //Test exercise 11 start
//        System.out.println("Exercise 11 is not complete 9/2");
//        //Test Exercise 11 end
//
//        //Test exercise 12 start
//        printOddOrEven(3, 12);
//        //Test Exercise 12 end
//
//        //Test exercise 13 start
//        System.out.print("Enter x coordinate point 1 - ");
//        int a_x = scan.nextInt();
//        System.out.print("Enter y coordinate point 1 - ");
//        int a_y = scan.nextInt();
//        System.out.print("Enter x coordinate point 2 - ");
//        int b_x = scan.nextInt();
//        System.out.print("Enter y coordinate point 2 - ");
//        int b_y = scan.nextInt();
//        coordinateQuarter(a_x, a_y, b_x, b_y);
//        //Test Exercise 13 end
//
//        //Test exercise 14 start
//        System.out.print("Enter side 1 - ");
//        int said_1 = scan.nextInt();
//        System.out.print("Enter side 2 - ");
//        int said_2 = scan.nextInt();
//        System.out.print("Enter side 3 - ");
//        int said_3 = scan.nextInt();
//        System.out.println("Is non-degenerate triangle - " +
//                isNotDegenerateTriangle(said_1, said_2, said_3));
//        //Test Exercise 14 end
//
        //Test exercise 15 start
        countEqualsNumber(1, 2, 3);
        //Test Exercise 15 end
//
//        //Test exercise 16 start
//        discriminant(15, 38, 16);
//        //Test Exercise 16 end

//        //Test exercise 17 start
//        sortingThreeNumbers(2,1,2);
//        //Test Exercise 17 end
//
//        for(int i = 20; i > 2; i -= 2 ){
//            System.out.println(" " + i + "\t" + isNumberITwoDegrees(i));
//        }

    }

    //Exercise 1 start

    /**
     * Are the person eligible to vote
     *
     * @param age int type
     * @return boolean type
     */
    public static boolean eligibleToVote(int age) {

        return (age >= 18);
    }

    /**
     * Print information Are the person eligible to vote
     *
     * @param age int type
     */
    public static void printEligibleToVote(int age) {

        if (eligibleToVote(age)) {
            System.out.printf("You are %d years old, you are eligible to vot!!!", age);
        } else {
            System.out.printf("You are %d years old, you are not eligible to vot!!!", age);
        }
    }
    //Exercise 1 end

    //Exercise 2 start

    /**
     * Is the number even?
     *
     * @param number int type
     * @return boolean type
     */
    public static boolean numberIsEven(int number) {

        return (number % 2 == 0);
    }

    /**
     * Print information is the number even
     *
     * @param number int type
     */
    public static void printNumberEvenOrNot(int number) {

        if (numberIsEven(number)) {
            System.out.printf("The %d number, is even!", number);
        } else {
            System.out.printf("The %d number, is not even!", number);
        }
    }
    //Exercise 2 end

    //Exercise 3 start

    /**
     * Generate random integer number from range 2 to 7
     *
     * @param number random int number
     */
    public static void randomNumber(int number) {
        number = number % 6 + 2;

        System.out.println(number);

    }
    //Exercise 3 end

    //Exercise 4 start

    /**
     * Is the number multiple 5?
     *
     * @param number int type
     * @return boolean type
     */
    public static boolean numberMultiple5(int number) {

        return (number % 5 == 0);
    }

    /**
     * Print information is the number multiple 5
     * * @param number int type
     */
    public static void printNumberMultiple5OrNot(int number) {

        if (numberMultiple5(number)) {
            System.out.printf("The %d number, is multiple 5!", number);
        } else {
            System.out.printf("The %d number, is not multiple 5!", number);
        }
    }
    //Exercise 4 end

    //Exercise 5 start

    /**
     * Max number of 3 integer numbers
     *
     * @param num1 int type
     * @param num2 int type
     * @param num3 int type
     */
    public static void printGreatestNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.printf("The greatest number  of %d, %d, %d = %d.", num1, num2, num3, num1);
        } else if (num2 > num3) {
            System.out.printf("The greatest number  of %d, %d, %d = %d.", num1, num2, num3, num2);
        } else {
            System.out.printf("The greatest number  of %d, %d, %d = %d.", num1, num2, num3, num3);
        }
    }
    //Exercise 5 end

    //Exercise 6 start

    /**
     * Determine float number is positive or negative or 0,
     * and small 1 or large 1 000 000 absolute value
     *
     * @param number float type
     */
    public static void printInfoRangeFlot(float number) {

        if (number == 0f) {
            System.out.print("zero\t");
        } else if (number < 0f) {
            System.out.print("negative\t");
        } else {
            System.out.print("positive\t");
        }

        if (Math.abs(number) < 1 && number != 0f) {
            System.out.println("small");
        } else if (Math.abs(number) > 1_000_000) {
            System.out.println("large");
        }
    }
    //Exercise 6 end

    //Exercise 7 start

    /**
     * Get number 1 - 7 output week day name
     *
     * @param number int type
     */
    public static void weekNumber(int number) {
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Out of range");
        }
    }
    //Exercise 7 end

    //Exercise 8 start

    /**
     * can buy ice cream when you can buy 3 or 5 bales
     *
     * @param balls int type
     * @return boolean type
     */
    public static boolean canBuyIceCream(int balls) {
        return (balls == 3 || balls == 5 || balls == 6
                || balls > 7);
    }

    /**
     * Print information cane you buy ice cream 3 or 5 bales
     *
     * @param bools int type
     */
    public static void printCabBuyIceCream(int bools) {

        if (canBuyIceCream(bools)) {
            System.out.println("You can buy ice cream");
        } else {
            System.out.println("You can not buy ice cream");
        }
    }
    //Exercise 8 end

    //Exercise 9 start

    /**
     * Is the year leap
     *
     * @param year int type
     * @return boolean type
     */
    public static boolean isYearLeap(int year) {
//        if (year % 4 == 0 && year % 100 != 0) {
//            return true;
//        } else return year % 4 == 0 && year % 400 == 0;

        if (year % 4 == 0) {

            if (year % 100 == 0) {
                return false;
            }
            if (year % 400 == 0) {
                return true;
            }
        } else {

            return false;
        }
        return false;
    }

    /**
     * Print information is the year leap
     *
     * @param year int type
     */
    public static void printIsYearLeap(int year) {

        if (isYearLeap(year)) {
            System.out.printf("The %d year is leap", year);
        } else {
            System.out.printf("The %d year is not leap", year);
        }
    }
    //Exercise 9 end

    //Exercise 10 start

    /**
     * corresponds conditions
     * -is greater than -1000  and less than 1000
     * -is multiple of 3 or input number is multiple of  5
     *
     * @param value int type
     */
    public static void randomValueInfo(int value) {
        boolean rangeVal;
        boolean multipleVal;

        rangeVal = value > -1000 && value < 1000;

        multipleVal = value % 3 == 0 || value % 5 == 0;

        System.out.printf("Is the random number %d in range from -1000 to 1000 - %b\n", value, rangeVal);
        System.out.printf("Is the random number %d multiply 3 or 5 - %b", value, multipleVal);
    }
    //Exercise 10 end

    //Exercise 11 start

    /**
     * If a and b corresponds for following requirements print
     * “Both a and b legal”, if any of them does not correspond
     * print about it like this “a is legal b is illegal ''. or vice versa
     *
     * @param a int type
     * @param b int type
     */
    public static void correspondsForFollowingRequirements(int a, int b) {
        String legal = "Both a and b legal";
        String aLegal = "a is legal b is illegal";
        String bLegal = "a is illegal b is legal";
        String illegal = "Both a and b illegal";

        System.out.println("Requirements 1");
        if (a > 10) {
            if (b != 0) {
                System.out.println(legal);
            } else {
                System.out.println(aLegal);
            }
        } else {
            if (b != 0) {

                System.out.println(bLegal);
            }

            System.out.println(illegal);
        }

        System.out.println("Requirements 2");
        if (a >= 0) {
            if (b >= 0) {
                System.out.println(legal);
            } else {
                System.out.println(aLegal);
            }
        } else {
            if (b >= 0) {

                System.out.println(bLegal);
            }

            System.out.println(illegal);
        }

        System.out.println("Requirements 3");
        if (a < 0) {
            if (b < 0) {
                System.out.println(legal);
            } else {
                System.out.println(aLegal);
            }
        } else {
            if (b < 0) {

                System.out.println(bLegal);
            }

            System.out.println(illegal);
        }

        System.out.println("Requirements 4");
        if (a > 10 && a % 2 == 0) {
            if (b < 1 && b % 2 == 0) {
                System.out.println(legal);
            } else {
                System.out.println(aLegal);
            }
        } else {
            if (b < 1 && b % 2 == 0) {

                System.out.println(bLegal);
            }

            System.out.println(illegal);
        }

        System.out.println("Requirements 5");
        if (a % 5 == 0 || b % 5 == 0) {
            System.out.println(legal);
        } else {
            System.out.println(illegal);
        }

        System.out.println("Requirements 6");
        if (a % 5 != 0 || b % 5 == 0) {
            System.out.println(legal);
        } else {
            System.out.println(illegal);
        }


    }
    //Exercise 11 end

    //Exercise 12 end

    /**
     * If corresponds for following requirements type odd value,
     * else even value
     *
     * @param a int type
     * @param b int type
     */
    public static void printOddOrEven(int a, int b) {

        if (a % 7 == 0 || b % 7 == 0 &&
                b >= 0 && a > b) {

            for (int i = b + 1; i < a; i++) {

                if (i % 2 != 0) {

                    System.out.println(i);
                }
            }
        } else {

            if (a > b) {

                for (int i = b + 1; i < a; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else {

                for (int i = a + 1; i < b; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
    //Exercise 12 end

    //Exercise 13 start

    /**
     * Given coordinates of two points in the
     * coordinate plane.
     * -	Print In the same quarter , else print Not in the same quarter.
     * -	Input 4 coordinates from console, all 4 coordinates != 0.
     *
     * @param a_x int type
     * @param a_y int type
     * @param b_x int type
     * @param b_y int type
     */
    public static void coordinateQuarter(int a_x, int a_y, int b_x, int b_y) {

        if (a_x > 0 && b_x > 0) {

            if (a_y > 0 && b_y > 0) {

                System.out.println("In the same quarter");

            } else if (a_y < 0 && b_y < 0) {
                System.out.println("In the same quarter");
            } else {

                System.out.println("Not in the same quarter");
            }

        } else if (a_x < 0 && b_x < 0) {

            if (a_y > 0 && b_y > 0) {

                System.out.println("In the same quarter");

            } else if (a_y < 0 && b_y < 0) {

                System.out.println("In the same quarter");
            } else {

                System.out.println("Not in the same quarter");
            }

        } else {

            System.out.println("Not in the same quarter");
        }
    }
    //Exercise 13 end

    //Exercise 14 start

    /**
     * Determine if there is a non-degenerate
     * triangle with such sides
     *
     * @param side_1 int type
     * @param side_2 int type
     * @param side_3 int type
     * @return boolean type
     */
    public static boolean isNotDegenerateTriangle(int side_1, int side_2, int side_3) {

        if (!(side_1 > 0 && side_2 > 0 && side_3 > 0)) {
            return false;
        }
        return (side_1 + side_2 > side_3 && side_1 + side_3 > side_2
                && side_2 + side_3 > side_1);
    }
    //Exercise 14 end

    //Exercise 15 start

    /**
     * Calculate of count equals number
     *
     * @param num_1 int type
     * @param num_2 int type
     * @param num_3 int type
     */
    public static void countEqualsNumber(int num_1, int num_2, int num_3) {

        int count = 0;

        if (num_1 == num_2) {
            count += 1;
        }
        if (num_1 == num_3) {

            count += 1;
        }
        if (num_2 == num_3) {

            count += 1;
        }

        System.out.println("Count of equals number = " + count);
    }
    //Exercise 15 end

    //Exercise 16 start

    /**
     * Print discriminant decisions
     *
     * @param a double a
     * @param b double a
     * @param c double a
     */
    public static void discriminant(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        if (d >= 0) {

            double x_1 = (-b + Math.sqrt(d)) / (2 * a);
            double x_2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Decisions - 1 = %f\nDecisions - 2 = %f\n", x_1, x_2);
        } else {

            System.out.println("Can't be");
        }
    }
    //Exercise 16 end

    //Exercise 17 start

    /**
     * Print sorted three numbers
     *
     * @param a int type
     * @param b int type
     * @param c int type
     */
    public static void sortingThreeNumbers(int a, int b, int c) {

        if (a > b) {

            if (b > c) {

                System.out.printf("- %d\n- %d\n- %d", c, b, a);

            } else if (a < c) {

                System.out.printf("- %d\n- %d\n- %d", b, a, c);
            } else {

                System.out.printf("- %d\n- %d\n- %d", b, c, a);
            }
        } else {

            if (a > c) {

                System.out.printf("- %d\n- %d\n- %d", c, a, b);
            } else if (b < c) {

                System.out.printf("- %d\n- %d\n- %d", a, b, c);
            } else {

                System.out.printf("- %d\n- %d\n- %d", a, c, b);
            }
        }

    }
    //Exercise 17 end

    /**
     * Is the number two degrees?
     *
     * @param number int type
     * @return boolean type
     */
    public static boolean isNumberITwoDegrees(int number) {

        while (number > 2) {

            if (number % 2 == 0) {
                number /= 2;
            } else {

                return false;
            }
        }
        return (number == 2 || number == 1);
    }
}
