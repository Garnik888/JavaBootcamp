package com.company.day23;


import java.util.Iterator;

public class MyIntegerArrayList implements MyList {

    private static final int DEF_CAPACITY = 10;
    private int capacity = DEF_CAPACITY;
    private int size;
    private int[] arrayList;

    //Constructor for class MyIntegerArrayList
    public MyIntegerArrayList() {
        this.arrayList = new int[capacity];
    }

    //Nested iterator class
    private class ArrayListIterator implements Iterator<Integer> {

        public int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {

            int value = arrayList[index];
            index++;
            return value;
        }
    }

    //Override methods for class MyIntegerArrayList

    /**
     * Retyurn size of array list
     *
     * @return int type
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Check is the list empty
     *
     * @return boolean type
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * CHeck have the list method input parameter
     *
     * @param num int type
     * @return boolean type
     */
    @Override
    public boolean contains(int num) {

        for (int i = 0; i < size; i++) {

            if (arrayList[i] == num) {

                return true;
            }

        }

        return false;
    }

    /**
     * Replace MyIntegerArrayList to array
     *
     * @return int [] type
     */
    @Override
    public int[] toArray() {

        int[] array = new int[size];

        System.arraycopy(arrayList, 0, array, 0, size);

        return array;
    }

    /**
     * Add new value in new last place
     *
     * @param num int type
     */
    @Override
    public void add(int num) {

        if (checkLength()) {
            grow();
        }
        arrayList[size] = num;
        size++;
    }

    /**
     * Add new value in given place and shift array list to right
     *
     * @param index int type
     * @param num   int type
     */
    @Override
    public void add(int index, int num) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }

        if (checkLength()) {
            grow();
        }

        if (size + 1 - index >= 0) {
            System.arraycopy(arrayList, index, arrayList,
                    index + 1, size + 1 - index);
        }

        arrayList[index] = num;
        size++;
    }

    /**
     * Delete value in given place and shift right part to left
     *
     * @param index int type
     */
    @Override
    public void remove(int index) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }

        if (size - 1 - index >= 0) {
            System.arraycopy(arrayList, index + 1, arrayList, index,
                    size - 1 - index);
        }

        arrayList[size - 1] = 0;
        size--;
    }

    /**
     * Return array list value in given index
     *
     * @param index int type
     * @return int type
     */
    @Override
    public int get(int index) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }
        return arrayList[index];
    }

    /**
     * Replace value array list in given index
     *
     * @param index int type
     * @param num   int type
     */
    @Override
    public void set(int index, int num) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }

        arrayList[index] = num;
    }

    /**
     * Return index if array list have given parameter
     * else return -1
     *
     * @param num int type
     * @return int type
     */
    @Override
    public int indexOf(int num) {

        for (int i = 0; i < size; i++) {

            if (arrayList[i] == num) {

                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayListIterator();
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("[");

        for (int i = 0; i < size; i++) {

            if (i == size - 1) {
                str.append(arrayList[i]).append("]");
            } else {

                str.append(arrayList[i]).append(" ");
            }
        }

        return str.toString();
    }

    //My necessary methods

    /**
     * Check if the length is full
     *
     * @return boolean type
     */
    private boolean checkLength() {

        return size == capacity;
    }

    /**
     * Grow the array list
     */
    private void grow() {

        int[] array;
        capacity *= 2;
        array = new int[capacity];

        if (size >= 0) {
            System.arraycopy(arrayList, 0, array, 0, size);
        }

        arrayList = array;
    }
}
