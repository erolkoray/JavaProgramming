package day19_LoopPractices.homework;

public class Homework_IndexOfFirstDuplicatedChar {

    public static void main(String[] args) {

        String str = "slkjeoeddopimewvooslk";
        char ch = 'd';

        int frequency = 0; //1+1+1

        for (int i = 0; i < str.length() ; i++) { // i: indexes of str
            char eachChar = str.charAt(i);  //eachChar: each character of str

            if(ch == eachChar){ // if given ch is matching with the eachChar, then ch is appeared in the string
                // frequency++;
                frequency += 1;
            }

        }


    }
}
/*
Write a program that cna return the index number of the first duplicated character from a string
 */
