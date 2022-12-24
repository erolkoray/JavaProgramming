package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);
        Dog dog1 = new Dog("Koray", "Lab", 'F', "black", "Small", 10);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();
        dog.bark();
        dog.eat();

        System.out.println(dog1.getBreed());
        System.out.println(dog1.getGender());

        dog1.eat();
        dog1.drink();
        dog1.bark();

        // you can't change the FINAL variables in the object, eg. breed/colour/gender by setting a different option. So dog1's breed can't be changed by using dog1.setBreed(); but age can be  dog1.setAge(); because Breed is a FINAL method but Age isn't.

       //dog1.setBreed(); - this gives compile error because it was set as a FINAL method







    }
}
