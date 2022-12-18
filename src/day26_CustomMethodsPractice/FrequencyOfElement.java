package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int [] arr1 = {1,1,11,1,2,3,34,5,3,1,1,1,2343,6,67,8,99,563,2,1,1,2,3,3,2,1,3};

        int n = frequencyOfElement(arr1,1);

        System.out.println(n);


    }

// YOU CAN DO THE BELOW WITH DOUBLE INT STRING AND CHAR
    public static int frequencyOfElement(int [] array, int element){

        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }





}
/*
warmup tasks:
	1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array


 */