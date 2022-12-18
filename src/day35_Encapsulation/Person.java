package day35_Encapsulation;

public class Person {

    // static variables can be called by calling the class name

    // however instance variables can only be called by their variable name, can't be called by calling the class

    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose = true;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, String language, int age, char gender) { // instance variables can be generated automatically by using command+N -> constuctor
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static { // static variables need to be added manually to Static Block - Static block gets called automatically by the compiler
        planet ="Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 1;
        numberOfWings = 0;
    }

    public String toString() { // you need to add all the static variables to the toString - see below
        return "Person{" +
                "name='" + name + '\'' + // generated automatically
                ", language='" + language + '\'' + // generated automatically
                ", age=" + age + // generated automatically
                ", gender=" + gender + // generated automatically
                ", planet=" + planet + // manually add
                ", isHuman=" + isHuman+ // manually add
                ", hasNose=" + hasNose + // manually add
                ", numberOfWings=" + numberOfWings + // manually add
                ", numberOfHeads=" + numberOfHeads + // manually add
                '}';
    }


    public static void printPlanetName(){
        System.out.println("planet name is: "+planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }


}

/*
warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */