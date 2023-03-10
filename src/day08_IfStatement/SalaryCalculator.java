package day08_IfStatement;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*
       3. Create a class called SalaryCalculator
        3.1 declare the following variables:
                hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
        3.2 use the given info in above variables to calculate the followings;
                1. salaryBeforeTax
                2. stateTax
                3. federalTax
                4. totalTax
                5. salaryAfterTax

                Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

         3.3 use print statement to print each of the above

         ex:

         hourlyRate = $50
         weeklyHours = 45
         stateTax = 6 (given as percentage, you need to convert it to decimal)
         federalTax = 26 (given as percentage, you need to convert it to decimal)

         Output:
                Gross pay is: $117000
                Federal tax is: $30420
                State tax is: $7020
                Total tax is: $37440
                Net income is: $79560
         */

        int hourlyRate = 65,
                weeklyHours = 40;
        double stateTaxRate = 0.5,
                federalTaxRate = 26.2,
                totalTaxRate = stateTaxRate + federalTaxRate;
        //-----------------------------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; // Salary is equal to 1 weeks salary times 52
        double stateTax = salaryBeforeTax * stateTaxRate /100, //
                federalTax = salaryBeforeTax * federalTaxRate /100,
                totalTax = stateTax + federalTax,
                netIncome = salaryBeforeTax - totalTax;



        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax is $" + stateTax);
        System.out.println("Federal tax is $" + federalTax);
        System.out.println("Total tax is $" + totalTax );
        System.out.println("Net income is $" + netIncome);

        //------------------------------------------------------

    }
}
