package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

/* 2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */

        int a = 10,
                b = 15,
                c = 20;

        boolean aIsMedian = (a<b && a>c) || (a<c && a>b);
        // for a to be the median number c should be either min or max and b should be min or max number
        boolean bIsMedian = (b>a && b<c) || (b<a && b>c);
        // for b to be the median number a should be either min or max and c should be min or max number
        boolean cIsMedian = (c>a && c<b) || (c<a && c>b);
        // for c to be the median number a should be either min or max and b should be min or max number

        if(aIsMedian){ //if a is the median number
            System.out.println(a+" is the median number");
        }

        if(bIsMedian) { // if b is the median number
            System.out.println(b+" is the median number");
        }

        if(cIsMedian){ // if c is the median number
            System.out.println(c+" is the median number");
        }



    }
}
