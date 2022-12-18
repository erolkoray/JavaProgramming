package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Koray Erol", 1883728400);

        System.out.println(account1);

        account1.deposit(300);
        account1.checkBalance();

        account1.withdraw(120);
        account1.checkBalance();

        account1.deposit(600);
        account1.checkBalance();


        System.out.println("---------------------------------------------");
        BankAccount account2 = new BankAccount();
        account2.setInfo("Rose", 239583729);

        account2.deposit(500);
        account2.checkBalance();

        account2.deposit(1000);
        account2.checkBalance();

        account2.withdraw(400);
        account2.checkBalance();



    }
}
