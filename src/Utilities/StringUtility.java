package Utilities;

import java.util.Arrays;

public class StringUtility {


    // PRINTS EACH CHARACTER OF THE GIVEN STRING
    public static String printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        return str;
    }

    // REVERSES THE GIVEN STRING AND RETURNS THE REVERSED STRING
    public static String reverse(String str){    //"Java"
      String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result; // "avaJ"
    }

    //CHECKS IF THE GIVEN STRING IS PALINDROME, RETURNS BOOLEAN
    public static Boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    //CHECKS IF THE GIVEN STRING IS ANAGRAM, RETURNS BOOLEAN (Strings built using same characters)
    public static boolean isAnagram(String str1, String str2){ //"acb" , "bca"
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    //REMOVES THE DUPLICATES FROM GIVEN STRING, RETURNS STRING - "aaaabbbcccc" --> "abc"
    public static String removeDuplicates(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }
        }
        return result;

    }


}
