package day17_While_DoWhile;

public class ConvertingLoops {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {     // if you now how many times something is going to be repeated go with this
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");

        int i = 1;                          // if you don't know how many times something is going to be repeated or something needs to repeat an infinite times, use while loop
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }

        System.out.println();
        System.out.println("-----------------------------------------------------");
        int l = 1;

        do{
            System.out.print(l+" ");
            l++;
        }while(l<=10);




    }
}
