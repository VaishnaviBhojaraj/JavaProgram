package IfLoop_Excercise;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        //Program to Check if a Year is a Leap Year or Not
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year=Sc.nextInt();

        //what is leap year?
        //Every year that is exactly divisible by four is a leap year,
        // except for years that are exactly divisible by 100,
        // but these centurial years are leap years if they are exactly divisible by 400.

        if ((year%4==0)&&(year%100!=0)){
            System.out.println("The year "+year+" is an leap year");
        } else if (year%400==0){
            System.out.println("The year "+year+" is an leap year");
        } else{
            System.out.println("The year "+year+" is not an leap year");
        }

        Sc.close();
    }
}
