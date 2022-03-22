package com.company.day5;

public class Author {

    String name;
    String email;
    char gender;

    /**
     * All parameters constructor
     * @param name String type
     * @param email String type
     * @param gender char type
     */
    public Author(String name, String email, char gender){

        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * Print all information about author
     */
    public void printInfo(){

        System.out.println("Author information \nName - " + this.name + "\nEmail - " + this.email
                + "\nGender - " + gender + "\n");
    }
}
