package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cYdeo2022!";

        int countUpperCase = 0,
                countLowerCase = 0,
                countIsDigit = 0,
                countSpecialChars = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countIsDigit++;
            }else {
                countSpecialChars++;
            }
        }

        boolean strongPassword = password.length() >= 8 && !password.contains(" ");
        boolean result = strongPassword && countIsDigit > 0 && countLowerCase > 0 && countUpperCase > 0 && countSpecialChars > 0;

        System.out.println("Password is a strong password? "+result);


    }

}
