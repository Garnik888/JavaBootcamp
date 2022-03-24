package com.company.day25;

public class Main {

    public static void main(String[] args) {

        int number = 7;
        int[] arr = {1, 2, 3, 4, 5};
        String str = "23598499";
//
//        System.out.println("Sum of element array = " + sumArrayElements(arr, arr.length));
//
//        System.out.println("Factorial of " + number + " = " + factorial(number));
//
//        System.out.println("fibonacci number of " + number + " = " + fibonacci(number));
//
//        System.out.println(number + " row triangles made of " + trianglesMadeOfBlocks(number) + " blocks");
//
//        System.out.println("The sum of digits + " + number + " number = " + sumOfDigits(number));
//
//        System.out.println("The number " + number + " have " + count7Digits(number) + " - 7 digit");
//
//        System.out.println("The String " + str + " have " + countX(str) + " - x digit");
//
//        System.out.println("The String " + str + " with out x - " + removeAllX(str));
//
//        System.out.println("Revers " + str + " -> " + reversString(str));
//
//        System.out.println(str + " -> " + endX(str));
//
//        System.out.println(str + " -> " + stringClean(str));

        System.out.println("The number " + number + " is prim - " +isPrim(number, 2));
//
//        System.out.println("The max decimal number in string " + str + " = "
//                + maxDecimalNumberInString(str));
//
//        System.out.println("Output numbers of string + " + str + " = " + numberOfDigitsInString(str));
//
//        System.out.println(betweenAsteriskInLetters(str));
//
//        System.out.println(addOpeningAndClosingBrackets (str));
//
//        System.out.println(mirrorString(str));
//
//        System.out.println(str + " -> " + removeMirrorChar(str));
    }

    /**
     * Calculate sum of elements array
     *
     * @param arr    int [] type
     * @param length int type
     * @return int type
     */
    public static int sumArrayElements(int[] arr, int length) {

        if (length == 0) {

            return 0;
        }

        return arr[length - 1] + sumArrayElements(arr, length - 1);
    }

    /**
     * Calculate factorial from recursion method
     *
     * @param number int type
     * @return int type
     */
    public static int factorial(int number) {

        if (number == 0) {

            return 1;
        }

        return number * factorial(number - 1);
    }

