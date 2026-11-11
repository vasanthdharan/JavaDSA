package org.DSABootCamp;

import java.util.Arrays;

public class VarArgs {

    // variable arguments means when you don't know how many variable arguments you gonna pass to the method
    // you can use the variable arguments in java
    // syntax : static fun(int ... v) - int ... v when we give like this on any method it will be consider as a integer array similarly
    // you can say String ... A, Char ... C so on.

    static void fun(int ... v)
    {
        System.out.println(Arrays.toString(v));

    }
    static void multipleArguments(int a, int b, String ... s)
    {

        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {

        fun(1,2,3,4);
        int [] arr={10,11,348};
        fun(arr);
        multipleArguments(10,20,"Vasanth","Ganesh");


    }

}
