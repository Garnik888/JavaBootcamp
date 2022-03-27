package com.company.day26;

import java.util.*;

public class Main<T> {

    public static void main(String[] args) {

//        List<Integer> list = new LinkedList<>();
//
//        list.add(10);
//        list.add(26);
//        list.add(8);
//        list.add(20);
//
//        printList(list);
//
//        String [] array = {"Garnik", "Angela", "Gaby", "Sofi"};
//
//        List<String> list1 = convertToList(array);
//
//        printList(list1);
//
//        Person p1 = new Person("Garnik", 36);
//        Person p2 = new Person("Gabrela", 10);
//        Person p3 = new Person("Angela", 33);
//
//        List<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//
//        Comparator<Person> personComparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.compareTo(o2);
//            }
//        };
//
//        String str1 = "Tom";
//        String str2 = "Jon";
//        String str3 = "Liza";
//
//        List<String> name = new ArrayList<>();
//        name.add(str1);
//        name.add(str2);
//        name.add(str3);
//
//        System.out.println(largestValue(name, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        }));
//
//        List<Integer> integerList = new ArrayList<>();
//        List<Number> numbers = new ArrayList<>();
//        Integer[] arr = {2, 5, 19, 6, 28};
//        integerList.addAll(convertToList(arr));
//
//        copy(numbers, integerList);
//        System.out.println(numbers);

        DefaultPair<String, Integer> defaultPair = new DefaultPair<>("Tom", 25);

        System.out.println(defaultPair.getKey());
        System.out.println(defaultPair.getValue());

    }

    /**
     * print list
     *
     * @param list List<T> type
     * @param <T>  any reference type
     */
    public static <T> void printList(List<T> list) {

        System.out.print("[ ");

        for (T tType : list) {

            System.out.print(tType + " ");
        }

        System.out.println("]");
    }

    /**
     * Convert array t type it to a list of type T
     *
     * @param arr T [] type
     * @param <T> any reference type
     * @return List type
     */
    public static <T> List<T> convertToList(T[] arr) {

        return new ArrayList<>(Arrays.asList(arr));
    }

    /**
     * Return the largest value in the list
     *
     * @param list       List<T> type
     * @param comparator Comparator<T> type
     * @param <T>        any reference type
     * @return int type
     */
    public static <T> T largestValue(List<T> list, Comparator<T> comparator) {

        T largestValue = list.get(0);
        int index = 1;

        while (index < list.size()) {
            if (comparator.compare(largestValue, list.get(index)) < 0) {

                largestValue = list.get(index);
            }

            index++;
        }

        return largestValue;
    }

    /**
     * Copy on list to another type list
     *
     * @param <T>  any reference type
     * @param dest List<?> type
     * @param src  List<T> type
     * @return
     */
    public static <T> void copy(List<? super T> dest, List<T> src) {

        dest.addAll(src);
    }


}
