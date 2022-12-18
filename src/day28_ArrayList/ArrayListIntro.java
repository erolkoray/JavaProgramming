package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(); // Both DataTypes has to be the same if you choose to declare them.
        //       Mandatory                     Optional(NO NEED TO GIVE THIS)


        ArrayList<String> names = new ArrayList<>(); // new arraylist will be automatically assumed as the first ArrayList DataType, in this case String

        System.out.println(numbers);
        System.out.println(names);


    }
}
