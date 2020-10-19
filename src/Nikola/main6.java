package Nikola;
//Calculate and return the area of a circle, given the radius
public class main6 {
    public static void calc(){
        float r = 5;
        float area = (float) (Math.PI * r * r);
        System.out.println((int)area);

    }
    public static void main(String[] args){
        calc();
    }
}
