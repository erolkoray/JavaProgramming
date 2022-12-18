package day19_LoopPractices.homework;

public class Homework_DisplayCharactersAppearingTwice {

    public static void main(String[] args) {

        String str = "aaaabbccccddeeeeeff";
        String result = "";

        char ch = 'b';

        int frequency = 0; //1+1+1

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i);  //eachChar: each character of str

            if (ch == eachChar) { // if given ch is matching with the eachChar, then ch is appeared in the string
                // frequency++;
                frequency += 1;

                if (str.contains("" + ch)) {
                    continue;
                }

                result += ch;
                result += frequency;



            }
            System.out.println(result);
        }

    }

}


/*
3. Write a program that can display all the characters that appeared twice in the string.
 */