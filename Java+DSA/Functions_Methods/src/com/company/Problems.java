package com.company;

import java.util.Scanner;

public class Problems {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//    }
    //PRIME NUMBER OR NOT
//    static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        int c = 2;
//        while (c * c <= n) {
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        if(c * c >n) return true;
//        final boolean b = false;
//        return b;
//    }
public static void main(String[] args) {
    //3 digits Armstrong numbers
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(isArmstrong(n));

   }
   static boolean isArmstrong(int n){
    int original = n;
    int sum =0;
       while (n > 0) {
           int rem = n%10;
           n = n/10;
           sum = sum+ rem*rem*rem;
       }
       if(sum== original) {
           return true;
       }
       return false;
   }
}
