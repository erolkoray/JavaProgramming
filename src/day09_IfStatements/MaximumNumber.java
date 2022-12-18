package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int min = 100,
                max = 200;

        if(min>max){
            System.out.println(min+" is the maximum number");
        }else{
            System.out.println(min+" is NOT the maximum number");
        }

        if(max>min){
            System.out.println(max+" is the maximum number");
        }else{
            System.out.println(max+" is NOT the maximum number");
        }
    }
}
