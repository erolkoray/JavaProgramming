package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {


        String sentence = "This day is a good day to learn Java";
        String[] words = sentence.split(" ");

        String reverse = "";

        for (int i = words[1].length()-1; i >=0; i--) { // THIS METHOD reads the 2nd element in the Array(2nd word) and then starts from last character in that word
            reverse += words[1].charAt(i);// 1st it passes 'y' because it is index number is lenght-1, then it passes 'a', then 'd'
            }
        System.out.println(reverse); // yad

        sentence = sentence.replaceFirst(words[1], reverse); // replace day with yad in "String sentence"

        System.out.println(sentence); // This yad is a good day to learn Java

    }
}
