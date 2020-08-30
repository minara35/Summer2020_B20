package day48_Inheritance;

public class BOfA {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount("Minara", "Abdrak");

        customer.setAccountHolder(customer.firstName+ " " + customer.lastName);
        customer.setAccountNum(84758927);
        customer.setBalance(50);
        customer.availableBalance();

        customer.deposit(300);
        customer.availableBalance();
        customer.withdraw(400);
        customer.withdraw(300);
        customer.deposit(100000000);
        System.out.println(customer);

    }
}
