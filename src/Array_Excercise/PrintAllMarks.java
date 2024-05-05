package Array_Excercise;

import java.util.Scanner;

public class PrintAllMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subject");
        int TotalSub = sc.nextInt();
        int[] marks = new int[TotalSub];


        for (int i = 0; i < TotalSub; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < TotalSub; i++) {
            System.out.println("Marks entered for Subject " + (i + 1) + ": " + marks[i]);
        }
        }
        }
