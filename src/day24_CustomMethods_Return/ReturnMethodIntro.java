package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";
        String result = reverse(str);

        System.out.println(result);

    }


    public static String reverse(String str) { //"Java"

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        // System.out.println(reverse);
        return reverse;
    }




}
