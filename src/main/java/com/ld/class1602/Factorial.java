package com.ld.class1602;


/**
 * @author luisdany
 */
public class Factorial {


    public static int factorial(int number){
        int n = number;
        if(n == 0)
            return 1;
        else
            return n * factorial(n -1);
    }

    public static void main(String[] args) {


        System.out.println(factorial(3));

    }


}
