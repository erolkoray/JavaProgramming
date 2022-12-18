package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int max = numbers[0]; // we are assuming index 0 is the max number here, we will compare max variable with other numbers

        for (int i = 0; i < numbers.length; i++) {     // numbers.fori - shortcut for this

            if(numbers[i] > max ){ // if there is element in the Array that is greater than the current max number
                max = numbers[i]; // assign greater number to variable max
            }
        }

        System.out.println(max);

      //  for (int i = numbers.length - 1; i >= 0; i--) { // numbers.forr - shortcut for this (reverse of fori)


    }
}
