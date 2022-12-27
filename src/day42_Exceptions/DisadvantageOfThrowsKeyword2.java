package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException{

        method1();
        method2();
        method3();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }

    public static void method1() throws InterruptedException { // THROWS ONLY FIXES THE EXCEPTION ISSUE WITHIN THE METHOD IT IS USED
       // new FileInputStream("K");
        Thread.sleep(200);
    }

    public static void method2(){
  //      method1(); // Method1() will have the exception issue because THROWS keyword is not inheritable to other methods/classes etc.
    }

    public static void method3() throws InterruptedException { // ADD MULTIPLE EXCEPTIONS IF NEEDED
        method1();
        Thread.sleep(2000);
    }




}
