package day10_NestedIf;

public class CrewAndPassengers {

    public static void main(String[] args) {

    int totalPeople = 75;
    String result = "";

    if(totalPeople==50||totalPeople==75||totalPeople==100){
        if(totalPeople==50){
            result="20 crew, 30 passengers";
        } else if (totalPeople==75) {
            result="25 crew, 50 passengers";
        }else{
            result="30 crew, 70 passengers";
        }

    }else {
        System.out.println("Invalid Number of Passengers");
    }
        System.out.println(result);


    }
}
/*

Create a class called CrewAndPassengers, Given a number of people on the ship (int

        total 50 = 20 Crew, 30 passengers
        total 75 = 25 Crew, 50 passengers
        total 100 = 30 Crew, 70 passengers
        Any other number of people on ship is invalid

NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */