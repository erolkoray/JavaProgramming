package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double averageNumber = sum/ numbers.length;

        System.out.println("averageNumber = " + averageNumber);





    }
}
