package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {


    public static void main(String[] args) {




        System.out.println(10+34);

        System.out.println(35 - 12);
        System.out.println(4 * 10);

        System.out.println( 100 / 3 ); // = 33

        System.out.println( 100 / 3.0 ); // = 33.333333333333336
        System.out.println(10.0 / 4); // = 2.5
        System.out.println(10d / 4); // 2.5


        int a = 100;
        double b = a/6; //16

        System.out.println(b);

        double c = (double)a/6;

        System.out.println(c);

    }


}
/*
+: addition
-: subtraction
*: Multiplication
/: Division
            in math: 10/4 = 2.5
            in java: 10/4 = 2 (because they are int numbers)
            in java you need 10.0/4 or 10/4.0 or 10d/4 or 10/4d = 2.5 (because there is one double at least)
            *every time you add a 'd' or 'D' after an integer number, it makes it decimal*

        integer / integer =====> integer
        decimal / integer =====> decimal
        integer / decimal =====> decimal
        decimal / decimal =====> decimal

%: Remainder
 */