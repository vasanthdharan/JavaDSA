package org.DSABootCamp;

public class Shadowing {

    // int a is a global variable since it's a global variable it can be accessed by everywhere inside this class,
    // the shadowing is like when u created similar variable name which is like a global variable inside any new method
    // the global variable will be shadowed in that method.
    //scope will be begin when the values is initiated

    static int a = 10;


    static void checkShadowed()
    {
        System.out.println(a+" Global variable value ");
        int a =90;
        System.out.println(a+" Local variable value ");

    }


    public static void main(String[] args)
    {
        checkShadowed();


    }
}
