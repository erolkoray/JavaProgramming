package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {


        int score = 95;
        System.out.println("Pass");
        System.out.println("Fail");

        if(score >= 0 && score <=100){  // this checks if the score is valid (0-100pts)

            if (score >= 60) {  // if the student passed the exam after score being validated
                System.out.println("Passed");

            } else {            // if the student failed the exam after score being validated
                System.out.println("Failed");
            }

        }

        else{                    // if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------------------------------------");

        int age = 25;
        boolean hasId = true;

        if (hasId) {        // If the person has ID

            if (age >= 21) {        // once hasID checked, this will now check the age of the person is 21 or older
                System.out.println("Person is eligible to buy alcohol");
            } else {         // ID confirmend, then checks if the person is less than 21 years of age
                System.out.println("Person is not eligible to buy alcohol");
            }

        }else {     // This will execute if the person does not have an ID
            System.out.println("Must have ID to buy alcohol");
        }


        System.out.println("----------------------------------------------------------------");

        int number=8;

        if(number<=7 && number>0){ // if the number is a valid number (between 1-7)

            if(number==1){
                System.out.println("Monday");
            } else if (number==2) {
                System.out.println("Tuesday");
            }else if (number==3) {
                System.out.println("Wednesday");
            }else if (number==4) {
                System.out.println("Thursday");
            }else if (number==5) {
                System.out.println("Friday");
            }else if (number==6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }


        }else{ // if the number is not valid eg. below 1 or above 7
            System.out.println("Number is Invalid");
        }




    }
}