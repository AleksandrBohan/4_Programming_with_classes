package AgregationAndComposition;


import java.util.ArrayList;
import java.util.Scanner;

class Customer{

    private String nameOfCustomer;
    Account account;
    Account [] accounts;
    Customer(String nameOfCustomer, Account [] accounts){
        this.accounts = accounts;
        this.nameOfCustomer = nameOfCustomer;
    }

    void lockAccount(Account account){
this.account = null;
        System.out.println("Account  " + account.numberOfAccount + "  was blocked!");
    }
    void unlockAccount(Account account){
        this.account = account;
        account = new Account(account.numberOfAccount, account.moneyOnAccount);
        System.out.println("Account  " + account.numberOfAccount + "  was unblocked!");
    }

}

public class Account {

    int moneyOnAccount;
    int numberOfAccount;


    Account(int numberOfAccount, int moneyOnAccount){
    this.numberOfAccount = numberOfAccount;
    this.moneyOnAccount = moneyOnAccount;
}

    public void lockAccount( int numberOfAccount, Customer customer){
              numberOfAccount = 0;

        System.out.println("Account  " + numberOfAccount + "  was blocked!");

    }
}
