package IfLoop_Excercise;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        //Program to Check if a Character is a Vowel or a Consonant.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please enter the character");
        char ch = Sc.next().charAt(0);

        if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'||
                ch=='A'|| ch=='E'||ch=='I'||ch=='O'|| ch=='U' ){
            System.out.println("The character "+ch+" is a Vowel");
        }else{
            System.out.println("The character "+ch+" is a Consonant");
        }
        Sc.close();
    }
}
