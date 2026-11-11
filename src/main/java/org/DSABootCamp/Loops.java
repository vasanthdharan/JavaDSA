package org.DSABootCamp;

import java.util.Scanner;

public class Loops {

    public  void getUserData(){

        Scanner s = new Scanner(System.in);

        int count=s.nextInt();

        for (int i = 0; i < count; i+=2)
        {

            System.out.println("Hello world");

        }
    }

    public void printHello(){

        int num =1;
        while(num<=5)
        {

            System.out.println("Hello");
            num++;

        }

    }

    public void printHelloUsingDo(){

        int num =1;

        do{
            System.out.println("Hello");
        }while(num==1);

    }

    public void largest()
    {

        //Find the Lagest of three number

       Scanner s = new Scanner(System.in);

       int a = s.nextInt();
       int b = s.nextInt();
       int c = s.nextInt();

       int max = a;

       if(b>max){

           max=b;
       }
       if(c>max){
           max=c;
       }
        System.out.println(max);

    }

    public void albhapetCaseCheck(){

        Scanner s = new Scanner(System.in);

        char ch=s.next().trim().charAt(0);

        System.out.println(ch);

        if(ch >= 'a' && ch<='z')
        {

            System.out.println("Given charactor is Lower case");


        } else if (ch >= 'A' && ch<='Z')
        {

            System.out.println("Given charactor is Upper case");

        }


    }

    public static void main(String[] args) {
        Loops l = new Loops();
        //l.getUserData();
        //l.printHello();
        //l.printHelloUsingDo();
        //l.largest();
        l.albhapetCaseCheck();
    }


}
