package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); //int

        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // double

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);


        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// Integer

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");


        char ch1 = '!';

        //isDigit() - It verifies if the Ch is a digit or not
        boolean r2 = Character.isDigit(ch1);

        //isLetter() - It verifies if the Ch is a letter or not
        boolean r3 = Character.isLetter(ch1);

        // special char - It verifies if the Ch is a special Character or not (! Not letter or digit)
        boolean r4= !Character.isLetterOrDigit(ch1);

        // upperCase - It verifies if the Ch is upper case or not
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase - It verifies if the Ch is lower case or not
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2); // false - ch: !
        System.out.println(r3); // false - ch: !
        System.out.println(r4); // true - ch: !
        System.out.println(r5); // false - ch: !
        System.out.println(r6); // false - ch: !

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each); // this turns each digit into an int then adds each digit, then turns it into a String by concatinating with ""+ .
            }

        }

        System.out.println("sum = " + sum);

    }

}