package homework.Week2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:

        String givenWord = "java";
        char ch1 = word.charAt(0);
        char ch2 = givenWord.charAt(0);
        char ch3 = word.charAt(1);
        char ch4 = givenWord.charAt(0);

        if(word.contains(givenWord) && (((ch1==ch2) || (ch3==ch4)))){

            boolean result = true;
            System.out.println(result);
        }else if(!(word.contains(givenWord) || (((ch1==ch2) || (ch3==ch4))))){

            boolean result = false;
            System.out.println(result);
        }else if(!(word.contains(givenWord))){
            boolean result = false;
            System.out.println(result);
        }else {
            boolean result = false;
            System.out.println(result);
        }

    }
}
