package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //double > float (f) > long (l) > int > short > byte

        // EXPLICIT CASTING (Needs to be done manually - assigning a larger primitive type to a smaller one)
                                            // Fitting a gallon of milk into a smaller bottle (won't fit)
        int x = 55;

        short y = (short)x; // THIS IS EXPLICIT CASTING - ASSIGNS LARGE PRIMITIVE TO SMALLER ONE

        System.out.println(y + " = " + x);

        long j = 1000000;
        byte w = (byte)j;

        System.out.println(w + " = " + j);

        double l = 2.5;
        float v = (float)l;

        System.out.println(l + " : " + v);

        double i = 10.8;
        int s = (int)i;

        System.out.println(i + " : " + s);


        System.out.println("---------------------------------------------------------------------------");
        // IMPLICIT CASTING (Done automatically by the program - assigning a small primitive to a larger one)
                                            // Fitting a small bottle of milk into a large bottle
        byte a = 100;

        short b = a;

        // short b = (short)a;

        // (short)a

        int c = b;
        // int c = (int)b

        long d = c;
           // (long)c
        float e = d;
                // (float)d
        double f = e;
                // (double)e

        System.out.println("---------------------------------------------------------------------------");

        // SHORT CUTS FOR EXPLICIT CASTING

        double d1 = 20.5;
        short s1 = (short) d1; // if you have a casting (assigning) error, press option + enter and pick option 1

        double d2 = 43.3;
        byte b1 = (byte) d2; // look for error warnings on the left hand side or top right corner, click on the error and correct



    }
}
