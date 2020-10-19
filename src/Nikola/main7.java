package Nikola;

import java.util.Scanner;

public class main7 {
    //Test Data:
    //Input the first number: 25
    //Input the second number: 45
    //Input the third number: 65
    //Expected Output:
    //The average value is 45.0
    public static void calc2(){
        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        double n1 = SCA.nextDouble();
        System.out.print("Enter number 2 : ");
        double n2 = SCA.nextDouble();
        System.out.print("Enter number 3 : ");
        double n3 = SCA.nextDouble();

        double average = (n1 + n2 + n3) / 3;

        System.out.println("The average value is " + average);

    }

    public static void main(String[] args){
        calc2();
    }
}
