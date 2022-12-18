package day37_Inheritence.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog("Koray", "Husky", 'M', 1,"Large","White");

        System.out.println(dog1);
        dog1.bark();
        dog1.eat();

        Cat cat1 = new Cat("Love", "siamese", 'F', 2, "small", "black");

        System.out.println(cat1);
        cat1.scratch();
        cat1.eat();

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Green");

        System.out.println(parrot1);
        parrot1.singing();
        parrot1.eat();
    }
}
