package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {


        int grade = 80;
        String Grade;

        if(grade >= 90){
            Grade = "A";
        } else if (grade >= 80 && grade <90) {
            Grade = "B";
        } else if (grade >= 70 && grade<80) {
            Grade = "C";
        } else if (grade >= 60 && grade>70) {
            Grade = "D";
        }else {
            Grade = "F";
        }

        System.out.println("Grade: "+Grade);


    }
}
