package day03_EscapeSequence;

/*
escape sequences" MUST be given with double quote
    \n: starts a new line
    \t: tab (paragraph space)
    \\: single backslash (to have 2 backslashes you need 4 backslashes)
    \": double quote


*/


import com.sun.tools.javac.Main;

public class EscapeSequences {


    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("---------------------------------------------");

        System.out.println("Hello Cydeo. \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");


        System.out.println("----------------------------------------------");


        System.out.println("\tJava is a cool programming language");


        System.out.println("-----------------------------------------------");

        System.out.println("/ \\");

        System.out.println("-----------------------------------------------");

        System.out.println("My favourite TV show is \"Game of Thrones\""); // in order to print double quote, we need to use \"

    }


}
