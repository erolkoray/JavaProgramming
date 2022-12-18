package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        // create a function that can print hello world 5 times
        // create a function that can print hello cydeo 5 times
        helloCydeo();
        System.out.println("------------------");
        helloWorld();
        System.out.println("------------------");
        evenNumbers();


    }

    public static void helloWorld(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public  static void helloCydeo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    // create a function that can print all the even numbers from 1-10

    public static void evenNumbers(){
        for (int i = 2; i < 11; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }


    }


}
