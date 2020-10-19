package kathi;

public class AdvancedString {

    public static void main(String[]args){
        //Write a program that computes your initials from your full name and displays them.
        //For “John Doe”, the output should be:
        //JD

        String myName = "Kathrin Schey";
        String[] initials = myName.split(" ");
        String fName = initials[0];
        String lName = initials[1];
        String first = fName.getChars(0, 0);
    }
}
