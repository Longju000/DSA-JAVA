package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.print("King of Fruits");
                break;
            case "Apple":
                System.out.print("A red sweet fruit");
                break;
            case "Orange":
                System.out.print("AN sour sweet fruit");
                break;
            case "Grapes":
                System.out.print("Small");


                System.out.println("No fruits found");
                break;
            default:
                System.out.println("No fruits found");
                break;
        }
    }
}
