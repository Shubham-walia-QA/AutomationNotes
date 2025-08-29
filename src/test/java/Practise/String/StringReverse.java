package Practise.String;

import java.util.Locale;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       String p =  s.toLowerCase(Locale.ROOT);
       boolean b = s.equals(p);
        System.out.println(b);

        String l = s.concat(p);
        System.out.println(l);

        int length = s.length()-1;

        while (length!=-1)
        {
            System.out.print(p.charAt(length));
            length--;
        }
    }
}
