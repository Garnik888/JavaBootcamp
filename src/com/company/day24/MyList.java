package com.company.day24;

public interface MyList extends Iterable<Integer> {

    int size();

    boolean isEmpty();

    boolean contains(int num);

    int[] toArray();

    void add(int num);

    void add(int index, int num);

    void remove(int index);

    int get(int index);

    void set(int index, int num);

    int indexOf(int num);


}
