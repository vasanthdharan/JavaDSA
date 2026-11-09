package org.DSABootCamp;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String fruit=sc.next();
        switch (fruit)
        {
            case  "Apple":
                System.out.println("Code : 001");
                break;
            case  "Orange":
                System.out.println("Code : 002");
                break;
            case "Pomo":
                System.out.println("Code : 003");
                break;
            default:
                System.out.println("Code is not avalilable for this fruits "+fruit);
        }
    }
}
