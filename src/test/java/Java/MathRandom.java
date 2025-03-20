package Java;

public class MathRandom {

    /*
    Math Random ::  Return a double value with a positive sign greater than or equal to 0.0 or less than 1.0.

    To convert double to integer or if we want to remove decimal value then we need to type cast
     */

    public static void main(String[] args) {
        double num =  Math.random();
        System.out.println(num);

        int num2 =  (int)(Math.random()*100);
        System.out.println(num2);
    }

}
