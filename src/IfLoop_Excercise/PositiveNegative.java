package IfLoop_Excercise;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        //Program to Check if a Number is Positive, Negative, or Zero.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = Sc.nextInt();

        if (number>=1){
            System.out.println( number+ " --> The number in Positive");
        } else if (number<= -1) {
            System.out.println(number+ " --> The number is negative");
        } else {
            System.out.println( number + " -->The number is Zero");
        }

        Sc.close();

    }
}
