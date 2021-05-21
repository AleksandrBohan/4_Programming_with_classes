package EasyClassesAndObjects;

import java.util.Scanner;

public class Test1 {
   private int firstVariable;
   private int secondVariable;
   private Scanner scanner = new Scanner(System.in);

    private void changeVariableFirst(){
        System.out.println("Input value for first variable: ");
       firstVariable = scanner.nextInt();
    }
    private void changeVariableSecond(){
        System.out.println("Input value for second variable: ");
        secondVariable = scanner.nextInt();
    }
    private void outputVariables(){
        System.out.println("First variable is " + firstVariable);
        System.out.println("Second variable is " + secondVariable);
    }

    private void sumOfVariables(){
        int sum = firstVariable + secondVariable;
        System.out.println("sum of variables = " + sum);
    }

    private void theBiggestValue(){
        if (firstVariable > secondVariable){
            System.out.println("The biggest value is " + firstVariable);
        }
        else if (firstVariable < secondVariable){
            System.out.println("The biggest value is " + secondVariable);
        }
        else System.out.println("These variables are the same!");
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.changeVariableFirst();
        test1.changeVariableSecond();
        test1.outputVariables();
        test1.sumOfVariables();
        test1.theBiggestValue();
    }
}
