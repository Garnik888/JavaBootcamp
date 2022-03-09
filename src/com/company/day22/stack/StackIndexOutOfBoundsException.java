package com.company.day22.stack;

public class StackIndexOutOfBoundsException extends RuntimeException{

    public StackIndexOutOfBoundsException(int size){

        super("Auth of bound" + " max length of array mast be " + size);
    }
}
