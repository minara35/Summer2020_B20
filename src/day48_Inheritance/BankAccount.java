package day48_Inheritance;
/*
WarmUp tasks:
    create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
Collapse



:100:
2
:+1::skin-tone-2:
2


 */

public class BankAccount {

    public String firstName;
    public String lastName;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static String bankName;
    static {
        bankName = "Bank of America";
    }

    private String accountHolder;
    private long accountNum;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount){
        System.out.println("Deposit: $" + amount);
        balance +=amount;

    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough balance");
            return; // we can use instand of return else statement
        }
        System.out.println("Withdraw: $" + amount);
        balance -=amount;
    }
}
