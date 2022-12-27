package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {


        System.out.println("-------------------Push ups started------------------");



        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up "+i); // - \r writes the new print statement in the same link (replaces the old sentence)
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\n-------------------Push ups completed------------------");


        System.out.println("-------------------Pull ups started------------------");



        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull up "+i);
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\n-------------------Pull ups completed------------------");

        System.out.println("-------------------Sit ups started------------------");

        for (int i = 1; i <= 15; i++) {
            System.out.print("\rPull up "+i);
            sleep(0.5);
        }

        System.out.println("\n-------------------Sit ups completed------------------");

    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
