package day21_ForEachLoop;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"Koray Erol", "Rose Lambert", "Wooden Spoon", "Java Programming", "Manual Testing", "Automation Testing", "SQL Programming", "API Testing","Cydeo School"};

        for (String each : names) { // each: "Koray Erol", "Rose Lambert", "Wooden Spoon" ....

            String reversed = "";

            for (int i = each.length()-1; i >= 0; i--) { //starts from the last character of each element in the 'names' Array

                reversed += each.toLowerCase().charAt(i);
            }
            System.out.println(reversed);

        }


    }
}
