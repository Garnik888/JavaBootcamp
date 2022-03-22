package com.company.day5;

public class Book {

    String name;
    Author author;
    double prise;

    /**
     * All parameters constructor
     * @param name String type
     * @param author Author class type
     * @param prise double type
     */
    public Book(String name, Author author, double prise){

        this.name =name;
        this.author = author;
        this.prise = prise;
    }

    /**
     * Print all information about book
     */
    public void printInfo(){

        System.out.println("Book information \nName - " + this.name + "\nAuthor - " + this.author.name
                + "\nPrise - " + this.prise + "\n");
    }

    /**
     * Print information about book author
     */
    public void printInfoAuthor(){

        System.out.println("\"Book author information \nAuthor name - " + this.author.name
                + "\nAuthor email - " + this.author.email + "\n");
    }
}
