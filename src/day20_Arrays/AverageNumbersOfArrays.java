package day20_Arrays;

public class AverageNumbersOfArrays {

    public static void main(String[] args) {


        int numbers[] ={10,20,30,40,50,60};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }

        double averageNum = sum/ numbers.length;

        System.out.println(averageNum);




    }
}
