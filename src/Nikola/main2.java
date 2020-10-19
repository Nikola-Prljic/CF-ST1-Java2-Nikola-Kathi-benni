package Nikola;

public class main2 {
    public static void main(String[] args){
        // #1
        String car = "The car is red";
        String car2 = "    The car is";
        System.out.println(car.indexOf("car"));
        System.out.println(car.startsWith("The"));
        System.out.println(car.startsWith("22"));
        System.out.println(car.compareTo(car2));
        System.out.println(car2.trim());
        System.out.println(car.replace('r', 'd'));
        System.out.println(car.replaceAll("car", "fish"));
        String[] carsplit = car.split("c", 2);
            for (String a : carsplit)
                System.out.println(a);
        // #2
        String Java = "Java is Juicy";
        String is = "is";
        System.out.println("Original String: " + Java);
        System.out.println("Specified sequence of char values: " + is);
        System.out.println(Java.contains(is));

        // #3



    }
}
