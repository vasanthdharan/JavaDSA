package org.DSABootCamp;

import java.util.Scanner;

public class ArraysExamples {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many student wants store in the system");

        int studentsID=sc.nextInt();

        System.out.println("Enter how many subject this has passed");

        int subjectsPassStatus=sc.nextInt();



        int [][] studentmarksList = new int[studentsID][subjectsPassStatus];

        for (int i = 0; i < studentmarksList.length; i++)
        {


            for (int j = 0; j < studentmarksList[i].length; j++)
            {

                studentmarksList[i][j]=sc.nextInt();

            }

        }

        for (int i = 0; i < studentmarksList.length; i++)
        {
            for (int j = 0; j < studentmarksList[i].length; j++)
            {
                System.out.print(studentmarksList[i][j]+" ");

            }
            System.out.println();

        }

    }
}
