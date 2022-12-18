package day11_Switch_Scanner;

public class GradeReport {

    public static void main(String[] args) {

        char grade = 'C';

        switch (grade){

            case 'A':
                System.out.println(grade+" : excellent");
                break;
            case 'B':
                System.out.println(grade+" : great job");
                break;
            case 'C':
                System.out.println(grade+" : good");
                break;
            case 'D':
                System.out.println(grade+" : passed");
                break;
            case 'F':
                System.out.println(grade+" : failed");
                break;
            default:
                System.out.println("Invalid");
        }



    }
}

/*
Task:
	1. NameOfMonth  (1~12)
	2. NumberToWord (0~9)
	3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */

