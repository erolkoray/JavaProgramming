package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {


        char ch = 'F';
        String result = "";

        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);
    }
}
/*

if the grade is a or b or c or d = "Passed"

otherwise = "Failed"
 */