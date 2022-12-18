package day19_LoopPractices.homework;

public class Homework_IndexNumberOfFirstUniqueChar {

    public static void main(String[] args) {

        String str = "Baaskkdlleoootiirkk";

        char ch = 'B';

        int frequency = 0; //1+1+1

        for (int i = 0; i < str.length() ; i++) { // i: indexes of str
            char eachChar = str.charAt(i);  //eachChar: each character of str

            if(ch == eachChar){ // if given ch is matching with the eachChar, then ch is appeared in the string
                // frequency++;
                frequency += 1;
            }

        }

        System.out.println(frequency);


    }
}
/*
4. Write a program that can return the index number of the first unique character.
 */