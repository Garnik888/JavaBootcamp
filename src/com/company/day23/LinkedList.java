package com.company.day23;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList implements List {

    //Fields of LinkedList class
    private int size = 0;
    private Node head;

    // Static native class
    private static class Node {

        //Fields of Node class
        private int index = 0;
        private int val;
        private Node next;

        //Constructor for Node class
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node() {

        }

    }

    private class LinkedListIterator implements Iterator<Integer> {


        Node lastElement = head;

        @Override
        public boolean hasNext() {
            return lastElement != null;
        }

        @Override
        public Integer next() {

            int value = lastElement.val;
            lastElement = lastElement.next;
            return value;
        }
    }

    //Constructor for Node class
    public LinkedList() {

    }

    /**
     * Return LinkedList class length
     *
     * @return int type
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * This method define is the LinkedList class empty
     *
     * @return boolean type
     * /
     * @Override public boolean isEmpty() {
     * <p>
     * return size == 0;
     * }
     * <p>
     * /**
     * This method return element in LinkedList class
     * in concrete please
     */
    @Override
    public int get(int index) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        for (int i = 0; i < index; i++) {

            findElement = findElement.next;
        }
        return findElement.val;
    }

    /**
     * This method add new element in LinkedList class
     */
    @Override
    public void add(int val) {

        Node lastElement = head;

        if (size == 0) {

            head = new Node(val, null);
        } else {

            while (lastElement.next != null) {

                lastElement = lastElement.next;
            }

            lastElement.next = new Node(val, null);
        }

        size++;
    }

    /*
     * This method add new element in LinkedList class
     * in concrete please
     * */
    @Override
    public void add(int index, int val) {

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        if (index == 0) {

            head = new Node(val, findElement);

            size++;

            return;
        }

        for (int i = 0; i < index - 1; i++) {

            findElement = findElement.next;
        }

        findElement.next = new Node(val, findElement.next);

        size++;

    }

    @Override
    /*
     * This method delete element in LinkedList class
     * in concrete please
     * */
    public void delete(int index) {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        if (index == 0) {

            head = findElement.next;
        } else {

            for (int i = 0; i < index - 1; i++) {

                findElement = findElement.next;
            }

            findElement.next = findElement.next.next;

        }

        size--;
    }

    @Override
    public String toString() {

        Node findElement = head;
        StringBuilder strLink = new StringBuilder("[");

        if (size > 0) {
            for (int i = 0; findElement != null; i++) {

                strLink.append(findElement.val);
                strLink.append(" -> ");
                findElement = findElement.next;

            }

            strLink.append("null");
        }

        strLink.append("]");


        return strLink.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

}
