package day47_Polymorphysim;

import day44_Abstraction_Interface.animal.Animal;
import day44_Abstraction_Interface.animal.Cat;
import day44_Abstraction_Interface.animal.Dog;
import day45_AbstractionContinue.shape.Circle;
import day45_AbstractionContinue.shape.Shape;
import day45_AbstractionContinue.shape.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Shape shape = new Circle(4); //UPCASTING

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal; // DOWNCASTING
        dog.bark();

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        ((Dog) animal).bark();

        Shape shape1 = new Square(5);
        System.out.println(((Square)shape1).getSide());


        System.out.println("----------------------------------------------------");

        Animal animal1 = new Cat("Jim", "Scottish",'M', 3, "Small", "black");
        Cat cat = (Cat) animal1;
        cat.meow();

        ((Cat) animal1).meow();

    }
}
