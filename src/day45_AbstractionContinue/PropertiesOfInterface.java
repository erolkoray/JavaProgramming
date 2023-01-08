package day45_AbstractionContinue;

public interface PropertiesOfInterface {

    // you can create abstract, static and default methods in Interface. WE USE ABSTRACT MOST OF THE TIME

    // All variables are static and final

    //CAN'T HAVE TOSTRING() METHOD

    int a = 100; // static and final by default
    static int b =200; // final by default
/*
    public PropertiesOfInterface(int a){
        this.a = a;
    }

    static {
        b = 100;
    }

    public void method1(){
        System.out.println("Instance method");
    }

 */

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();


    // method4() - allows us to pass a specific implementation. This way if multiple classes need to use the same implementation of this method, we can make this method default. So it does not have to be overriden
    default void method4(){
        System.out.println("Default method");
    }

    class Test implements PropertiesOfInterface{ //Only the abstract methods in interface HAS TO be overriden, others are optional
        @Override
        public void method3() {

        }

        public static void main(String[] args) {
            new Test().method4(); // this inside main method so we have to create an object to test method4() for this example.
        }
    }



}
