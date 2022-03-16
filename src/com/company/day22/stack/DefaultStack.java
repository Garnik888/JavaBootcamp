package com.company.day22.stack;

public class DefaultStack implements Stack {

    private final int[] numbers;
    private int index = 0;
    private static final int MAX_SIZE = 5;

    public DefaultStack() {
        this.numbers = new int[MAX_SIZE];
    }

    @Override
    /**
     * Set integer value for array if
     * it is not out of bound
     */
    public void push(int val) {

        if (index == MAX_SIZE) {

            throw new StackIndexOutOfBoundsException(MAX_SIZE);
        }

        numbers[index] = val;

        index++;

    }

    @Override
    /**
     * Return last elements of array and replace number to 0
     * if array index 0 return EmptyStackException
     */
    public int pop() {

        if (index == 0) {
            throw new EmptyStackException();
        }

        int num = numbers[index - 1];
        numbers[index - 1] = 0;

        index--;

        return num;

    }

    /**
     * Print array list
     */
    public void display() {

        for (int i = 0; i < index; i++) {

            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}
