package day15_ForLoops;

public class AlphabetLoops {

    public static void main(String[] args) {

        //A-Z & a-z & Z-A & z-a

        for(char i ='A'; i <='Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(char i ='Z'; i >='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i ='a'; i <='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i ='z'; i >='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        for(char i = 34000; i <=34440; i++){
            System.out.print(i+" ");
        }
    }
}
