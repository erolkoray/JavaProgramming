package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {


        char[] letters= new char[26];

/*
        for (char i = 'A', j=0; i <= 'Z' && j <letters.length; i++, j++) {
            letters[j]=i;
        }
 */
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]= ch++;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("------------------------------------------------------------------");
        // write out the alphabet from Z-A

        char ch1 = 'Z';
        for (int i = letters.length-1; i > 0 ; i--,ch1--) {
            letters[i]= ch1;
        }

        System.out.println(Arrays.toString(letters));



    }
}
