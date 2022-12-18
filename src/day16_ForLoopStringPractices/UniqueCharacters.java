package day16_ForLoopStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "AABCCD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }

        System.out.println(result);


    }
}
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */