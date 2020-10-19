package kathi;

public class basicMethods {

    static float toCelsius(float a){
        return (a - 32) * 5 / 9;
    }

    static float toFahrenheit(float b) {
        return  (b * 9 / 5) + 32;
    }



    public static void main(String[]args){
        //Write a program that converts Fahrenheit degrees to Celsius. Then write a program
        //that convert from Celsius to Fahrenheit.
        System.out.println(toCelsius(58));
        System.out.println(toFahrenheit(40));
        System.out.println(toFahrenheit(50));
        System.out.println(toFahrenheit(60));


    }
}
