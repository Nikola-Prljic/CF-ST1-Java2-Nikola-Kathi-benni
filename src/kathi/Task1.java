package kathi;

public class Task1 {

    public static void main(String[]args){

        String hannah = "Did Hannah see bees? Hannah did";

        //1. What is the value displayed by the expression hannah.length()?
        System.out.println(hannah.length());
        //A:31

        //2. What is the value returned by the method call hannah.charAt(12)?
        System.out.println(hannah.charAt(12));
        //A: e

        //3. Write an expression that refers to the letter b in the string referred to by hannah.
        int expression = hannah.indexOf("b");
        System.out.println("the refers to the letter is: " + expression);


        //4. Write a Java program to get the character at the given index within the String.
        String getCharacter = "Java is great!";
        System.out.println("The character at position 1 is: " + getCharacter.charAt(1));
        System.out.println("The character at position 3 is: " + getCharacter.charAt(3));

        //A2: How long is the string returned by the following expression? What is the string?
       // “Was it a car or a cat I saw?”.substring(9, 12)
        String car = "Was it a car or a cat I saw?";
        System.out.println("the string is " + car.length() + " characters long");
        String sub = car.substring(9, 12);
        System.out.println("and the substring is: " + sub);
    }
}
