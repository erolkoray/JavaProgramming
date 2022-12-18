package day20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {


        String words[] = {"Java", "Java", "C#", "Python","Python", "Coding"};
        // variable num:    0      1       2       3        4          5

        for (int j = 0; j < words.length; j++) {
            String element = words[j]; // "Java"
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {

                if(words[i].equals(element)){

                    frequency++;
        }
            }

            if(frequency == 2){
                System.out.println(element);
            }
        }







    }
}
