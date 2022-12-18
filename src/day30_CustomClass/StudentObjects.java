package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Koray", 'M', 29, 404, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student eachStudent : students) {

            System.out.println(eachStudent);

        }
        System.out.println("-----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        earlyBirds.addAll(Arrays.asList(student1,student2,student3,student4,student5));
        ArrayList<Student> angryBirds = new ArrayList<>();
        angryBirds.addAll(Arrays.asList(student1,student2,student3,student4,student5));


        earlyBirds.removeIf(p -> p.grade != 'A');
        angryBirds.removeIf(p-> p.grade == 'A');

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        System.out.println("-----------------------------------------------------");

        for (Student eachStudent : students) {

            if(eachStudent.grade == 'A'){
                earlyBirds.add(eachStudent);
            }else {
                angryBirds.add(eachStudent);
            }
        }



    }




}
