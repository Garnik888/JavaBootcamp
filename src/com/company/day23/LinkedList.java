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

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private class LinkedListIterator implements Iterator<Integer> {

        private int index;


        Node lastElement = head;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {

            int value = lastElement.val;
            lastElement = lastElement.next;
            index++;
            return value;
        }
    }

    //Constructor for Node class
    public LinkedList() {

    }

    /**
     * Get LinkedList head field
     *
     * @return Node reference type
     */
    public Node getHead() {
        return head;
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
    public int get(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        for (int i = 0; i < index; i++) {

            findElement = findElement.next;
        }
        return findElement.getVal();
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
    public void add(int index, int val) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {

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
    public void delete(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        if (index == 0) {

            head = findElement.next;
            size--;
            return;
        }

        for (int i = 0; i < index - 1; i++) {

            findElement = findElement.next;
        }

        findElement.setNext(findElement.next.next);
        size--;
    }

    @Override
    public String toString() {

        Node findElement = head;
        StringBuilder strLink = new StringBuilder("[");

        if (size > 0) {
            for (int i = 0; findElement != null; i++) {

                strLink.append(findElement.getVal());
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
