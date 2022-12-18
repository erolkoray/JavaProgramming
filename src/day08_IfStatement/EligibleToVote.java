package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {


        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // this boolean statement is true, so Eligible will be printed



        //either Eligible
        if(isEligible){
            System.out.println("Eligible");
        }

        // or Not Eligible
        if(!isEligible){
            System.out.println("Not Eligible");
        }


    }
}
