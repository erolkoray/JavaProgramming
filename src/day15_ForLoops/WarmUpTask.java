package day15_ForLoops;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {
        //STARTS WITH X TASK

        System.out.println("Enter a word");

        String word = new Scanner(System.in).next();
        if(word.charAt(0) == 'x'){
        word = word.replaceFirst("x", "a");
        }
        System.out.println(word);

        /*
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */

        System.out.println("-------------------------------------------------------");

        String str = "xcodeX";
        String result = str.replace("x", "a").replace("X","a");
    //                      acodeX                              acodea

        System.out.println("result = " + result);
    /*
    2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
     */

        System.out.println("-------------------------------------------------------");

        String firstName = "cyDEo",
                lastName = "SCHOOL";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        //              ("" + firstName.charAt(0)).toUpperCase() + ......
        //                          C                                       ydeo  ====> Cydeo


        System.out.println("firstName = " + firstName);

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("lastName = " + lastName);

        String fullName = firstName+" "+lastName;

        System.out.println("fullName = " + fullName);

        /* 3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */




    }
}


