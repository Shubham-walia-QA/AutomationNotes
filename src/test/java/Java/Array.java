package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    /*

    Printing the values of an array.
    1. Normal for loop. Example 1
    2. Enhanced for loop. Example 2

    Note : - If no value is assigned to any index then it will store 0 in case of integer or 0.0 in case of decimal.

    Example 3
    Note :-
    1. .add : To add any value.
    2. .remove(2) : To remove the second index value.
    3. .get(3) : To fetch the value stored in second index.
    4. .size() : here we use size instead of length.
    5. .contains("keyword") :- it will return true if that keyword is present in the array list.

    Note :- we can convert array to arraylist. ArrayList and list are same thing.
    Example 4

    // A 2D array (matrix)
    int[][] multiDimArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    int[][] intArray = new int[10][20];

    // 3D array
    int[][][] intArray = new int[10][20][10];

    ArrayList :- Sometimes we don't know how many values we want to store in an array. In these cases we use arraylist.
    Example 5
     */

    public static void main(String [] args) {
        int[]  a = new int[5];
        a[0] = 2;

        a[2] = 4;
        a[3] = 5;
        a[4] = 6;

        int[] array1 = {1,2,3};

        // Note :- Both ways of declaration are correct the first way we use when we do not know the values during declaration and we want to store values from somewhere else. Second we use when we have fixed values.

        String[] s = new String[2];
        s[0] =  "Shubham";
        s[1] =  "Walia";

        //========================= Example 1 =========================================
        for (int i = 0; i< array1.length; i++)
        {
            System.out.println(array1[i]);
        }

        //========================= Example 2 =========================================
        System.out.println("============================================================");
        for (int j : array1)
        {
            System.out.println(j);
        }

        //========================= ========= =========================================
        System.out.println("============================================================");
        System.out.println(a.length);
        System.out.println(s.length);
        System.out.println(s[0]);
        System.out.println(a[1]);

        //========================= Example 3 =========================================
        ArrayList<String> al =  new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");

        al.remove(2);
        al.get(1);

        System.out.println("============================================================");
        for (int r = 0; r<al.size(); r++)
        {
            System.out.println(al.get(r));
        }

        // Or :: Both code give same result. below is enhanced for loop.

        for (String st : al)
        {
            System.out.println(st);
        }
        System.out.println(al.contains("b"));

        //========================= Example 4 =========================================

        String[] name = {"rahul", "shetty", "accademy"};
        List<String> nameArrayList =  Arrays.asList(name);
        nameArrayList.contains("rahul");

        //========================= Example 5 =========================================
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

    }
}