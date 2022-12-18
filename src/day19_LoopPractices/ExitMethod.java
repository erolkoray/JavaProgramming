package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) { // the condition will be only true if the i = 0, 1, 2, 3, 4
            if(i == 3){
            //    break; // terminates the loop completely
            //    continue; // terminates the current iteration of the loop (in this case it will skip 3)

                System.exit(0); // it will exit the whole code, the whole program. So when i = 3 it will complete the program.
            }

            System.out.println(i);
        }

        System.out.println("Wooden Spoon");
    }

}
