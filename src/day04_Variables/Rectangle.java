package day04_Variables;

public class Rectangle {


    public static void main(String[] args) {


/*

2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)

 */

        double length = 10.5;
        double width = 5.5;

        double area = length * width;
        double perimeter = 2* (length + width) ;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("length = " + length);
        System.out.println("width = " + width);


    }





}
