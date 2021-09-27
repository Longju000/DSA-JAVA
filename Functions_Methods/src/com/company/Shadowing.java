package com.company;

public class Shadowing {
    static int x =90; //this will be shadowed..
    public static void main(String[] args) {
        System.out.println(x); //will print 90
        int x =40;
        System.out.println(x); //will print 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
