package Java;

public class StringNotes {
    public static void main(String[] args) {

        /*
        String is an object that represent sequence of characters.
        1. Class in java.
        2. Can be declared in 2 ways. one with new keyword and with string literals.  Example 1
        3. String can be concatenated using  + operator. Example 2
        4. Concatenating string with integer. Example 3

        Note :- Irrespective of how many object we create java will store same value in a single memory.

        String operations::

        String s = "I am the best"
        String p = "123"

        s.length()      || length of string
        s.split(" ")    || Split the string                         || String[] abc = s.split(" ");
        s.trim()        || Remove empty space from Start and end    || String trimmedS12 = s12.trim();
        s.charAt(1)     || Start from 0 index, print char in String || String abc = s.charAt(1)
        s.toLowerCase(Locale.ROOT); ||                              || String p =  s.toLowerCase(Locale.ROOT);
        s.equals(p);    || Compare 2 string and return boolean value|| boolean b = s.equals(p);
        s.concat(p);    || Will Add string "s" to string "p"        || String l = s.concat(p);

        Example 4
         */

        //===============================Example 1=====================================
        // First way of declaring
        String abc = new String();
        abc = "First way of declaration";

        // Second way of declaring
        String xyz = "Second way of declaration";

        //===============================Example 2=====================================
        String s1 = "String";
        String s2 = "Concatenation";
        String s3 = "Example";

        // Concatenating strings in different ways
        String concat1 =  s1 + s2 + s3;
        String concat2 =  s1 + "Concatenation" + s3;
        String concat3 = "String" + s2 + "Example";

        // Storing concatenated strings in an array
        String[] concatArray = {concat1, concat2, concat3};

        // Printing each concatenated result
        System.out.println("Example 2 Output:");
        for(int i = 0; i < concatArray.length;i++)
        {
            System.out.println(concatArray[i]);
        }

        //=============================== Example 3 =====================================
        int i1 = 10;
        int i2 = 5;
        String s4 = "concat ";
        String s5 = " string";

        // Concatenating integers and strings in different ways
        String intStringConcat1 = s4 + i1 + s5; // concat 10 string
        String intStringConcat2 = i1 + s4 + i2; // 10concat 5
        String intStringConcat3 = "concat " + i1 + " string"; // concat 10 string
        String intStringConcat4 = "concat " + i1 + i2 + " string"; // concat 105 string
        String intStringConcat5 = "concat " + (i1 + i2) + " string"; // concat 15 string

        // Storing concatenated integer and string results in an array
        String[] intStringConcatArray = {intStringConcat1, intStringConcat2, intStringConcat3, intStringConcat4, intStringConcat5};

        // Printing each concatenated result from intStringConcatArray
        System.out.println("Example 3 Output:");
        for(int i = 0; i < intStringConcatArray.length;i++)
        {
            System.out.println(intStringConcatArray[i]);
        }

        //=============================== Example 4 =====================================
        //String literal
        String s12 =  " Rahul Shetty Academy ";
        String s123 =  "Rahul Shetty Academy";

        // new operator
        String s234 = new String("Welcome");

        // String split
        String[] splittedString =  s123.split(" ");
        for (String g : splittedString)
        {
            System.out.println(g);
        }
        // To remove blank space at start or bottom we can use trim method
        String trimmedS12 = s12.trim();
        System.out.println(trimmedS12);

        //Print all the characters of a string.
        for (int l = 0; l<trimmedS12.length();l++)
        {
            System.out.println(trimmedS12.charAt(l));
        }

    }
}
