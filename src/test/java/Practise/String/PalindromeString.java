package Practise.String;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String value");
        String s = sc.next();

        int length = s.length();

        boolean result = true;

        for(int i = 0 ; i < length/2; i++)
        {
            System.out.println(s.charAt(i));
            int h = length-i-1;
            if (s.charAt(i) != s.charAt(h))
            {
                result = false;
            }
        }
        System.out.println(result);

    }
}