    /**
     * Calculate fibonacci number
     *
     * @param number int type
     * @return int type
     */
    public static int fibonacci(int number) {

        if (number <= 1) {

            return number;
        }

        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    /**
     * Calculate how many bloc use for build triangle
     *
     * @param row int type
     * @return int type
     */
    public static int trianglesMadeOfBlocks(int row) {

        if (row == 0) {

            return 0;
        }

        return row + trianglesMadeOfBlocks(row - 1);
    }

    /**
     * Calculate sum of given  umber digits
     *
     * @param number int type
     * @return int type
     */
    public static int sumOfDigits(int number) {

        if (number / 10 == 0) {

            return number;
        }

        return number % 10 + sumOfDigits(number / 10);
    }

    /**
     * Return the count of the occurrences of 7 as a digit
     *
     * @param number int type
     * @return int type
     */
    public static int count7Digits(int number) {

        if (number / 10 == 0 && number % 10 == 7) {

            return 1;
        }

        if (number / 10 == 0 && number % 10 != 7) {

            return 0;
        }

        if (number % 10 == 7) {

            return 1 + count7Digits(number / 10);
        } else {

            return count7Digits(number / 10);
        }

    }

    /**
     * Compute the number of lowercase 'x' chars in the string.
     *
     * @param str String type
     * @return int type
     */
    public static int countX(String str) {

        if (str.length() == 1 && "x".equals(str)) {

            return 1;
        }
        if (str.length() == 1) {

            return 0;
        }

        if ("x".equals(str.substring(0, 1))) {

            return 1 + countX(str.substring(1));
        } else {

            return countX(str.substring(1));
        }

    }

    /**
     * Remove all x in string
     *
     * @param str String type
     * @return String type
     */
    public static String removeAllX(String str) {

        String strIfX = str.substring(1);

        if (str.length() == 1 && "x".equals(str)) {

            return "";
        }
        if (str.length() == 1) {

            return str;
        }

        if ("x".equals(str.substring(0, 1))) {

            return removeAllX(strIfX);
        } else {

            return str.charAt(0) + removeAllX(strIfX);
        }
    }

    /**
     * Revers string
     *
     * @param str STring type
     * @return String type
     */
    public static String reversString(String str) {

        int length = str.length() - 1;

        if (str.length() == 1) {

            return str;
        }

        return str.substring(length) + reversString(str.substring(0, length));
    }


    /**
     * All the lowercase 'x' chars have been moved to the end of the string
     *
     * @param str String type
     * @return String type
     */
    public static String endX(String str) {

        if (str.length() == 0) {
            return "";
        }

        if ("x".equals(str.substring(0, 1))) {

            return endX(str.substring(1)) + "x";
        } else {

            return str.charAt(0) + endX(str.substring(1));
        }
    }

    /**
     * Return recursively a "cleaned" string where adjacent
     * chars that are the same have been reduced to a single char
     *
     * @param str String type
     * @return String type
     */
    public static String stringClean(String str) {

        if (str.length() == 2) {

            if (str.charAt(0) == str.charAt(1)) {

                return str.substring(1);
            } else {

                return str;
            }
        }

        if (str.charAt(0) == str.charAt(1)) {

            return stringClean(str.substring(1));
        } else {

            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    /**
     * Is nuber of prim
     * @param number int type
     * @param index int type
     * @return boolean type
     */
    public static boolean isPrim(int number, int index) {

        if(index <= number / 2 + 1) {

            return number % index != 0;
        }

        if(number % index == 0) {

            return false;
        }

        return isPrim(number, ++index);
    }

    /**
     * Find in string and display the largest decimal digit.
     * @param str String type
     * @return int type
     */
    public static int maxDecimalNumberInString(String str) {

        if (str.length() == 2) {

            return Integer.parseInt(str);
        }

        return Math.max(Integer.parseInt(str.substring(0, 2)),
                maxDecimalNumberInString(str.substring(1)));
    }

    /**
     * Find and display the number of digits from string
     *
     * @param str String type
     * @return String type
     */
    public static String numberOfDigitsInString(String str) {

        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '9') {

            return str;
        }

        if (str.length() == 1) {

            return "";
        }

        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {

            return str.charAt(0) + numberOfDigitsInString(str.substring(1));
        } else {

            return numberOfDigitsInString(str.substring(1));
        }
    }

    /**
     * Add the ‘*’ (asterisk) character between letters.
     *
     * @param str String type
     * @return String type
     */
    public static String betweenAsteriskInLetters(String str) {

        if (str.length() == 1) {

            return str;
        }

        return str.charAt(0) + "*" + betweenAsteriskInLetters(str.substring(1));
    }

    /**
     * Add opening and closing parentheses according to the following pattern.
     *
     * @param str String type
     * @return String type
     */
    public static String addOpeningAndClosingBrackets(String str) {

        int length = str.length() - 1;

        if (str.length() < 2 && str.length() % 2 == 0) {

            return str;
        }

        if (str.length() < 2) {

            return "(" + str + ")";
        }

        return "(" + str.charAt(0) +
                addOpeningAndClosingBrackets(str.substring(1,length)) +
                str.substring(length) + ")";
    }

    /**
     * @param str String type
     * @return String type
     */
    public static String mirrorString(String str) {

        if (str.length() == 1 && "(".equals(str)) {

            return str + ")";
        }

        if (str.length() == 1) {

            return str;
        }

        if ("(".equals(str.substring(0, 1))) {

            return str.charAt(0) + mirrorString(str.substring(1)) + ")";
        } else {

            return str.charAt(0) + mirrorString(str.substring(1)) + str.charAt(0);
        }
    }

    /**
     * Remove mirror char in given string
     *
     * @param str String type
     * @return String type
     */
    public static String removeMirrorChar(String str) {

        int len = str.length() - 1;

        if (str.length() == 2) {

            if (str.charAt(0) == str.charAt(1)) {

                return "";
            } else {

                return str;
            }
        }

        if (str.length() == 1) {

            return str;
        }

        if (str.charAt(0) == str.charAt(len)) {

            return removeMirrorChar(str.substring(1, len));
        } else {

            return str.charAt(0) + removeMirrorChar(str.substring(1, len)) + str.charAt(len);
        }
    }
}

