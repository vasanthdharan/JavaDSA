package org.DSABootCamp;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int empId=sc.nextInt();
        String dep=sc.next();

        switch (empId){
            case 1:
                System.out.println("Vasanth");
                break;
            case 2:
                System.out.println("Prakash");
                break;
            case 3:
                System.out.println("Vijaya");
                break;
            case 4:
                System.out.println("Prince");
                switch (dep){
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case  "maths":
                        System.out.println("Maths department");
                        break;
                    default:
                        System.out.println("No department!!");
                        break;
                }
                break;
            default:
                System.out.println("No employee");
        }

    }
}
