package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program to Find factorial
//        System.out.print("Enter a whole number: ");
//        long num = in.nextLong();
//        long i,fact = 1;
//        //USING FoR LOOP
//        for(i=1; i<=num; i++)
//        {
//            fact =fact*i;
//        }
//        System.out.println("Factorial of " +num+ " is:" +fact);
        //Program to find whether a number is even or odd
//        System.out.print("Enter a number: ");
//        long num = in.nextLong();
//        if(num % 2==0)
//            System.out.println("The given number " +num+ "is even");
//        else
//            System.out.println("The given number " +num+ " is Odd");
       //Program to take name as input
        //Taking name as input and a greeting displayed
//        System.out.print("Enter your name: ");
//        String name = in.next();
//        System.out.println("Hello "+name);
        //Program to find SI
        //simple interest = (P*R*T)/100
//        System.out.print("Enter principal(p): ");
//
//        double p  = in.nextDouble();
//        System.out.print("Enter Rate (r): ");
//
//        double r = in.nextDouble();
//        System.out.print("Enter Time(t): ");
//
//        double t  = in.nextDouble();
//
//        double SI = (p*r*t)/100;
//       System.out.println(+SI+ " is the Simple Interest ");
        //Calculator Program using If-Else
//        System.out.print("Enter first number: ");
//        double num1 = in.nextDouble();
//        System.out.print("Enter second number: ");
//        double num2 = in.nextDouble();
//        System.out.print("Choose an operator: +, -, *, / or % : " );
//        String operator = in.next();
//       if(operator.equalsIgnoreCase("+")){
//           System.out.print(num1+num2);
//        }else if(operator.equalsIgnoreCase("-")){
//           System.out.print(num1-num2);
//       }
//       else if (operator.equalsIgnoreCase("*")){
//            System.out.print(num1*num2);
//        }
//       else if(operator.equalsIgnoreCase("/")){
//            System.out.print(num1/num2);
//        }
//       else if(operator.equalsIgnoreCase("%")){
//            System.out.print(num1%num2);
//        }
        //Program to take 2 numbers as input and print the largest number
//        System.out.print("Enter first number: ");
//        double num1 = in.nextDouble();
//        System.out.print("Enter second number: ");
//        double num2 = in.nextDouble();
//        if(num1>=num2){
//            System.out.print(num1);
//        }else if(num1<=num2){
//            System.out.print(num2);
//        } else if(num1==num2){
//            System.out.print("Both are equal");
//        }
        //Program to find factors of a number
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        System.out.print("Factors of " +num+ " are: ");
//        for(int i=1;i<=num; i++){
//            if(num %i==0){
//                System.out.print(i + " ");
//            }
//        }
        //Input in Rs and ouput as Dollar
//        System.out.print("Enter currency in Rs: ");
//        float num= in.nextFloat();
//        float num1 = (float)(num/74.28);
//        System.out.print("Rs " +num+ " is equal to $" +num1);
        //Program to input till the user enters 0 and print the sum of all numbers using while Loop
//         System.out.println("Enter a positive number: ");
//        int num;
//        int sum = 0;
//
//        while((num=sc.nextInt()) != 0){
//            sum= sum+num;
//        }
//        System.out.print("Sum is " +sum);
      int num;
      int max = Integer.MIN_VALUE;
      while((num=sc.nextInt())!=0)
      {
          if(num>max)
              max=num;
      }
        System.out.println("Output: " +max);
    }
}
