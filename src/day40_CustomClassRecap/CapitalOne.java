package day40_CustomClassRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Hamit  = new BankAccount();
        BankAccount Minara  = new BankAccount();
        BankAccount Nargiz = new BankAccount();
        BankAccount Sarim = new BankAccount();
        BankAccount Husein  = new BankAccount();

        Hamit.setAccountInfo("Checking", "Hamit Yulduz", "122345679");
        Minara.setAccountInfo("Checking", "Minara Abd ", "122373236");
        Nargiz.setAccountInfo("Checking", "Nargiz K", "1223645789");
      Sarim.setAccountInfo("Checking", "Sarim Amir", " 122389679");
        Husein.setAccountInfo("Checking", "Husein Demir", " 122379679");

        ArrayList<BankAccount>accounts= new ArrayList<>();
        accounts.addAll(Arrays.asList(Hamit, Minara, Nargiz, Sarim, Husein));
        //                             0        1       2       3       4
        for(BankAccount each: accounts){
            each.getAccountInfo();
            each.deposit(500);

        }
        System.out.println("===============");
        //Minara.deposit(1000);
        accounts.get(1).deposit(1000);
        accounts.get(1).checkBalance();
        accounts.get(1).withDraw(500);
        accounts.get(1).checkBalance();
        accounts.get(1).getAccountInfo();
        System.out.println("================");
        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("************************************");
        accounts.removeIf(each -> each.accountBalance <1000);
        System.out.println(accounts.size());
        for(BankAccount each : accounts){
        each.getAccountInfo();

        }





    }
}
