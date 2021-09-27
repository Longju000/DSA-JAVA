package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TypeCasting
//        int num =(int)(23.45f);
//        //the output will give us only integer
//        System.out.println(num);

        //automatic type promotion in expression
//        int a= 257;
//        byte b = (byte)(a);  //257%256=1
//        byte a =4;
//        byte b = 6;
//        byte c = 6;
//        int d =a*b/c;
//        System.out.println(d);
        //ASCII Values
//        int number = 'A';
//        System.out.println(number);
        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i =5000;
        float f =4.44f;
        double d =0.0034;
        double result =(f*b) + (i/c) - (d -s);
        System.out.println((f*b) + "" + (i/c)+ " " + (d-s));
        System.out.println(result);
    }
}
