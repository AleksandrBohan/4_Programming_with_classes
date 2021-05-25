package EasyClassesAndObjects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

   private int hours;
   private int minutes;
   private int second;

   private Scanner scanner = new Scanner(System.in);

      public void setTime(){
      try{
        System.out.println("Input hours: ");
        hours = scanner.nextInt();
          System.out.println(hours + " : ");
        if (hours > 23 | hours < 0){
            hours = 0;
            System.out.println(hours + " : ");
        }

              System.out.println("Input minutes: ");
              minutes = scanner.nextInt();
              System.out.println(minutes + " : ");
              if (minutes > 60 | minutes < 0){
                  minutes = 0;
                  System.out.println(minutes + " : ");
              }

                  System.out.println("Input second: ");
                  second = scanner.nextInt();
                  System.out.println(second + " : ");
                  if (second > 60 | second < 0){
                      second = 0;
                      System.out.println(second + " : ");
                  }
              } catch (InputMismatchException e){
          System.err.println("Wrong input! Please try again!");
              }
          }

          public void setHours(int count){
          hours +=count;
          int balance;
          if (hours > 23){
              hours %= 23;
              System.out.println("Hours = " + hours);
          }
              System.out.println("Hours = " + hours);
          }


          public void setMinutes(int count){
          minutes += count;
          int balance;
          if (minutes > 60){
              balance = minutes % 60;
              minutes /= 60;
              hours += minutes;
              minutes = balance;
              System.out.println("Minutes = " + minutes);
          }
              System.out.println("Minutes = " + minutes);
          }

            public void setSecond(int count){
          second += count;
          int balance;
          if (second > 60){
              balance = second % 60;
              second /= 60;
              minutes += second;
              second = balance;
              System.out.println("Seconds = " + second);
          }
                System.out.println("Seconds = " + second);
            }

    public static void main(String[] args) {
        Task6 task6 = new Task6();

        task6.setTime();

       task6.setSecond(200);
       task6.setMinutes(345);
       task6.setHours(45);

//TODO метод setHours дебажить!!
    }
}
