package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        // && - AND operator (all the conditions needs to be met for it to be true)

// Is Steve eligible to vote in the USA?

        String name = "Aaron";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                   19 >= 18 &&  "UK"  == "USA"
        //                      true      &&     false
        //                              false
        System.out.println(name + " is eligible to vote: " + isEligible); //this would return false


        System.out.println("----------------------------------------------------------------------------");

        // Trying to apply for a loan for approval

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
                            //          true        true            false       = false

        System.out.println(name2 + " is eligible for a loan: " + isEligible2);



        System.out.println("----------------------------------------------------------------------------");

        // || - OR OPERATOR (Choice needs to be or the other)
                // if one of the conditions are true, result will be true

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      true      &&      false      ||     true
        //                      true        &&          true            = True

        System.out.println(name3 + " is eligible to register: " + isEligible3);



        System.out.println("----------------------------------------------------------------------------");

        String name4 = "Koray";
        String timeSpentInUS = "5 years",
                countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                          false                       false               = false

        System.out.println(name4 + " is eligible for USA citizenship: " + isEligible4);

        System.out.println("----------------------------------------------------------------------------");

        String name5 = "Anna";
        double GPA = 2.5;
        int familyIncome = 500000;
        int age4 = 32;

        boolean isEligible5 = GPA >= 3.5 || familyIncome <= 100000 && age4 >= 18;
         //                   GPA is 2.5 || family income is 500k     && true
        //                         false   ||     false           &&        true
        //                                  false              &&       True
        //                                                 false

        System.out.println(name5 + " is eligible for scholarship: " + isEligible5); // false

        System.out.println("----------------------------------------------------------------------------");

        // ! OPPOSITE OPERATOR (Putting this ! in front of a previously existing
        // variable it will create opposite condition

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        int score = 55;
        boolean passed = score > 60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);

    }
}
