package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {


       Dog dog1 = new Dog();

       dog1.name = "Lucy";
       dog1.age = 5;
       dog1.breed = "Husky";
       dog1.colour = "Brown";
       dog1.gender= 'F';
       dog1.size = "Small";

        Dog dog2 = new Dog();

        dog2.name = "Ace";
        dog2.age = 5;
        dog2.breed = "Husky";
        dog2.colour = "Black & White";
        dog2.gender= 'M';
        dog2.size = "Large";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shephard", 'F', "Large", 7, "Black & Brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog3.bark();
        dog2.sleep();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Lab", 'M', "Extra Large", 3, "Yellow");
        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-bull", 'M', "Large", 6, "Brown");
        // how many male and female dogs in the Array below?
        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        int count = 0;
        for (Dog eachDog : femaleDogs) {

            if(eachDog.gender == 'F'){
                count++;
            }
        }
        System.out.println(count);


        maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println(maleDogs.size());

    }

}
