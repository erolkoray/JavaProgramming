package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E' ; i++) {

            if(i == 'C'){
                continue; // this made compiler to skip C
            }

            System.out.print(i+" ");
            System.out.println();

        }

        System.out.println("----------------------------------------------------------");

        // print all even numbers between 1-10
        // print all odd numbers between 1-10 with continue statement


        for (int i = 1; i < 11; i++) {

            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i < 11; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
