package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 100.5,
                n2= 10.5;

        char operator = '.';
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';


        if(valid){ // THIS IS A PRE-CONDITION THE SWITCH STATEMENT WILL HAVE TO OBEY. IF IT DOESN'T IT WILL PRINT ELSE STATEMENT

            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
            }
        }else {
            System.err.println("Invalid Operator"+operator);
        }


    }
}
/*
            Given two double variables n1, n2 and a char variable named operator.
            Use Switch statement to calculate the result of n1& n2 based on the given operator.
            Valid operators are: -, +, *, /
 */