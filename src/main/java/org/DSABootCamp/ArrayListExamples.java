package org.DSABootCamp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

    public static void main(String[] args)
    {

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);

        a.set(2,99);
        a.remove(1);

        ArrayList<String> s = new ArrayList<>();
        s.add("Vasanth");
        s.add("Sakthi ganesh");
        s.add("Vijaya");
        s.add("Prakash");

        for(String name: s)
        {
            System.out.println(name);

        }



        for(int out : a){
            System.out.println(out);
        }
    }
}
