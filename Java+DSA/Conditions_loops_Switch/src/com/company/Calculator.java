package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from the user till thee user input x
        int ans =0;
        while(true){
            //take the operator as input
            System.out.print("Enter the operator: ");
            char op =in.next().trim().charAt(0);
            if (op == '*' || op=='+' || op=='-' || op=='/' || op=='%'){
                //input two numbers
                System.out.print("Enter two numbers: ");
                int num1= in.nextInt();
                int num2 = in.nextInt();
                if(op=='*')
                {
                     ans = num1 * num2;
                }
                if(op=='+')
                {
                    ans = num1 + num2;
                }
                if(op=='-')
                {
                    ans = num1 - num2;
                }
                if(op=='/')
                {
                     ans = num1 / num2;
                }
                if(op=='%')
                {
                    ans = num1 % num2;
                }
            }else if(op == 'x'|| op=='X') {
                System.out.println("Invalid");
                System.out.println(ans);
            }
        }
    }
}
