package day10_NestedIf;

public class NameOfMonths2 {

    public static void main(String[] args) {


        int number = 5;
        String result = "";
        if(number >= 1 && number <= 12){        // if the number is valid (1-12 months)

            if(number == 1){
                result = "January";
            } else if (number == 2) {
                result = "February";
            }else if(number == 3){
                result="March";
            }else if(number == 4){
                result="April";
            }else if(number == 5){
                result="May";
            }else if(number == 6){
                result="June";
            }else if(number == 7){
                result="July";
            }else if(number == 8){
                result="August";
            }else if(number == 9){
                result="September";
            }else if(number == 10){
                result="October";
            }else if(number == 11){
                result="November";
            }else{
                result="December";
            }
        }else {
            result = "Invalid Entry";
        }
        System.out.println(result);

        // Ternarie style;

        int number2 = 10;

        String result2 = (number2==1)? "January":(number2==2)?"February":(number2==3)?"March":(number2==4)?"April"
                :(number2==5)?"May":(number2==6)?"June":(number2==7)?"July"
                :(number2==8)?"August":(number2==9)?"September":(number2==10)?"October"
                :(number2==11)?"November": "December";

        System.out.println(result2);

        // Above can be used without brackets (Parantezler). They are optional when using Ternarie.
    }
}
