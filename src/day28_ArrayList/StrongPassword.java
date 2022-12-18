package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo2022!";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        // Boolean results below are assumptions
        boolean r2 = false; // has UpperCase letters
        boolean r3 = false; // has LowerCase letters
        boolean r4 = false; // contains SpecialCharacter
        boolean r5 = false; // contains Digit

    char [] chars = password.toCharArray(); // because password is a single String, we need to split each character to its own element. ToCharArray turns String into an Array of Chars.
        for (char each : chars) { // this then gets each element from the array of chars

            if(Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { // special char because it is not Digit, Uppercase or Lowercase.
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println(isStrongPassword);

    }
}
/*
Warmup tasks:
1.Write a program that can verify if a password is a strong
password. Characteristics of strong passwords are:
1.1 Password must be at least have 8 characters long, and should
not contain space
1.2 PassWord should at least contain one upper case letter
1.3 PassWord should at least contain one lower case letter
1.4 Password should at least contain one special characters
1.5 Password should at least contain a digit
 */