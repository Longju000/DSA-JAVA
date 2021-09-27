package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//      int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20, 50);
        System.out.print(ans);
    }
    //pass the value of numbers when you are calling the method main()
    static int sum3(int a, int b){
        int sum =a+b;
        return sum;
    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 1: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }
     static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 1: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.print("Sum of two numbers = " +sum);
    }
    /*

    (access modifier ) return_type name (arguments) {
    //body
    return statement;
    }
     */
}
