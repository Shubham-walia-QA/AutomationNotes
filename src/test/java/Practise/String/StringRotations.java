package Practise.String;

import Loop.While;

import java.util.Scanner;

public class StringRotations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String g = "";
        int length = s.length()-1;
        int j=0;
        while(j < length){
        for(int i = length ; i > 0; i--)
        {
            char k =  s.charAt(i);
          g = s.concat(String.valueOf(k));
        }
        j++;
    }}
}
