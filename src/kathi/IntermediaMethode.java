package kathi;

import java.util.Scanner;

public class IntermediaMethode {

    // Write a Java method to compute the average of three numbers.
    public static float average(float a, float b, float c){

        return (a + b + c) / 3;
    }

    public static void main(String[]args){
        //Input the first number: 25
        //Input the second number: 45
        //Input the third number: 65
        //Expected Output:
        //The average value is 45.0

       // System.out.println(average(25, 45, 65));

        Scanner in = new Scanner(System.in);
        System.out.println("choose first number");
        float one = in.nextFloat();
        System.out.println("second number");
        float two = in.nextFloat();
        System.out.println("now,the last number for the average");
        float three = in.nextFloat();
        System.out.println(average(one, two, three));





    }
}
