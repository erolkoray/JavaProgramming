package day44_Abstraction_Interface.animal;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String  size;
    private final String colour;

    public final static boolean canBreath; // can also be directly assigned as " = true " instead of static block below.
    static {
        canBreath = true;
    }

    public abstract void eat();
    public final void drink(){
        System.out.println(name+" is drinking");
    }

    public Animal(String name, String breed, char gender, int age, String size, String colour) {
        setName(name);
        this.breed = breed;
        if(!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("invalid gender: "+gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid name: "+name);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("invalid age: "+age);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" + // This way when we inherit this ToString method, it will use the sub-classes name
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake
 */