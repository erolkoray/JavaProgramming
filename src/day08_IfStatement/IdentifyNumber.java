package day08_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {


        /*
        1. Create a class called IdentifyNumber, and write a program that
can identify if the given number is positive, or negative or zero.
Ex:
number = 200
output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false
         */

        int givenNumber = 200;

        boolean isPositive = givenNumber > 0;
        boolean isNegative = givenNumber < 0;
        boolean isZero = givenNumber == 0;

        System.out.println(givenNumber + " is positive number: " + isPositive);
        System.out.println(givenNumber + " is negative number: " + isNegative);
        System.out.println(givenNumber + " is zero: " + isZero);




    }
}
