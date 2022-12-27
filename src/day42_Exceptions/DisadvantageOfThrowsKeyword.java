package day42_Exceptions;

import Utilities.SeleniumUtility;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");

       // sleep(2.5); // - this sleep method is from the method below(in this class). It still causes an exception issue because it doesn't use try/catch(it used throws keyword)

        System.out.println("Hello world");

        System.out.println("---------------------------------");

        System.out.println("Hello");

        SeleniumUtility.sleep(2.5); // this method uses try/catch and its called from SeleniumUtility package, so it permanently handles the exception.

        System.out.println("Cydeo");

    }
// ADVANTAGE - CLEANER CODE, LESS CODING
    public static void sleep(double seconds) throws InterruptedException{
        Thread.sleep((long)(seconds*1000));
    }

}
