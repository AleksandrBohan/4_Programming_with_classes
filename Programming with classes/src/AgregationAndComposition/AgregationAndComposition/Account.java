package AgregationAndComposition;


class Customer {

    private String nameOfCustomer;

    Account[] accounts;

    Customer(String nameOfCustomer, Account[] accounts) {
        this.accounts = accounts;
        this.nameOfCustomer = nameOfCustomer;

    }



    void sortingAccounts(Customer customer) {
        Account[] accounts = customer.accounts;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[j].numberOfAccount < accounts[i].numberOfAccount) {
                    int tmp = accounts[i].numberOfAccount;
                    accounts[i].numberOfAccount = accounts[j].numberOfAccount;
                    accounts[j].numberOfAccount = tmp;

                }
            }

        }

        System.out.println("Number of accounts for customer " + customer.nameOfCustomer);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].numberOfAccount);
        }
    }

    void sumOfAccounts(Customer customer) {
        int sum = 0;
        Account[] accounts = customer.accounts;
        for (int i = 0; i < accounts.length; i++) {
            sum += accounts[i].moneyOnAccount;
        }

        System.out.println("Balance on accounts that customer = " + sum);
    }

    void sumOnPositiveAndNegative(Customer customer) {
        int positiveSum = 0;
        int negativeSum = 0;
        Account[] accounts = customer.accounts;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].moneyOnAccount >= 0) {
                positiveSum += accounts[i].moneyOnAccount;
            } else negativeSum += accounts[i].moneyOnAccount;
        }

        System.out.println("Positive balance on accounts that customer = " + positiveSum);

        System.out.println("Negative balance on accounts that customer = " + negativeSum);

    }

    void searchAccount(Customer customer, int accountForSearching){
        int count = 0;
        Account [] accounts = customer.accounts;
        for (int i = 0; i < accounts.length; i++){
if (accounts[i].numberOfAccount == accountForSearching){
    count++;
    System.out.println("Account was found!" + "\nAccount: " + accounts[i].numberOfAccount +
            "\nSum on this account = " + accounts[i].moneyOnAccount + "\nCustomer name is " + customer.nameOfCustomer);
}
        }
        if (count == 0){
            System.out.println("Account wasn't found!!");
        }

    }

}

public class Account {

    int moneyOnAccount;
    int numberOfAccount;
    Account account;


    Account(int numberOfAccount, int moneyOnAccount){
    this.numberOfAccount = numberOfAccount;
    this.moneyOnAccount = moneyOnAccount;
}

    void lockAccount(Account account) {
        this.account = null;
        System.out.println("Account  " + account.numberOfAccount + "  was blocked!");
        System.out.println(account.numberOfAccount);
        System.out.println(account.moneyOnAccount);
    }

    void unlockAccount(Account account) {
        this.account = account;
        account = new Account(account.numberOfAccount, account.moneyOnAccount);
        System.out.println("Account  " + account.numberOfAccount + "  was unblocked!");
        System.out.println(account.numberOfAccount);
        System.out.println(account.moneyOnAccount);
    }

    public static void main(String[] args) {

        Customer customer = new Customer("Alex", new Account[]
                {new Account(12300000, -56),
                new Account(57685, 23),
                new Account(9999999, 87)});
        customer.searchAccount(customer, 123);
        customer.sortingAccounts(customer);
        customer.sumOfAccounts(customer);
        customer.sumOnPositiveAndNegative(customer);
        Account account = new Account(789, 98);
        account.lockAccount(account);
        account.unlockAccount(account);
    }

  }
