package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius){ // do not pass static methods/variables
        this.radius=radius;
    }

    static {            // only pass static methods/variables
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,506,70,405,23));
    }


    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,23,35,84,56,170,705,239));

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numnbers = " + numbers);


    }


}
