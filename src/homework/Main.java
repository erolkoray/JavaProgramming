package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:

        String givenWord = "java";
        String str1 = word.substring(0,1);
        String str2 = givenWord.substring(0,1);

        if(word.contains(givenWord) && (str1.equals(str2))){

            boolean result = true;
            System.out.println(result);
        }else if(word.contains(givenWord) && (!(str1.equals(str2)))) {

            boolean result = false;
            System.out.println(result);
        }else{
            boolean result = false;
            System.out.println(result);
        }

    }
}