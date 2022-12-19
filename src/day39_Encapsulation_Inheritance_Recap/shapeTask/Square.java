package day39_Encapsulation_Inheritance_Recap.shapeTask;

public class Square extends Shape{


    private double side;

    public double getSide() {
        return side;
    }   // return type of the getter needs to be the same data type as the setter variable

    public void setSide(double side) {    // using the setter in the CONSTRUCTOR BELOW means it can check for any conditions.
        if(side <= 0){
            System.err.println("Invalid side");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);  // we need to get the side by using the setSide method because if we don't we can't check if the given/entered side is a valid side or not. eg. side -100 is not valid because side needs to be above 0.
        // setSide() method won't allow the side to be 0 or lower.
    }


    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + ", " +
                "area='" + area() + '\'' +", " +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */