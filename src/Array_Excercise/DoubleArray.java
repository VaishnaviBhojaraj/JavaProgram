package Array_Excercise;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers going to enter");
        int TotalNum = sc.nextInt();   //getting values fromm the usser to get index size
        int[] Num = new int[TotalNum];
        //getting the values
        for (int i = 0; i < TotalNum; i++) {
            System.out.print("Value " + (i+1) + ": ");
            Num[i] = sc.nextInt();
        }
        //Doublling the values and printing it
        for (int i = 0; i < TotalNum; i++) {
            int Doublenum = Num[i]*2; //storing the double num
            System.out.println("Double of the entered value " +Num[i]+ " is: " +Doublenum);
        }


//        Horizontal array (1D array
//        int[] num ={2,3,4,5};
//        for (int i=0; i<num.length;i++){
//            System.out.println( "Double of the entered value " +num[i]+ " is: " + num[i]*2);
//        }
    }
}
