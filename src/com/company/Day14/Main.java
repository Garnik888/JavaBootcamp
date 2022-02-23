package com.company.Day14;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Test exercise 1
//
//        String str = "Java";
//        System.out.println("The length of str = " + lengthString(str));
//
//        //Test exercise 2
//
//        String str = "Java";
//        System.out.print("Enter index - ");
//        int index = scan.nextInt();
//        System.out.printf("The char of %d index  = %s", index, indexOfChar(str, index));
//
//        //Test exercise 3
//
//        System.out.print("Enter string - ");
//        String str = scan.nextLine();
//        System.out.print("Enter char - ");
//        System.out.println(haveChar(str, scan.next().charAt(0)));
//
//        //Test exercise 4
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//        System.out.printf("The String - \"%s\" have a %d vowel letter.", str, countOfVowels(str));
//
//        //Test exercise 5
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//        System.out.println("The revers of string - " + str +" = " + reversString(str));
//
//        //Test exercise 6
//
//        System.out.print("Enter string - ");
//        printCountNumbersVowelsAndPercentages(scan.nextLine());
//
//        //Test exercise 7
//
//        System.out.print("Enter string - ");
//        caesarCode(scan.nextLine());
//
//        //Test exercise 8
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//
//        if(isPalindrome(str)){
//
//            System.out.println("Yes the string - " + str + " is palindrome.");
//        } else {
//
//            System.out.println("No the string - " + str + " is not palindrome.");
//        }
//
//        //Test exercise 9
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//
//        if(checkBinStr(str)){
//
//            System.out.println("Yes the string - " + str + " is binary.");
//        } else {
//
//            System.out.println("No the string - " + str + " is not binary.");
//        }
//
//        //Test exercise 10
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//
//        if(checkHexStr(str)){
//
//            System.out.println("Yes the string - " + str + " is hexadecimal .");
//        } else {
//
//            System.out.println("No the string - " + str + " is not hexadecimal .");
//        }
//
//        //Test exercise 11
//
//        System.out.print("Enter string - ");
//        bin2Dec(scan.next());
//
//        //Test exercise 12
//        System.out.print("Enter string - ");
//        String str = scan.next();
//
//        System.out.println("In the string - " + str
//                + " count - " + countsDuplicateChar(str) +
//                " duplicate char.");
//
//
//        //Test exercise 13
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//
//        System.out.println("The first non-repeated character from string  - "
//                + str + " is - " + nonRepeatedFirstSymbol(str));
//
//        //Test exercise 14
//
//        System.out.print("Enter string - ");
//        String str = scan.next();
//
//        System.out.print("Enter char - ");
//        char ch =  scan.next().charAt(0);
//        System.out.println(LocalTime.now());
//        System.out.println("The count occurrences in string - " + str
//                + " of char - " + ch + " is " + occurrencesOfChar(str, ch));
//        System.out.println(LocalTime.now());

        LocalTime timeStart = LocalTime.of(00, 00, 00);
        LocalTime timeStop = LocalTime.of(00, 01, 00);
        stopwatch(timeStart, timeStop);

    }

    //Exercise 1

    /**
     * Return length of string
     *
     * @param str String type
     * @return int type
     */
    public static int lengthString(String str) {

        return str.length();
    }

    //Exercise 2

    /**
     * return char for index
     *
     * @param str   string type
     * @param index int type
     * @return char type
     */
    public static char indexOfChar(String str, int index) {

        return str.charAt(index);
    }

    //Exercise 3

    /**
     * Have a string enter char
     *
     * @param str String type
     * @param ch  char type
     * @return boolean type
     */
    public static boolean haveChar(String str, char ch) {

        return str.contains("" + ch);

    }

    //Exercise 4

    /**
     * How many vowels have a string
     *
     * @param str String type
     * @return int type
     */
    public static int countOfVowels(String str) {

        int count = 0;

        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {

            switch (strArray[i]) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                    break;
            }
        }

        return count;
    }

    //Exercise 5

    /**
     * Return revers of given string
     *
     * @param str String type
     * @return String type
     */
    public static String reversString(String str) {

        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length / 2; i++) {

            changeElementsPlace(strArray, i, strArray.length - 1 - i);
        }

        return new String(strArray);

    }

    //Exercise 6

    /**
     * counts the number of vowels and digits contained in the string,
     * and prints the counts and the percentages (rounded to 2 decimal places).
     *
     * @param str String type
     */
    public static void printCountNumbersVowelsAndPercentages(String str) {

        int count_vowel = countOfVowels(str);
        int count_number = countOfNumber(str);

        double percentVowel = (double) count_vowel / str.length() * 100;
        double percentNumber = (double) count_number / str.length() * 100;

        System.out.printf("Number of vowels: %d (%.2f %%)", count_vowel, percentVowel);
        System.out.printf("\nNumber of numbers: %d (%.2f %%)", count_number, percentNumber);
    }

    //Exercise 7

    /**
     * Print string in Caesar's Code type
     *
     * @param str String type
     */
    public static void caesarCode(String str) {

        char[] strArray = str.toUpperCase(Locale.ROOT).toCharArray();

        for (int i = 0; i < strArray.length; i++) {

            switch (strArray[i]) {
                case 'X':

                    strArray[i] = 'A';
                    break;
                case 'Y':

                    strArray[i] = 'B';
                    break;

                case 'Z':

                    strArray[i] = 'C';
                    break;

                default:
                    strArray[i] = (char) (strArray[i] + 3);
            }
        }

        System.out.println("The string" + str + "after Caesar's Code = "
                + new String(strArray).toUpperCase());
    }

    //Exercise 8

    /**
     * Check is the string of palindrome ignore Case
     *
     * @param str String type
     * @return boolean typ
     */
    public static boolean isPalindrome(String str) {

        return str.toLowerCase(Locale.ROOT).equals(reversString(str).toLowerCase(Locale.ROOT));

    }

    //Exercise 9

    /**
     * Check is the string binary
     *
     * @param str String type
     * @return boolean type
     */
    public static boolean checkBinStr(String str) {

        char[] strArray = str.toCharArray();

        for (char i : strArray) {

            if (i != '0' && i != '1') {

                return false;
            }
        }

        return true;
    }

    //Exercise 10

    /**
     * Check is the string hexadecimal
     *
     * @param str String type
     * @return boolean type
     */
    public static boolean checkHexStr(String str) {

        char[] strArray = str.toLowerCase(Locale.ROOT).toCharArray();

        for (char i : strArray) {

            if(!(i >=  '0' && i <= '9'  || i >= 'a' && i <= 'f')){

                return false;
            }
        }

        return true;
    }

    //Exercise 11

    /**
     * Check and print string enter binary number
     *
     * @param str String type
     */
    public static void bin2Dec(String str) {

        if (!checkBinStr(str)) {

            System.out.println("invalid binary string  - " + str);
            return;
        }

        char[] strArray = str.toCharArray();

        int decNumber;
        // char 0 - int 48
        int binNumber = strArray[0] - 48;

        for (int i = 1; i < strArray.length; i++) {

            binNumber = binNumber * 10 + (strArray[i] - 48);
        }

        //Import method from my homework day 11
        decNumber = com.company.Day11.Main.binaryConvertInteger(binNumber);

        System.out.println("The string binary number - " + str + " = " + decNumber
                + " decimal number.");
    }

    //Exercise 12

    /**
     * Counts duplicate characters from a given string
     *
     * @param str String type
     * @return int type
     */
    public static int countsDuplicateChar(String str) {

        int count = 0;
        int countRange;
        char[] strArray = str.toCharArray();

        sortedList(strArray);

        for (int i = 0; i < strArray.length - 1; i++) {

            countRange = 0;

            for (int j = i + 1; j < strArray.length; j++) {

                if (strArray[i] == strArray[j]) {

                    countRange++;

                } else {

                    break;
                }

            }

            if (countRange > 0) {

                count++;

                i = i + countRange;
            }
        }

        return count;
    }

