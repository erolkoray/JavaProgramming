package day24_CustomMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

    nameOfMonth(14);
    }

   // Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {

        if(number < 1 || number > 12){
            System.out.println("invalid");
            return; // EXITS nameOfMonth METHOD - Remaining code fragments of the Method never gets checked/executed.
        }
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sept" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        }

        System.out.println("Month name: "+name);

    }



}

