package day32_ConstructorOverloading_Calls;

public class Test {

    public Test(){ // A
        System.out.println("A");
    }
    public Test(int a){  // A B
        this();
        System.out.println("B");
    }
    public Test(double a){ // A B C
        this(10);
        System.out.println("C");
    }
    public Test(char a){ // A B C D
        this(2.5);
        System.out.println("D");
    }
    public Test(String a){ // A B C D E
        this('a');
        System.out.println("E");
    }

    public static void main(String[] args) {

        new Test(10); // A B

        System.out.println("------------------------------------------");

        new Test("Java"); // A B C D E

        System.out.println("------------------------------------------");

        new Test(4.4);  // A B C

        System.out.println("-----------------------------------------------------------------------------------------------------");


       

    }



}
