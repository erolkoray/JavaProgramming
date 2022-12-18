package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        // create a function that can calculate the grade

        String str1 = grade(135);

        /*
        Check the grade:
        A = Excellent
        B = Great
        C = Good
        D = Passed
        F = Failed
         */

        if(str1.equals("A")){
            System.out.println("Excellent");
        } else if (str1.equals("B")) {
            System.out.println("Great");
        }else if (str1.equals("C")) {
            System.out.println("Good");
        }else if (str1.equals("D")) {
            System.out.println("Passed");
        }else if (str1.equals("F")) {
            System.out.println("Failed");
        }else {
            System.out.println("Try again");
        }


    }

    public static String grade(int score){

        String result = "";

        if(score < 0 || score > 100){
            result = "Invalid Grade";
        }else {
            result = (score >= 90)?"A":(score >= 80 && score < 90)?"B":(score >= 70 && score < 80)?"C":(score >= 60 && score < 70)?"D":"F";
        }

        return result;
    }
}
