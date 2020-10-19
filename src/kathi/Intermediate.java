package kathi;


public class Intermediate {

    public  static void main(String[]args){

        //Create examples that demonstrates the usage of following String methods:

        //1: indexOf(), startsWith(), compareTo(), trim(), replace(), replaceAll() and split()
        String samuelLIpsum = "Well, the way they make shows is, they make one show. That show's called a pilot. Then they show that show to the people                                 who make shows, and on the strength of that one show they decide if they're going to make more shows. Some pilots get                                    picked and become television programs. Some don't, become nothing. She starred in one of the ones that became nothing.";

        int theIndexOf = samuelLIpsum.indexOf("t");
        System.out.println("the index of t is: " + theIndexOf);

        String toCompare = "Some don't, become nothing.";
        int comparing = samuelLIpsum.compareTo(toCompare);
        System.out.println(comparing);

        boolean startWith = samuelLIpsum.startsWith("S");
        System.out.println("start the Ipsum with S? The answer is: " + startWith);

        String toTrim = "   daaaas beeeesteee iiiiiiist-kein     POlizist";
        System.out.println(toTrim.trim());
        System.out.println("   daaaas beeeesteee iiiiiiist-kein     POlizist");

        String toReplace = samuelLIpsum.replace("S", "F");
        System.out.println(toReplace);

        String toReplaceAll = samuelLIpsum.replaceAll("h", "non");
        System.out.println(toReplaceAll);

        String[] toSplit = samuelLIpsum.split("\\.");
        String one = toSplit[0];
        String two = toSplit[1];
        String three = toSplit[2];
        System.out.println(three);
        System.out.println(one);
        System.out.println(two);

        //2) Write a Java program to test if a given string contains the given sequence of char values.
        //Sample:
        //String: Java is Juicy
        //Specified values of char sequence: is
        //Output: true
        String s = "Java is Juicy";
        String s2 = "is";
        System.out.println(s);
        System.out.println("Specified values of char sequence: is");
        System.out.println(s.contains(s2));

        //3) Write a Java program to check whether a given string ends with the contents of another string.
        //Sample:
        //Coding is fun: ends with: un? true
        //Coding is fnu: ends with: un? false
        String funOne = "Coding is fun";
        String funTwo = "Coding is fnu";
        String end = ": ends with: ";
        boolean codingOne = funOne.endsWith("un");
        boolean codingTwo = funTwo.endsWith("un");
        System.out.println(funOne + end + codingOne);
        System.out.println(funTwo + end + codingTwo);

    }
}
