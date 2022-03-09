package com.company.day22.stack;

public class DefaultStack implements Stack {

    private int[] numbers;
    private int index = 0;
    public static final int MAX_SIZE = 5;

    public DefaultStack(int[] numbers) {
        this.numbers = numbers;
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

        for (int i : numbers) {

            System.out.print(i + " ");
        }

        System.out.println();
    }
}
