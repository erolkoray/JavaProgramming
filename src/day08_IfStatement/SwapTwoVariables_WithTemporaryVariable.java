package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        /* 1. Write a program that can swipe two variables' value by using a temporary variable

         */


        int a = 10;
        int b = 15;

        //------------------------------------------------------------------------
        int c = b;
        b = a; //b= 10
        a = c; //c= 15


        // -----------------------------------------------------------------------

        System.out.println("a = " + a); //15
        System.out.println("b = " + b); //10








    }
}
