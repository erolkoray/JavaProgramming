package homework;

import java.util.Scanner;

public class SandwichPractice {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW


        String sandwich="";
        String afterfirstgone="";

        if(str.contains("bread")){
            afterfirstgone = str.substring(str.indexOf("bread") + 5);

        }if(afterfirstgone.contains("bread")){
            sandwich=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            System.out.println(sandwich);
        }else{
            System.out.println("nothing");
        }

        scan.close();
    }
}