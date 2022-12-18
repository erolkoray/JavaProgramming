package day04_Variables;

public class Circle {


    public static void main(String[] args) {

    double radius = 5.5 ;
    double PI = 3.14;
    double diameter = radius * 2; // find the diameter by multiplying the radius by 2
    double area = radius * radius * PI; // finds the area of circle
    double perimeter = 2 * radius * PI ; // finds the perimeter of the circle


        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("radius = " + radius);
        System.out.println("PI = " + PI);
        System.out.println("diameter = " + diameter);






    }


}

/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

 */