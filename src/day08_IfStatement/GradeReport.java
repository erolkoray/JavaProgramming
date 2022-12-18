package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {
/*
        System.out.println( true == !false); // true
        System.out.println( !true != false); // false
        System.out.println( !false == true); // true
        System.out.println( !!false); // false
        System.out.println( !!!true); // false

 */

        int score = 87;

        boolean A = score >= 90 && score <= 100;
        boolean B = score >= 80 && score < 90;
        //boolean b = score >= 80 && !a; (score equal or higher to 80 but not A)
        boolean C = score >= 70 && score < 70;
        // boolean c = !a && !b && score >70;
        boolean D = score >= 60 && score < 70;
        // boolean d = !a && !b && !c && score >= 60;
        boolean Fail = score >= 0 && score < 60;
        // boolean Fail = !a && !b && !c && !d;

        if(A){
            System.out.println("Excellent");
        }
        if(B){
            System.out.println("Great");
        }
        if (C){
            System.out.println("Good");
        }
        if(D){
            System.out.println("Pass");
        }
        if(Fail){
            System.out.println("Fail");
        }

       /*
       Score:
       90 ~ 100 ==> Excellent
       80 ~ 89 ==> Great
       70 ~ 79 ==> Good
       60 ~ 69 ==> Passed
       0 ~ 59 ==> Failed
        */



    }
}
