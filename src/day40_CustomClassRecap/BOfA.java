package day40_CustomClassRecap;

public class BOfA {
    public static void main(String[] args) {
        BankAccount Mika = new BankAccount();
        Mika.setAccountInfo("Saving", "Mika Abd", "123487899");
        Mika.getAccountInfo();
        Mika.checkBalance();
        Mika.deposit(1000);
        Mika.withDraw(500);
        Mika.checkBalance();
        Mika.withDraw(5000);
        Mika.checkBalance();


    }
}
