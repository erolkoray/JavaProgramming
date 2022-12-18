package day10_NestedIf;

public class GradeReportWithTernarie {
    public static void main(String[] args) {

        int score = 81;

        if(score >=0 && score <=100){       // if the score is valid

            if(score >=90){
                System.out.println("Excellent");
            }else if (score >=80) {
                System.out.println("Great");
            }else if (score >=70) {
                System.out.println("Good");
            }else if (score >=60) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{              // if the score is not valid
            System.out.println("Invalid Score");
        }


        System.out.println("---------- CONVERT ABOVE TO TERNARIES STYLE ---------------");
        String result2 = "";
        if(score >=0 && score <=100){

            result2 = (score >=90)?"Excellent":(score >=80)?"Great":(score >=70)?"Good"
                    :(score >=60)?"Passed":"Failed";
        }else{
            System.out.println("Invalid Score");
        }
        System.out.println(result2);


        System.out.println("-------------------");



            String result = (score >=0 && score <=100)? (score >=90)?"Excellent":(score >=80)?"Great":(score >=70)?"Good"
                    :(score >=60)?"Passed":"Failed":"Invalid Score";
        System.out.println(result);



    }
}
