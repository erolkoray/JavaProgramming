package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        // 20 divided by 6


        int a = 83;
        int b = 7;
        int count = 0;

       while(a>=b){
           a -= b;
           count++;
       }
        System.out.println(count+" with a remainder of "+a);


    }
}
/*
  1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

 */