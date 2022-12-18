package day31_Constructors;

public class StudentObjects {

    public static void main(String[] args) {



        Student student1 = new Student("Koray", 29, 'M', 'A', 404);

        System.out.println(student1); // Student{name='Koray', age=29, gender=M, grade=A, ID=404}

        Student student2 = new Student("Rose", 30, 'F', 'A', 3791);

        System.out.println(student2); // Student{name='Rose', age=30, gender=F, grade=A, ID=3791}


    }

}
