package AgregationAndComposition;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

class Customer{
    private String nameOfCustomer;
    Account account;
    Customer(Account anyAccount, String nameOfCustomer){
        this.account = anyAccount;
        this.nameOfCustomer = nameOfCustomer;
    }

}

public class Account {

private int [] arrayForAccounts;
private int numberOfAccount;
private ArrayList<Object> list = new ArrayList<Object>();

    Account(int countOfAccounts){
    countOfAccount(countOfAccounts);
}

public void countOfAccount(int count){
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
       String elementOfCollection = list.get(i).toString();
       char [] symbolsOfAccountNumber = String.valueOf(numberOfAccount).toCharArray();
        char [] elementsOfCollectionElement = elementOfCollection.toCharArray();
        for (int j = 0; j < elementsOfCollectionElement.length; j++){

        }
    }
        System.out.println("Account  " + numberOfAccount + "  was blocked!");

    }
}
