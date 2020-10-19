package Nikola;
import java.util.Scanner;
public class main5 {
    public static void calc(){

        int n1 = (40 * 9 / 5) + 32;
        int n2 = (50 * 9 / 5) + 32;
        int n3 = (60 * 9 / 5) + 32;
        System.out.println("40°C = " + n1 + "°F" + " // 50°C = " + n2 +  "°F" +  " // 60°C = " + n3 + "°F");

        Scanner SCA = new Scanner(System.in);
            System.out.print("Enter Celsius: ");
            double cel = SCA.nextDouble();
            double end = (cel * 9 / 5) + 32;
            System.out.println(cel + "°C = " + end + "°F");
    }
    public static void main(String[] args){
        calc();
    }

}
