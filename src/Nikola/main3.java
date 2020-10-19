package Nikola;
import java.util.Scanner;
public class main3 {
    public static void main(String[] args){
        // #4
        String name = "Nikola Prljic";
        System.out.println(name + " : " + name.charAt(0) + name.charAt(7));

        Scanner SCA = new Scanner(System.in);
        System.out.print("Your full name(with space between the names) : ");
        String namein = SCA.nextLine();
        String[] ini = namein.split(" ", 2);
        String name1 = ini[0];
        String name2 = ini[1];
        System.out.println(name1.charAt(0) + "" + name2.charAt(0));


    }
}
