package org.DSABootCamp;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> s = new ArrayList<>();

//        s.add(new ArrayList<>());
//        s.add(new ArrayList<>());

        for (int i = 0; i < 3; i++) {

            s.add(new ArrayList<>());

        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                s.get(i).add(sc.nextInt());

            }

        }



        //ArrayList<>

//        s.get(0).add(10);
//        s.get(0).add(20);
//        s.get(1).add(30);
//        s.get(1).add(40);

        for(int i =0; i<s.size(); i++)
        {
            for (int j = 0; j < s.get(i).size(); j++)
            {
                System.out.print(s.get(i).get(j)+" ");

            }
            System.out.println();

        }
        System.out.print(s.get(0).get(0));
        System.out.print(s.get(0).get(1));
    }
}
