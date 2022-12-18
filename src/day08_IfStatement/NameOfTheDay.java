package day08_IfStatement;

public class NameOfTheDay {

    public static void main(String[] args) {


        // write a program that can display the name of the day - Numbers 1 ~ 7

        int number = 3;

        boolean mon = number == 1;
        boolean tue = number == 2;
        boolean wed = number == 3;
        boolean thur = number == 4;
        boolean fri = number == 5;
        boolean sat = number == 6;
        boolean sun = number == 7;


        if(mon){
            System.out.println("The day is Monday");
        }
        if(tue){
            System.out.println("The day is Tuesday");
        }
        if(wed){
            System.out.println("The day is Wednesday");
        }
        if(thur){
            System.out.println("The day is Thursday");
        }
        if(fri){
            System.out.println("The day is Friday");
        }
        if(sat){
            System.out.println("The day is Saturday");
        }
        if(sun){
            System.out.println("The day is Sunday");
        }



    }
}
