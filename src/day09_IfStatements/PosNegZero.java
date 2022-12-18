package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {


        int n = 100;

        if(n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        System.out.println("------------------------------------------------------------");

        boolean isPositive = n>0,
                isNegative = n<0,
                isZero = n==0;

        if(isPositive){
            System.out.println("Positive");
        } else if (isNegative) {
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
/*
        System.out.println("Positive");
        System.out.println("Negative");
        System.out.println("Zero");
 */
        System.out.println("------------------------------------------------------------");

        // If & Else Statement can NEVER be applied for the tasks that requires more than 2 conditions!

        if(isPositive){
            System.out.println("Positive");
        }

        if (isNegative) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }
}
