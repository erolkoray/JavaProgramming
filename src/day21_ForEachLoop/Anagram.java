package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        // Write a program that can check if str1 & str2 are built with same characters


        String str1 = "acdb";
        String str2 = "dbca";

        char[] inChar = str1.toCharArray();
        char[] inChar2 = str2.toCharArray();

        System.out.println(Arrays.toString(inChar));
        System.out.println(Arrays.toString(inChar2));

        Arrays.sort(inChar);
        Arrays.sort(inChar2);

        System.out.println();

        System.out.println(Arrays.toString(inChar));
        System.out.println(Arrays.toString(inChar2));

        boolean equal = Arrays.equals(inChar,inChar2);

        System.out.println(equal);







    }
}
