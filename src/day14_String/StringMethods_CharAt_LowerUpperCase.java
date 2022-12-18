package day14_String;

public class StringMethods_CharAt_LowerUpperCase {


    public static void main(String[] args) {




        String word = "Cydeo";

        char third = word.charAt(2);

        System.out.println("third character: " + third);
/*
        char tenth = word.charAt(9);

        System.out.println("tenth character: " + tenth); // this will bring error because 'word' which is Cydeo has 4 characters (01234)
*/

        System.out.println("------------------------------------------------------------");
        // .length() gives you the total character number of the 'object'.
        String s1 = "batch 19 is the best batch. Java is a program language"; // ==> THIS IS THE OBJECT

        int totalCharacters = s1.length(); // gives you the total number of characters
        System.out.println("totalCharacters = " + totalCharacters);

        char lastLetter2= s1.charAt(s1.length()-1); // finding the last index number (final character) of the object
        System.out.println("lastLetter2 = " + lastLetter2);

        System.out.println("------------------------------------------------------------");

        // toLowerCase() - toUpperCase()

        String str = "wooden spoon";

        str = str.toUpperCase(); // this will create "WOODEN SPOON" (line 36 in upper case)

        System.out.println(str);

        String sentence = "today is a great day to learn java programming language";

        sentence = sentence.toUpperCase();

        System.out.println(sentence);




    }


}
