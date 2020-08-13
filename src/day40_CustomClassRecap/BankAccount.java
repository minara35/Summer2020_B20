package day40_CustomClassRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BankAccount {
    String accountType;
    String accountHolder;
    String accountNumber;
    double accountBalance;

    public void setAccountInfo(String clientAccountType , String accountHolderName, String accountNum) {
        accountType =clientAccountType;
        accountHolder = accountHolderName;
        accountNumber = accountNum;



    }
    public void getAccountInfo(){// display account info
        System.out.println("========================");
        System.out.println("Account Holder "+accountHolder);
        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Balance " + accountBalance);
        System.out.println("=========================");
    }
    public void checkBalance(){
        System.out.println("Available balance " + accountBalance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $" + amount + " to " + accountNumber);
        accountBalance +=amount;
    }
    public void withDraw(double amount){
        if(amount > accountBalance){
            System.out.println("not enough balance");
           return;

        }
        System.out.println("Withdrawing $" + amount + " from " + accountNumber);
        accountBalance-=amount;

    }

}
