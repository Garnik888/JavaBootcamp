package com.company.day24;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 2, 3};

//        System.out.println(isHaveDuplicate(array));
//
//        printIfHaseNotDuplicate(array);
//
//        System.out.println(countDuplicateCharInString("babayagga"));
        System.out.println(firstNonRepeatCharInString("uuballbayyaggad"));
//        System.out.println(lengthWithoutRepeatingChar("abbal"));
    }

    /**
     * Is array have duplicate
     *
     * @param array int[] type
     * @return boolean type
     */
    public static boolean isHaveDuplicate(int[] array) {

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            if (!integerSet.add(array[i])) {

                return true;
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

        Map<Integer, Integer> intHashMap = new HashMap<>();

        for (int i : array) {

            if (intHashMap.get(i) == null) {
                intHashMap.put(i, 0);
            } else {
                intHashMap.put(i, 1);
            }
        }

        for (Integer key : intHashMap.keySet()) {
            if (intHashMap.get(key) == 0) {

                System.out.println(key);
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

        Map<Character, Integer> charHashMap = new HashMap<>();
        char[] ch = str.toCharArray();
        int countChar = 0;

        for (char ch1 : ch) {
            if (charHashMap.get(ch1) == null) {
                charHashMap.put(ch1, 0);
            } else {

                charHashMap.put(ch1, 1);
            }
        }

        for (Character ch1 : charHashMap.keySet()) {

            if(charHashMap.get(ch1) > 0) {

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

        Map<Character, Integer> charHashMap = new HashMap<>();
        char[] ch = str.toCharArray();

        for (char ch1 : ch) {
            if (charHashMap.get(ch1) == null) {
                charHashMap.put(ch1, 0);
            } else {

                charHashMap.put(ch1, 1);
            }
        }

        for (Character ch1 : charHashMap.keySet()) {

            if(charHashMap.get(ch1) == 0) {

                return ch1;
            }
        }

        return ' ';
    }

    /**
     * Return length without repeating char
     *
     * @param str string type
     * @return int type
     */
    public static int lengthWithoutRepeatingChar(String str) {

        char[] ch = str.toCharArray();
        Set<Character> integerSet = new HashSet<>();

        for (int i = 0; i < ch.length; i++) {

            integerSet.add(ch[i]);
        }

        return integerSet.size();
    }
}
