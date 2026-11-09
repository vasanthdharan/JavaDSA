package org.DSABootCamp;

import java.util.Scanner;

public class Calculater {



    public static void main(String[] args) {


        System.out.println("Application Starts...");

        Scanner input = new Scanner(System.in);
        int ans=0;

        while(true)
        {
            System.out.print("Enter the oprator :");
            char op =input.next().trim().charAt(0);
            //System.out.println();
            System.out.print("Enter the numbers :");

            if(op=='+' || op =='-' || op =='*' || op =='/' || op == '%')
            {
                int num1=input.nextInt();
                int num2=input.nextInt();

                if(op =='+')
                {
                    ans=num1+num2;

                }
                if(op =='-')
                {
                    ans=num1-num2;

                }
                if(op =='*')
                {
                    ans=num1*num2;

                }
                if(op =='/')
                {
                    if(num2!=0){
                        ans=num1/num2;
                    }else {
                        System.out.println("Can't divide with zero, make sure num2 value greater than zero");
                        ans=0;
                    }
                }
                if(op =='%')
                {
                    if(num2!=0){
                        ans=num1%num2;
                    }else {
                        System.out.println("Can't mod with zero, make sure num2 value greater than zero");
                        ans=0;
                    }
                }

            }else if (op == 'x'|| op=='X')
            {
                break;
            }else{
                System.out.println("invalid opreation!!");
            }

            System.out.println(ans);

        }

    }
}
