package org.DSABootCamp;

public class PassingExample {

    static String changeName(String name)
    {
        name ="Hello";
        return name;
    }

    static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

    }


    public static void main(String[] args)
    {

        int num1=50;
        int num2=200;

        swap(num1, num2);
        System.out.println(num1);

        String myName="Vasanth";
        String output=changeName(myName);
        System.out.println(myName);
        //System.out.println(output);

    }
}
