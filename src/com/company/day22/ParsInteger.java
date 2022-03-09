package com.company.day22;

import java.util.Scanner;

public class ParsInteger {

    public static void main(String[] args) {

        System.out.println(parsInteger());
    }

    /**
     * Enter number by string type return integer if string
     * numerical else enter again
     * @return int type
     */
    public static int parsInteger() {

        Scanner scan = new Scanner(System.in);

        int number;

        while (true) {

            System.out.print("Enter number - ");
            String str = scan.nextLine();

            try {

                Integer.parseInt(str);
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {

                System.out.println("Your input incorrect input number type");
            }
        }
    }
}

