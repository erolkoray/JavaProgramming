package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {


        //Assignment Operators: =
        int x = 100;
        System.out.println("x = " + x); // result 100

        x = 200;

        System.out.println("x = " + x); // result 200

        String word = "Java Programming";
        System.out.println("word = " + word); // it is going to print Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); // it is going to print Wooden Spoon

        /*          If you think you are no longer going to use an older Variable,
             you can update the old variable and assign a new value to it, see above and below       */

        word = "Cydeo";

        System.out.println("word = " + word); // this will print Cydeo

        /* PAY ATTENTION TO THE DATA TYPE. YOU CAN'T UPDATE AN INT TO A STRING OR DOUBLE TO A BYTE */

        byte test = 24;
        System.out.println("test = " + test);

        // test = 300; // This doesn't work cause 300 is out of Byte range & data type we're trying to assign is Byte

        System.out.println("----------------------------------------------------------------------");

        int a = 100;
        System.out.println("a = " + a);

        System.out.println(a + 200); // this will be 300

       // a = a + 200;
        a += 200;

        System.out.println("a = " + a);

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5
// How do you get 8.0?
        num1 += 5.5;

        System.out.println("num1 = " + num1); // 8.0

        double availableBalance = 1000.50;

        // deposit $300 to your balance, should total $1300.50

        availableBalance += 300;

        System.out.println("availableBalance = $" + availableBalance);

        System.out.println("------------------------------------------------------------");

        // Availablebalance is $1300.50, withdraw 500

        availableBalance -= 500; // after this balance should be 800.50 (1300.50 - 500 = 800.50)

        System.out.println("availableBalance = $" + availableBalance); //$800.50

        // withdraw $200 then deposit $400

        availableBalance -= 200; // after this, availableBalance will be 600.50
        availableBalance += 400; // after this, availableBalance will be 1000.50

        System.out.println("availableBalance = $" + availableBalance); // this will print $1000.50

        System.out.println("-------------------------------------------------------------");
        // HOW TO MULTIPLY A VARIABLE
        double salary = 50000.50;

        salary *= 2; // this will make the number 100001.50 (you can also do salary = salary *2)
        System.out.println("salary = " + salary);


        double doge = 0.00000026;
        doge *= 10000000;

        System.out.println("doge = " + doge);

        System.out.println("-------------------------------------------------------------");

        // HOW TO DIVIDE A VARIABLE

        double num2 = 25000;
        num2 /= 2; // this is 25000 divided by 2 = 12500.0
   //Number divided by 2
        System.out.println("num2 = " + num2); //this will be 12500.0

        // THIS CAN ALSO BE num2 = num2 / 2

        System.out.println("-------------------------------------------------------------");

        double num3 = 100;
        //%=
        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("-------------------------------------------------------------");

        int amount = 127; //cents

        int quarters = amount/25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("-------------------------------------------------------------");

        int y = 300;

        y %= 16;
        System.out.println("y = " + y);

        System.out.println("-------------------------------------------------------------");


        int balance = 3500;

        // insurance fee: $153

        balance %= 153;
        System.out.println("balance = " + balance);

    }
}
