package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {


        Student student1 = new Student("Koray", 2, 'M', 'Z',"Cydeo");

        System.out.println(student1);

        student1.getAge();

        student1.setAge(39);
        student1.setSchoolName("I.T.O.");
        student1.setGrade('A');

        System.out.println(student1);



    }
}
