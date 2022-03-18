package com.company.day23;

public interface List extends Iterable<Integer> {

    int size();

    boolean isEmpty();

    int get(int index) throws IndexOutOfBoundsException;

    void add(int val);

    void add(int index, int val) throws IndexOutOfBoundsException;

    void delete(int index) throws IndexOutOfBoundsException;
}
