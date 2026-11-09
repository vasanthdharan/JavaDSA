package org.DSABootCamp;

public class NumberConcurrencies {

    //1385757879

    public static void printNumberConcurrencies(int n,int target)
    {

        //int number =1356753;
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==target){
                count++;

            }
            n=n/10;

        }
        System.out.println("Here is Concurrencies count of given number : "+count);

    }

    public static void main(String[] args) {
        printNumberConcurrencies(2765632,7);

    }
}
