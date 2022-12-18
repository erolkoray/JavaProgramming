package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {


        String[] names = {"Koray Erol", "Rose Lambert", "Wooden Spoon", "Java Programming", "Manual Testing", "Automation Testing", "SQL Programming", "API Testing","Cydeo School"};

        for (String each : names) {

            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1)+".";
            System.out.println(initial);

        }




    }
}
