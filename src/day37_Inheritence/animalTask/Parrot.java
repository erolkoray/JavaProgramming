package day37_Inheritence.animalTask;

public class Parrot extends Animal {


    public String wingColour;       // Variable unique to Parrot class only

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color); // THIS IS A CONSTRUCTOR
        this.wingColour = wingColour;   //if there is a variable unique to class, add it to the constructor like this
    }
    public void flying(){
        System.out.println(name+" is flying");
    }
    public void singing(){
        System.out.println(name+" is singing");
    }

    public String toString() {
        return "Parrot{" +
                "wingColour='" + wingColour + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