//    /**
//     * Counts duplicate characters from a given string
//     * @param str String type
//     * @return int type
//     */
//    public static int countsDuplicateChar_2(String str) {
//
//        int count = 0;
//
//        StringBuilder strBuild = new StringBuilder(str);
//
//        for (int i = 0; i < strBuild.length(); i++) {
//
//            if(str.indexOf(strBuild.charAt(i)) == str.lastIndexOf(strBuild.charAt(i))){
//
//                count++;
//
//                strBuild.replace(i, i + 1, "");
//            }
//        }
//
//        return count;
//    }

    //Exercise 13

    /**
     * Returns the first non-repeated character from a given string.
     *
     * @param str String type
     */
    public static char nonRepeatedFirstSymbol(String str) {

        boolean flag;
        char firstChar = ' ';
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {

            flag = true;

            for (int j = 0; j < strArray.length; j++) {

                if (strArray[i] == strArray[j] && i != j) {

                    flag = false;
                    break;
                }
            }

            if (flag) {

                firstChar = strArray[i];
                return firstChar;
            }

        }
        return firstChar;
    }

    //Exercise 14??????????????????????????????????????????????????

    /**
     * Counts occurrences of a certain character in a given string
     *
     * @param str String type
     * @param ch  char type
     * @return boolean type
     */
    public static boolean occurrencesOfChar(String str, char ch) {

        if (str.indexOf(ch) >= 0) {

            return true;
        }
        return false;
    }

    // My necessary methods

    /**
     * Change char array elements place
     *
     * @param chArray char[] array type
     * @param index_1 int type
     * @param index_2 int type
     */
    public static void changeElementsPlace(char[] chArray, int index_1, int index_2) {

        char type = chArray[index_1];
        chArray[index_1] = chArray[index_2];
        chArray[index_2] = type;
    }

    /**
     * How many numbers have a string
     *
     * @param str String type
     * @return int type
     */
    public static int countOfNumber(String str) {

        int count = 0;

        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {

            switch (strArray[i]) {

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
                    count++;
                    break;
            }
        }

        return count;
    }

    /**
     * Sorting list program
     *
     * @param array char [] array
     */
    public static void sortedList(char[] array) {

        char minChar;

        for (int i = 0; i < array.length; i++) {

            minChar = array[i];

            for (int j = i + 1; j < array.length; j++) {

                if (minChar > array[j]) {

                    array[i] = array[j];

                    array[j] = minChar;

                    minChar = array[i];
                }
            }
        }
    }

    //Data Time methods

    public static void stopwatch(LocalTime start, LocalTime stop) {

//        LocalTime timeStart = LocalTime.of(00, 00, 00);
//        LocalTime timeStop = LocalTime.of(00, 01, 00);

        LocalTime upTo = start;

        while (upTo.isBefore(stop)) {

            upTo = upTo.plusSeconds(1);
            System.out.println(upTo);
        }
    }
}
