package com.company.day24;

import com.company.day23.MyIntegerArrayList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 1, 2, 3, 4};

        System.out.println(haveDuplicate(array));

        printIfHaseNotDuplicate(array);

        System.out.println(countDuplicateCharInString("babayaga"));
        System.out.println(firstNonRepeatCharInString("babayyaga"));
        System.out.println(lengthWithoutRepeatingChar("babayyaag"));
    }

    /**
     * Is array have duplicate
     *
     * @param array int[] type
     * @return boolean type
     */
    public static boolean haveDuplicate(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    return true;
                }

            }
        }

        return false;
    }

    /**
     * Print all non duplicate value
     *
     * @param array int[] type
     */
    public static void printIfHaseNotDuplicate(int[] array) {

        boolean flag;

        for (int i = 0; i < array.length; i++) {

            flag = true;

            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j] && i != j) {

                    flag = false;
                }
            }

            if (flag) {

                System.out.println(array[i]);
            }
        }
    }

    /**
     * Count how many duplicate char in string
     *
     * @param str String type
     * @return int type
     */
    public static int countDuplicateCharInString(String str) {

        char[] ch = str.toCharArray();
        int countChar = 0;

        for (int i = 0; i < ch.length; i++) {

            int count = 0;
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {

                    count++;
                }
            }

            if (count == 1) {

                countChar++;
            }
        }

        return countChar;
    }

    /**
     * Returns the first non-repeated character from a given string.
     *
     * @param str String type
     * @return char type
     */
    public static char firstNonRepeatCharInString(String str) {

        char[] ch = str.toCharArray();
        boolean flag;

        for (int i = 0; i < ch.length; i++) {

            flag = true;
            for (int j = 0; j < ch.length; j++) {

                if (ch[i] == ch[j] && i != j) {

                    flag = false;
                    break;
                }
            }

            if (flag) {

                return ch[i];
            }
        }

        return ' ';
    }

    /**
     *Return length without repeating char
     * @param str string type
     * @return int type
     */
    public static int lengthWithoutRepeatingChar(String str) {

        char [] ch = str.toCharArray();
        int lengthWithoutRepeatingChar = ch.length;

        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {

                if(ch[i] == ch[j]) {

                    lengthWithoutRepeatingChar--;
                    break;
                }
            }
        }

        return lengthWithoutRepeatingChar;
    }
}
