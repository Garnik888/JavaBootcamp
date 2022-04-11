package com.company.day27.Main;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        ArrayList<String> stringList = fileToList();

        for (String str : stringList) {

            System.out.println(str);
        }

        System.out.println(stringRepeatCount(stringList, "hello"));

        createInFailList(stringRepeatCount(stringList, "hello"));

    }

    /**
     * Create file line to ArrayList
     *
     * @return ArrayList<String>
     */
    public static ArrayList<String> fileToList() throws IOException {

        ArrayList<String> stringList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("read.txt"));

        while (bufferedReader.ready()) {
            if (bufferedReader.ready()) {
                stringList.add(bufferedReader.readLine());
            }
        }

        return stringList;
    }

    /**
     * Return how meni time repeat parametr string in ArrayList
     *
     * @param strings ArrayList<String>
     * @param str     String
     * @return ArrayList<Integer>
     */
    public static ArrayList<Integer> stringRepeatCount(ArrayList<String> strings, String str) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (String string : strings) {

            int count = 0;

            for (int j = 0; j < string.length() - str.length(); ) {

                if (string.substring(j).toLowerCase(Locale.ROOT).
                        contains(str.toLowerCase(Locale.ROOT))) {

                    j += string.substring(j).toLowerCase(Locale.ROOT).
                            indexOf(str.toLowerCase(Locale.ROOT)) + str.length();
                    count += 1;

                } else {

                    break;
                }
            }

            arrayList.add(count);
        }

        return arrayList;
    }

    /**
     * Write in txt file
     *
     * @param integers ArrayList<Integer>
     */
    public static void createInFailList(ArrayList<Integer> integers) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("writ.txt"));

        for (int i = 0; i < integers.size(); i++) {

            bufferedWriter.write("Line " + (i + 1) + " - " + integers.get(i) + "\n");

        }

        bufferedWriter.flush();

        bufferedWriter.close();
    }
}
