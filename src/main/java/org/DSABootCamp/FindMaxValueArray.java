package org.DSABootCamp;

public class FindMaxValueArray
{

    static int max(int[] arr)
    {

        int max=0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;

    }
    public static void main(String[] args)
    {
        int[] arr={10, 45, 13,89};
        System.out.println(max(arr));




    }
}
