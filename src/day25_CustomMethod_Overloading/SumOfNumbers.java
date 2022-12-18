package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = sumOf2Numbers(7,20),
            sum2 = sumOf3Numbers(4,65,245),
                sum3 = sumOf4Numbers(1,46, 103, 2497);

        System.out.println("sum is: "+sum);
        System.out.println("sum is: "+sum2);
        System.out.println("sum is: "+sum3);

    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }
    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    public static int sumOf2Numbers(int num1, int num2) {
        return num1+num2;
    }
}
/*
Task1:
 1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

 2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

 3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */