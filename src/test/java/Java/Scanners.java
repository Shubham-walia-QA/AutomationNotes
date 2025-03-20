package Java;

import java.util.Scanner;

public class Scanners {

    /**
     * The most common way to take user input in Java is using Scanner class which is part of java.util package.
     * The scanner class can read input from various sources like console, files or streams.
     *

     *  Method	                Description
     * nextBoolean()    ||	Reads a boolean value from the user
     * nextByte()   	||  Reads a byte value from the user
     * nextDouble() 	||  Reads a double value from the user
     * nextFloat()  	||  Reads a float value from the user
     * nextInt()    	||  Reads an int value from the user
     * nextLine()   	||  Reads a String value from the user
     * nextLong()   	||  Reads a long value from the user
     * nextShort()  	||  Reads a short value from the user
     *
     * */


    public static void main(String[] args)
    {

        // Creating Scanner class object
        Scanner scn = new Scanner(System.in);

        // Enter first input
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("Sum: " + (a + b));

        // Closing the scanner to release resources
        scn.close();
    }
}
