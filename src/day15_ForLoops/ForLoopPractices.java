package day15_ForLoops;

public class ForLoopPractices {

    public static void main(String[] args) {
        // get the result in the following format 15 16 17 18 19 20 ...... 45

        for(int i = 15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        // 100 - 50

        for(int i = 100; i >= 50; i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------");

        // print all the even numbers between 1-55

        for(int i = 1; i <= 55; i++) {
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        // print all the even numbers between 1-55

        for( int i = 2; i<=54; i+=2){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }


        System.out.println();
        System.out.println("----------------------------------------------------------");




    }
}
