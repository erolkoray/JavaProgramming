package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {


        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }
        System.out.println("--------------------------------------------------------------");

        for (int each:numbers) {        // can be only used if we need to use all the elements in any Array from first to last order
            System.out.println(each);
        }



    }
}
