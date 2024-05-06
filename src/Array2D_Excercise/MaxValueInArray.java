package Array2D_Excercise;

import java.util.Scanner;

public class MaxValueInArray {
    {
        // Write - Java method to find the maximum value in a 2D array. - O/P - 9
//        int[][] arr = {
//                {1, 8, 3},
//                {4, 18, 96},
//                {7, 8, 9}
//                       };

        Scanner Sc= new Scanner(System.in);
        //to get number of rows and column
        System.out.println("Please enter the number rows");
        int Rows = Sc.nextInt();
        System.out.println("Please enter the number of column");
        int Col = Sc.nextInt();
        int[][] arr=new int [Rows][Col];

        //to assign the array values:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter value of "+(i+1)+"th row and "+(j+1)+"th column:");
                arr[i][j]=Sc.nextInt();
            }
        }

        //To print the value array in matrix
        System.out.println("The entered arrray is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //To find the maximum value
        int MaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >MaxValue){
                    MaxValue=arr[i][j];
                }
            }
        }
        System.out.println("Maximum value in Array is "+MaxValue);

    }
}
