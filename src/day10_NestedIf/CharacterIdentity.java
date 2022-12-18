package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        /*
        Write a program that can identity if the given character is a numeric or alphabetic or special character

        ex:
        ch = '@'

         */

        char ch = '@';

        if(ch >= '0' && ch <= '9'){
            System.out.println("Numeric");
        } else if ((ch >='A'&&ch<='Z') || (ch >='a'&&ch<='z')) {
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special Character");
        }





    }
}
