package EasyClassesAndObjects;

public class AgregateCustomer extends Customer{

    int countOfPersons = 10;
    int [] customerId = new int[countOfPersons];
    String [] customerSurname = new String[countOfPersons];
    String [] customerName = new String[countOfPersons];
    String[] customerPatronymic = new String[countOfPersons];
    String [] customerAddress = new String[countOfPersons];
    int [] customerNumberOfCard = new int[countOfPersons];
    int [] customerNumberOfBankAccount = new int[countOfPersons];
    Customer customer = new Customer();

    public void addId(int numberOfPozition, int numberOfId){
        customer.setId(numberOfId);
        customerId[numberOfPozition] = customer.getId();
        System.out.println(customerId[numberOfPozition] + " , ");
    }

    public void addName(int numberOfPozition, String lineName){
        customer.setName(lineName);
        customerName[numberOfPozition] = customer.getName();
        System.out.println(customerName[numberOfPozition] + " , ");
    }

    public void addSurname(int numberOfPozition, String lineSurname){
        customer.setSurname(lineSurname);
        customerSurname[numberOfPozition] = customer.getSurname();
        System.out.println(customerSurname[numberOfPozition] + " , ");
    }

    public void addAddress(int numberOfPozition, String lineAddress){
        customer.setAddress(lineAddress);
        customerAddress[numberOfPozition] = customer.getAddress();
        System.out.println(customerAddress[numberOfPozition] + " , ");
    }

    public void addPatronymic(int numberOfPozition, String linePatronymic){
        customer.setPatronymic(linePatronymic);
        customerPatronymic[numberOfPozition] = customer.getPatronymic();
        System.out.println(customerPatronymic[numberOfPozition] + " , ");
    }

    public void addNumberOfCard(int numberOfPozition, int lineNumberOfCard){
        customer.setNumberOfCard(lineNumberOfCard);
        customerNumberOfCard[numberOfPozition] = customer.getNumberOfCard();
        System.out.println(customerNumberOfCard[numberOfPozition] + " , ");
    }


    public void addNumberOfBankAccount(int numberOfPozition, int lineNumberOfBankAccount){
        customer.setNumberOfCard(lineNumberOfBankAccount);
        customerNumberOfBankAccount[numberOfPozition] = customer.getNumberOfBankAccount();
        System.out.println(customerNumberOfBankAccount[numberOfPozition] + " , ");
    }

    public void customersOutput(int index, AgregateCustomer customer){
        customer = new AgregateCustomer();
        customer.addId(index, 123768);
        customer.addSurname(index, "Gregon");
        customer.addName(index, "Alex");
        customer.addPatronymic(index, "Viktorovich");
        customer.addAddress(index, "st.Velichko, 7A");
        customer.addNumberOfCard(index, 123456);
        //TODO заполнить массивы и написать методы на сортировку по параметрам!!

    }



    public static void main(String[] args) {

        agregateCustomer.countOfPersons = 10;

    }
}
