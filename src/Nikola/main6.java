package Nikola;

import java.util.Scanner;

//Calculate and return the area of a circle, given the radius
public class main6 {
    public static void calc(){
        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float n1 = SCA.nextFloat();
        float r = 5;
        float area = (float) (Math.PI * r * r);
        System.out.println("The area of the circle is " + (int)area);

    }
    public static void main(String[] args){
        calc();
    }
}
