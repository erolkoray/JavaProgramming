package day45_AbstractionContinue.shape;

public abstract class Shape { //abstract class means child classes can extend to this class and inherit it

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area(); // abstract method means the method will be inherited and has to be overriden by the child class

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{"+
                "name='" + name + '\'' +
                        ", area='" + area() + '\'' +
                        ", perimeter='" + perimeter() + '\''+
                        "}";
    }


}
