package org.DSABootCamp;

public class ArmstrongNumbers
{

    //Armstrong number only for  3 digits

    static boolean printArmstrong(int n)
    {
        int original=n;
        int sum=0;

        while(n>0){

            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }

        //System.out.println(sum);

        return sum==original;

    }

    public static void main(String[] args)
    {
        //printArmstrong(125);
        //Find the all the armstrong numbers 100 to 999
        for(int i = 100; i<1000; i++)
        {
            if(printArmstrong(i))
            {
                System.out.println(i+" ");

            }

        }
    }
}
