package com.company.test;

import javax.xml.namespace.QName;

public class Eagle {

    public static int age = 10;

    public   String name;


    public Eagle(String name){

        this.name = name;
    }

    public class AmericanEagle extends Bird{

        public String location;

        public void display(){

            System.out.println(name + " age  - " + ageHumanInEgle());
        }

        @Override
        public boolean caneFly() {

            return true;
        }
    }


    private static int data = 15;
    public static class MemberInner {
        int i = 8;
        static boolean b = true;
        void big ()  {
            System.out.println("data is " + (data + i) + "  ----- " + ageHumanInEgle());
        }
    }

    public static int ageHumanInEgle(){

        return age * 4;
    }
}

