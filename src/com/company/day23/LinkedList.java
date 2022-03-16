package com.company.day23;

import java.util.ArrayList;

public class LinkedList implements List {

    //Fields of LinkedList class
    private int size = 0;
    private Node head;

    // Static native class
    static class Node {

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

        //Fields of Node class
        private int val;
        private Node next;

        //Constructor for Node class
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
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

    @Override
    /*
     *Return LinkedList class length
     *@return int type
     * */
    public int size() {
        return size;
    }

    @Override
    /*
     *This method define is the LinkedList class empty
     *@return boolean type
     * */
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    /*
     * This method return element in LinkedList class
     * in concrete please
     * */
    public int get(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        for (int i = 0; i < index; i++) {

            findElement = findElement.next;
        }
        return findElement.getVal();
    }

    @Override
    /*
     * This method add new element in LinkedList class
     * */
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

    @Override
    /*
     * This method add new element in LinkedList class
     * in concrete please
     * */
    public void add(int index, int val) throws IndexOutOfBoundsException {

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException();
        }

        Node findElement = head;

        for (int i = 0; i < index; i++) {

            findElement = findElement.next;
        }

        findElement.setVal(val);

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

        if (index == size) {

            findElement = null;
            size--;
            return;
        }

        for (int i = 0; i < index - 1; i++) {

            findElement = findElement.next;
        }

        findElement.setNext(findElement.next.getNext());
        size--;
    }

    @Override
    public String toString() {

        Node findElement = head;
        StringBuilder strLink = new StringBuilder("[");

        if (size > 0) {
            for (int i = 0; i < size; i++) {

                strLink.append(findElement.getVal());
                strLink.append(" -> ");
                findElement = findElement.next;

            }

            strLink.append("null");
        }

        strLink.append("]");


        return strLink.toString();
    }

}
