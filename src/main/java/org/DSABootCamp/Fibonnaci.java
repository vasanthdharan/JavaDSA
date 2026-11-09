package org.DSABootCamp;

public class Fibonnaci {


    public static void printFibonnaci()
    {
        //Fibannaci is starting with two numbers which is 0,1 and it will continue by adding previous two numbers

        //e.g : 0,1,1,2,3,5,8,13...
        //O/P = 0,1,1,2,3,5,8,13,21,34,55,89,144,


        int first=0;
        int second=1;
        int next;
        int i=0;
        System.out.print(first+",");
        System.out.print(second+",");
        while(i<=10)
        {
            next=first+second;
            first=second;
            second=next;
            System.out.print(next+",");
            i++;
        }

    }

    public static void main(String[] args) {

        printFibonnaci();

    }
}
