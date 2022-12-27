package day41_Exceptions;

import day36_Inheritance.encapsulation.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        //Unchecked exception: ONLY APPEARS DURING THE RUNTIME (Compiler shows no error but there is an error when we run the program)

        int a = 10;
        int b = 0;

        System.out.println( a/b ); // this doesn't cause an issue in the compiler but throws an exception in runtime. So it crashes the program


        char [] characters = {'A', 'B', 'C'};

        System.out.println(characters[99]); // - there is not 99th element in the ArrayList above, so this is an unchecked exception. No errors within compiler but error occurs when we run the program.

        Student student = null;

        student.study(); // this also doesn't show an error but above student object we created is refering to null, so student study method cannot run. it will give error.

        // Checked Exception - ONLY APPEARS DURING COMPILER TIME WHEN CODE IS WRITTEN -

        System.out.println("Hello");
      //  Thread.sleep(2000); // sleep() method is an example of checked exception
        System.out.println("Cydeo");

      //  FileInputStream file = new FileInputStream("path of the file"); // unchecked exception


    }

}
