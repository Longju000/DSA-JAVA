package com.company;

public class Conditionals {

    public static void main(String[] args) {
        /*
           Syntax of if statement:
           if (boolean expression is T or F){
                   //body
           } else {
                  //do this
           }
        */
        int salary =24500;
//        if (salary>= 10000) salary = salary + 2000;
//        else salary = salary + 1000;
//        System.out.println(salary);

        //Multiple is-else

        if(salary > 10000) {
            salary += 2000; //salary = salary + 1000;
        } else if(salary >20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
