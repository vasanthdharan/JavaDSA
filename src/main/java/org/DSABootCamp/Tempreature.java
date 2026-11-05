package org.DSABootCamp;

import java.util.Scanner;

public class Tempreature {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("This will convert celsius in to fahrenheit ");
        System.out.println("Please enter temp in c");

        float tempC = s.nextFloat();
        float tempF=(tempC*9/5)+32;

        System.out.println(tempF);

    }
}
