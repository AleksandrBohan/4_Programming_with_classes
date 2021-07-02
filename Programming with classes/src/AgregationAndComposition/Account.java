package AgregationAndComposition;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

class Customer{
    private String nameOfCustomer;
    Account account;
    Customer(Account anyAccount, String nameOfCustomer, int [] array){
        this.account = anyAccount;
        this.nameOfCustomer = nameOfCustomer;
    }

}

public class Account {

    private int moneyOnAccount;
private int [] arrayForAccounts;
private int numberOfAccount;
private ArrayList<Object> list = new ArrayList<Object>();

    Account(int countOfAccounts, int moneyOnAccount){
    countOfAccount(countOfAccounts, moneyOnAccount);
}

public void countOfAccount(int count, int moneyOnAccount){
    arrayForAccounts = new int[count];
        for (int i = 0; i < count; i++){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for creating this account: ");
        int numberOfAccount = scanner.nextInt();
        arrayForAccounts[i] = numberOfAccount;
    }
     list.add(arrayForAccounts);

}

    public void lockAccount( int numberOfAccount, Customer customer){

    for (int i = 0; i < customer.account.list.size(); i++){
       list.contains(numberOfAccount);
       char [] symbolsOfAccountNumber = String.valueOf(numberOfAccount).toCharArray();

    }
        System.out.println("Account  " + numberOfAccount + "  was blocked!");
//TODO
    }
}
