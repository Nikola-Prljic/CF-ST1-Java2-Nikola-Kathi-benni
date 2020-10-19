package Nikola;

public class main1 {
    public static void main(String[] args){
        String hannah = "Did Hannah see bees? Hannah did";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        char e = hannah.charAt(15);
        System.out.println(e);
        String j = "Java is great!";
        int a = 1;
        int b = 3;
        char j1 = j.charAt(a);
        char j2 = j.charAt(b);
        System.out.println("The character at position 1 is: " + j1);
        System.out.println("The character at position 3 is: " + j2);

        String car1 = "Was it a car or a cat I saw?".substring(9, 12);
        System.out.println(car1); // selected the car from the senates with substring 9 and 12
        System.out.println(car1.length());

    }
}
