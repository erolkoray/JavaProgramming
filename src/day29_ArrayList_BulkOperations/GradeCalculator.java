package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>( scores );
        gradeOfA.removeIf(p -> !(p >= 90 && p <=100));

        ArrayList<Integer> gradeOfB = new ArrayList<>( scores );
        gradeOfB.removeIf(p -> !(p >= 80 && p < 90));

        ArrayList<Integer> gradeOfC = new ArrayList<>( scores );
        gradeOfC.removeIf(p -> !(p >= 70 && p < 80));

        ArrayList<Integer> gradeOfD = new ArrayList<>( scores );
        gradeOfD.removeIf(p -> !(p >= 60 && p < 70));

        ArrayList<Integer> gradeOfE = new ArrayList<>( scores );
        gradeOfE.removeIf(p -> !(p >= 50 && p < 60));

        ArrayList<Integer> gradeOfF = new ArrayList<>( scores );
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        gradeOfF.removeAll(gradeOfE);


        System.out.println(gradeOfA);
        System.out.println(gradeOfB);
        System.out.println(gradeOfC);
        System.out.println(gradeOfD);
        System.out.println(gradeOfE);
        System.out.println(gradeOfF);

        System.out.println("Total number of A: " +gradeOfA.size());
        System.out.println("Total number of B: " +gradeOfB.size());
        System.out.println("Total number of C: " +gradeOfC.size());
        System.out.println("Total number of D: " +gradeOfD.size());
        System.out.println("Total number of E: " +gradeOfE.size());
        System.out.println("Total number of F: " +gradeOfF.size());



    }
}
