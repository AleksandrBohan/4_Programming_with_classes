package AgregationAndComposition;


import java.util.ArrayList;
import java.util.Scanner;

class Customer{

    private String nameOfCustomer;
    Account [] accounts;
    Customer(String nameOfCustomer, Account [] accounts){
        this.accounts = accounts;
        this.nameOfCustomer = nameOfCustomer;
    }

}

public class Account {

    private int moneyOnAccount;
    private int numberOfAccount;


    Account(int numberOfAccount, int moneyOnAccount){
    this.numberOfAccount = numberOfAccount;
    this.moneyOnAccount = moneyOnAccount;
}

    public void lockAccount( int numberOfAccount, Customer customer){
              numberOfAccount = 0;

        System.out.println("Account  " + numberOfAccount + "  was blocked!");

    }
}
