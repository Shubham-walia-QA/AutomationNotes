package Java;

public class DataTypes {

    public static void main(String[] args) {

        // Primitive data types
            // - Numeric Types -
        int a = 1234567890; //Integer can have max 10 values
        long l = 1234567890123456789L; // Long should end with L and can have max 19 values

            // - Floating Point -
        double d = 1.43256; // Should have decimal values.
        float floatz = 1.432f; //  Float should end with f and it should have decimal values

            // - Non Numeric -
        boolean b = false; // Boolean can only have true and false value
        char c = 'a' ; //char should start and end with ' and can have single digit value


            // Non-Primitive data types - They are user defined data types
        String s = "This is good"; // String is a class in java
        int [] arr = {1,2};
        // Testi t = new test();

        // Type Casting ::
        // type conversion or type casting is the process of storing a value from one data type to another data type.

        // There are 2 type of casting
        // a) Implicit type casting :-
        // It is way to in which compiler automatically convert smaller size data type in larger. here the conversion occurs automatically
        int num1=4;
        long l1=num1; //now num1 value converted to long without defining the dataType in brackets.

        // b) Explicit  type casting :-
        // It involves converting a value from one data type to another through explicit instruction within the code.
        // Here we just need to add dataType name in bracket before the variable name to do type casting.
        double x = 10.5;
        int y = (int)x; // Explicitly cast double to int

        /*
        || Long to int            || int i = (int) 10.5;
        || float to double        || double i = (double) 123.456f;
        || Double to int          || int i = (int) 123.456;
        || float to int           || int i = (int) 23.6f;
        */

        // String to int
        int i = Integer.parseInt("2313123");

        // To convert float or double to string. Below .2 indicate 2 digit should appear after decimal.
        String.format("$%.2f",floatz);




        // Type promotion :: When on performing action on 2 same data types the result is another data type then java
        // automatically changes the data type to accommodate the larger value this is called promotion.
        byte b1 =  10;
        byte b2 = 20;
        int result1 = b1 * b2 ; // here the result is 300 but the byte can store max 128 value so the java automatically
                            // convert the result into int value.
    }
}