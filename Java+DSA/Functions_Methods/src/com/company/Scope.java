package com.company;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        {
            a =100; //reassign the original value
            System.out.println(a);
            //values intialised in this block, will remain in block
        }
        System.out.println(a);

        //scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num =90;

        }
    }
    static void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);
    }
}
