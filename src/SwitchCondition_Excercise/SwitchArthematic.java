package SwitchCondition_Excercise;

import java.util.Scanner;

public class SwitchArthematic {
    public static void main(String[] args) {
        //Take a input from user, input1, input2 as int
        // and ask the user what you want to do,
        // enter char +,*,/ ,%, - , you will share the result by using the switch.
        Scanner Sc= new Scanner(System.in);
        System.out.println("Please enter value 1");
        int value1 = Sc.nextInt();
        System.out.println("Please enter value 2");
        int value2 = Sc.nextInt();
        System.out.println("Please enter the operation '+,-,*,/ ,%' ");
        char op = Sc.next().charAt(0);

        if (op=='+'){
            int result = value1 + value2;
            System.out.println(result);
        } else if (op=='-'){
            int result = value1 - value2;
            System.out.println(result);
        } else if (op == '*'){
            int result = value1 * value2;
            System.out.println(result);
        } else if (op=='/') {
            int result = value1 / value2;
            System.out.println(result);
        } else if (op == '%'){
            int result = value1 % value2;
            System.out.println(result);
        } else {
            System.out.println("Please enter the mentioned operator (i.e) + or - or * or / or % ");
        }
        Sc.close();
    }
}
