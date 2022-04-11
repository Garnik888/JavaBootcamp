package com.company.day24;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 2, 3};

//        System.out.println(hasDuplicate(array));
//
//        printIfHaseNotDuplicate(array);
//
//        System.out.println(countDuplicateCharInString("babayagga"));
//        System.out.println(firstNonRepeatCharInString("uballbayyagad"));
        System.out.println(lengthWithoutRepeatingChar("bcadaefbjh"));
    }

    /**
     * Is array have duplicate
     *
     * @param array int[] type
     * @return boolean type
     */
    public static boolean hesDuplicate(int[] array) {

        Set<Integer> integerSet = new HashSet<>();

        for (int i : array) {

            if (!integerSet.add(i)) {

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
        char[] strChar = str.toCharArray();
        int countChar = 0;

        for (char ch : strChar) {
            if (charHashMap.get(ch) == null) {

                charHashMap.put(ch, 1);
            } else {

                charHashMap.put(ch, charHashMap.get(ch) + 1);
            }
        }

        for (Character ch1 : charHashMap.keySet()) {

            if (charHashMap.get(ch1) > 0) {

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
        char[] strChar = str.toCharArray();

        for (char ch : strChar) {
            if (charHashMap.get(ch) == null) {

                charHashMap.put(ch, 1);
            } else {

                charHashMap.put(ch, charHashMap.get(ch) + 1);
            }
        }

        for (char ch : strChar) {

            if (charHashMap.get(ch) == 1) {

                return ch;
            }
        }

        throw new NoSuchElementException("String doesn't unique element");
    }

    /**
     * Return length without repeating char
     *
     * @param str string type
     * @return int type
     */
    public static int lengthWithoutRepeatingChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maximumLength = 0;
        int start = 0;

        for (int end = 0; end < str.length(); end++) {

            if (map.containsKey(str.charAt(end))) {

                start = Math.max(start, map.get(str.charAt(end)) + 1);
            }

            map.put(str.charAt(end), end);
            maximumLength = Math.max(maximumLength, end - start + 1);
        }

        return maximumLength;
    }
}
