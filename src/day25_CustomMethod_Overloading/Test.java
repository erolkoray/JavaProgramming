package day25_CustomMethod_Overloading;

import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------------------");

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("--------------------------------------");

        String s2 = "Civic";
        boolean palindrome = StringUtility.isPalindrome(s2);
        System.out.println(palindrome);

        System.out.println("--------------------------------------");

        String [] names ={"Anna", "Java", "Python", "Racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String eachName : names) {
            if(StringUtility.isPalindrome(eachName)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("--------------------------------------");

        String str1 = "asdfg",
                str2 = "gdasf";
        boolean result = StringUtility.isAnagram(str1,str2);
        System.out.println(result);

        System.out.println("--------------------------------------");

        String str4 = "asl;fdjal;fh;uasjjdas;dksajfjae;n";

       String noDuplicates = StringUtility.removeDuplicates(str4);
        System.out.println(noDuplicates); //asl;fdjhuken

        System.out.println("--------------------------------------");

    }
}
