package com.company;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //rows is mandatory but column is not mandatory
        System.out.println(arr.length); //no of rows
        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

                /*
                for(int row =0; row< arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));
                }
                 */
            }
            System.out.println();
        }
    }
}
