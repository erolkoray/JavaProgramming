package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException { // THROWS keyword here means this class will not be impacted by the exception rule that follows - in this case its InterruptedException

        System.out.println("----------------- Test 1 ------------------");

        System.out.println("Hello");
        Thread.sleep(2000);
        System.out.println("Cydeo");

        System.out.println("----------------- Test 1 completed ------------------");

        System.out.println("----------------- Test 2 ------------------");

        System.out.println("Hello");
        Thread.sleep(2000);
        System.out.println("Batch EU10");

        System.out.println("----------------- Test 2 completed ------------------");
    }
}
