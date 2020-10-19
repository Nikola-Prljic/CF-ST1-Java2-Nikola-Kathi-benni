package kathi;

public class AdvancedString {

    public static void main(String[]args){
        //Write a program that computes your initials from your full name and displays them.
        //For “John Doe”, the output should be:
        //JD

        String myName = "Kathrin Schey";
        System.out.println("Initials: " + myName.charAt(0) + myName.charAt(8));
    }
}
