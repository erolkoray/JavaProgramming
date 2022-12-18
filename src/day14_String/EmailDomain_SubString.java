package day14_String;

public class EmailDomain_SubString {

    public static void main(String[] args) {



        String email = "Cydeo.School@gmail.com";

        String domain = email.substring( (email.indexOf("@")+1), (email.lastIndexOf(".")) );
        System.out.println("domain = " + domain);

        String str1 = "Java is fun, Java is cool, I Love Java";

        String s1 = str1.substring(0, str1.lastIndexOf("n,")+1); // Java is fun
        String s2 = str1.substring(str1.indexOf(" J")+1, str1.lastIndexOf(","));
        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);



    }
}
/*

1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo

 */