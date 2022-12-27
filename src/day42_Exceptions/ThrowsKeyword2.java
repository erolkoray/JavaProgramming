package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args)  { // IF EXCEPTION CAUSES AN ERROR IN THE COMPILER BEFORE RUNNING(Checked Exception), THEN USE THROWS.

        // DO NOT USE THROWS IN UNCHECKED EXCEPTIONS.

        System.out.println("Test started");

        System.out.println(8/0);

        System.out.println("Test completed");



    }
}
