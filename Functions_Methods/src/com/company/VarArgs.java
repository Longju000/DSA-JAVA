package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1, 23 ,34, 44, 55, 53,23, 33 ,3212 );
    multiple(1,2, "Lonf");
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
