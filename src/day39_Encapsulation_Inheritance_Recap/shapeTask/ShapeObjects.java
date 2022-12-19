package day39_Encapsulation_Inheritance_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {


        Square square = new Square(3.5);
        System.out.println(square.getName());

        System.out.println(square);

        square.setSide(20);

        System.out.println(square);


        Rectangle rectangle = new Rectangle(12.5, 5);
        System.out.println(rectangle.getName());
        System.out.println(rectangle);

        rectangle.setLength(500);
        System.out.println(rectangle.getLength());

        rectangle.setWidth(10);

        System.out.println(rectangle);


        Circle circle = new Circle(25);
        System.out.println(circle.getName());
        System.out.println(circle);

        circle.setRadius(50.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);




    }
}
