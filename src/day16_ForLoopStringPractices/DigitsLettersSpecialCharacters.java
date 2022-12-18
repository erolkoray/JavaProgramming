package day16_ForLoopStringPractices;

public class DigitsLettersSpecialCharacters {

    public static void main(String[] args) {


        String str = "al;jfl;ijfa489j $&(@E@OJFEIjcp28uohejQ:SUAR£(*dapiejf";

        String digit = "";
        String letters = "";
        String specialChars = "";

        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (from '0' to 'last index')

            char ch = str.charAt(i); // ch: each character that we have in str

            if(ch >= '0' && ch <= '9'){ // if the character is between '0' to '9'
                digit += ch;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') { // if the character is between a-z or A-Z
                letters += ch;
            } else {        // if the character is neither digit or letter (its special character)
                specialChars += ch;
            }
        }

        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
