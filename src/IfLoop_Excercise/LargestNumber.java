package IfLoop_Excercise;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        //Program to Find the Largest Among Three Numbers:
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please enter the first value");
        int num1 = Sc.nextInt();
        System.out.println("Please enter the second value");
        int num2 = Sc.nextInt();
        System.out.println("Please enter the third  value");
        int num3 = Sc.nextInt();

        if ((num1>num2) && (num1>num3)){
            System.out.println("The number " +num1+ " is greater");
        }else if ((num2>num1) && (num2>num3)){
            System.out.println("The number " +num2+ " is greater");
        } else {
            System.out.println("The number " +num3+ " is greater");
        }
        Sc.close();
    }
}
