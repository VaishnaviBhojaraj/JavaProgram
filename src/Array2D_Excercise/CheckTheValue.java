package Array2D_Excercise;

import java.util.Scanner;

public class CheckTheValue {
        public static void main(String[] args) {
        //	• Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                       };
        //int checkval=11;

            //getting checkval from user
            Scanner Sc = new Scanner(System.in);
            System.out.println("Please enter the value to be checked");
            int checkval = Sc.nextInt();

        int NoOftimes=1;  // Will chcek how many times displayed
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==checkval){
                    System.out.println(NoOftimes+ "th time " +checkval+" is present at row "+(i+1)+" and column "+(j+1));
                    NoOftimes++;  //Once 1st plac found-> NoOftimes=2 and will chcek again
                }
            }
        }
        if(NoOftimes==1) //NoOftimes still 1 then the value is not present in the array
            System.out.println("Element "+checkval+" is NOT present in array");
    }
}
