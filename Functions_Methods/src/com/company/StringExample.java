package com.company;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
//    String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String nam = in.next();
        String personalised = myGreet(nam);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message = "Hello "+name;
        return message;
    }
    static String greet(){
      String greeting = "How are you";
       return greeting;
    }
}
