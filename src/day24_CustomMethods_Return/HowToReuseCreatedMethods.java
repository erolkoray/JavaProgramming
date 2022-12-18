package day24_CustomMethods_Return;

public class HowToReuseCreatedMethods {

    public static void main(String[] args) {

        // USED REMOVE DUPLICATES METHOD FROM ANOTHER CLASS (BELOW)

        String str = "saoiudfhuuaoisdjsaoidhodsuusaodhauyaeo";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        // USED REVERSE METHOD FROM ANOTHER CLASS (BELOW)

        String name = "Java Programming";

        name = ReturnMethodIntro.reverse(name);

        System.out.println(name);




        
    }


}
