package org.DSABootCamp;

import java.util.Arrays;

public class ChangeValuesByPassing {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int [] nums)
    {
        nums[0]=100;

    }
}
