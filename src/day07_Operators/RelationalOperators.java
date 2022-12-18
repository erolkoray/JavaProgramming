package day07_Operators;

public class RelationalOperators {


    public static void main(String[] args) {

        // > (greater), >= (greater or equal), < (smaller), <=(smaller or equal)

        // These will be only used on boolean variable type, only if TRUE or FALSE.

        boolean results1 = 20 > 40; //false

        System.out.println("results1 = " + results1);

        results1 = 100 > 40; // true

        System.out.println("results1 = " + results1);



        boolean result2 = 100 >= 100;

        System.out.println("result2 = " + result2); //true

        boolean result4 = 45030 <= 3293; //false

        System.out.println("result4 = " + result4);

        System.out.println("-------------------------------------------------------------");

        // credit score of 720

        int creditScore = 745;

        boolean isEligableForLoan = creditScore >= 720;
        System.out.println("isEligableForLoan = " + isEligableForLoan);


        System.out.println("-------------------------------------------------------------");

        // EQUAL OPERATOR ( == )

        int x = 100;
        int y = 200;

        boolean equal = x == y; //false

        System.out.println("equal = " + equal); // false

        boolean result8 = "Multar" == "Good Guy"; // false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; // false

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //True

        System.out.println("result10 = " + result10);

        System.out.println("-------------------------------------------------------------");

        // NOT EQUAL OPERATOR ( != )

        boolean result11 = 100 != 200.5; // true

        System.out.println("result11 = " + result11);

        boolean result12 = "java" != "sleep;"; //true

        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false

        System.out.println("result13 = " + result13);

    }

}
