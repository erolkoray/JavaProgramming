package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {



        int num1 = 25,
        num2 = -10;

        System.out.println(num1 < 10); //false
        System.out.println(num2 < 10); //true


        System.out.println(" Pre Increment/Decrement; see below");

        System.out.println(++num1); //26
        System.out.println(--num1); //25

        int a = 5;
        ++a; //pre increment: increases the value of 'a' by 1 right away for future coding

        System.out.println(a); //6

        --a; // pre decrement: decreases the value of 'a' by 1 right away for future coding

        System.out.println(a); // 5

        System.out.println(" Post Increment/Decrement; see below");


        int b = 100;
        System.out.println("b = " + b);
        System.out.println(++b); //pre increment = result 101

        int c = 100;
        System.out.println("c = " + c);
        System.out.println(c++); /* post increment: = result 100, first passes the current value, then ++ adds 1
        in the next step onwards, so 'c' will be 101 from next step onwards. */
        System.out.println(c); // from this line onwards 'c' will be 101.

        System.out.println("-------------------------------------------------------");

        int z = 45;

        System.out.println(++z); //46 - z is now 46
        System.out.println(z++); //46 -  z = 47
        System.out.println(z); //47

        int q = 30;

        System.out.println(--q); //29
        System.out.println(q--); //29
        System.out.println(q); //28


    }
}
