package Array_Excercise;

import java.util.Arrays;


public class MaxSalary {
    public static void main(String[] args) {

        //Find the max salary in the input arrays {30,50,60,90,10, 100,999,-3,-10}
        int Salary[]= { 30,50,60,10, 100,999,-3,-10 };

        int MaxSalary = Integer.MIN_VALUE;
        //Integer.MIN_VALUE-> refers to the minimum value of integer to check negative vales in array
        System.out.println("Integer.MIN_VALUE: " +MaxSalary); //Integer.MIN_VALUE = -2147483648 (MaxSalary)

        for(int i=0; i<Salary.length; i++){  // i=0     | 1      |  2     |  3      | 4      |  5      | 6       |7
            if (Salary[i]>MaxSalary){  //30>-214        |  50>30 | 60>50 |  10 >60   | 100>60 | 999>100 | -3>999 | -10>999
                MaxSalary= Salary[i];  // MaxSalary = 30|  50    | 60    | false 60 | 100    | 999     | F 999  | F 999
            }
        }
        System.out.println("Max Salary -> "+MaxSalary);



    }

}
