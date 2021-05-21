package EasyClassesAndObjects;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    Scanner scanner = new Scanner(System.in);

    String nameOfDestination;
    int trainNumber;
    double timeOfPractice;
    Train [] trains = new Train[5];

    Train(String nameOfDestination, int trainNumber, double timeOfPractice){
        this.nameOfDestination = nameOfDestination;
        this.trainNumber = trainNumber;
        this.timeOfPractice = timeOfPractice;
        System.out.println(nameOfDestination);
    }

    private int inputTrainNumber(){
        System.out.println("Input number of the train: ");
        int trainNumber = scanner.nextInt();
        System.out.println("number of the train = " + trainNumber);
        return trainNumber;
    }

    private void addTrain(int numberInOrder, Train train){
        trains[numberInOrder] = train;
    }

    private void outputInformation(int trainNumber){
       for (int i = 0; i < trains.length; i++){
           try{
           if (trains[i].trainNumber == inputTrainNumber()){
               System.out.println("Name of destination = " + trains[i].nameOfDestination);
               System.out.println("Train number = " + trains[i].trainNumber);
               System.out.println("Time of practice = " + trains[i].timeOfPractice);
           }
       }catch (Exception e){
    }
       }
    }

        public void selectionSort() throws NullPointerException {

            for (int i = 0; i < trains.length; i++) {

                    Object oMin = trains[i];
                    int min = trains[i].trainNumber;
                    int minId = i;
                    for (int j = i + 1; j < trains.length; j++) {

                        if (trains[j].trainNumber < min) {
                            oMin = trains[j];
                            min = trains[j].trainNumber;
                            minId = j;
                        }


                    int temp = trains[i].trainNumber;
                    trains[i].trainNumber = min;
                    trains[minId].trainNumber = temp;

                    Object oTemp = trains[i];
                    trains[i] = (Train) oMin;
                    trains[minId] = (Train) oTemp;
                }
            }
    }

    private void lineSort(){
        int count;
        int shortestStringIndex;
        //sort begins here
        for(int j=0; j<trains.length -1; j++)
        {
            shortestStringIndex = j;
            for(int i=j+1; i<trains.length; i++)
            {
                if(trains[i].nameOfDestination.trim().compareTo(trains[shortestStringIndex].nameOfDestination.trim())<0) //null pointer exception points here
                {
                    shortestStringIndex = i;
                }
            }
            if(shortestStringIndex !=j)
            {
                String temp = trains[j].nameOfDestination;
                trains[j].nameOfDestination = trains[shortestStringIndex].nameOfDestination;
                trains[shortestStringIndex].nameOfDestination=temp;
            }
        }
        //prints out results
        count=0;
        while(count<trains.length)
        {
            System.out.println(trains[count].nameOfDestination + " / " + trains[count].trainNumber +
                    "  /  " + trains[count].timeOfPractice);
            count++;
        }
    }


    private void output(){
        for (int i = 0; i < trains.length; i++){
            try {
                System.out.println(trains[i].nameOfDestination + "  / " + trains[i].trainNumber + "  /  " +
                        trains[i].timeOfPractice);
            }catch (Exception e){

            }

    }}

    public static void main(String[] args) throws Exception{
        Train train = new Train("Osmjani", 4356, 12.45);
        Train train1 = new Train("Volojin", 434556, 10.45);
        Train train2 = new Train("Minsk", 456, 9.45);
        Train train3 = new Train("Belarus", 41156, 11.45);
        Train train4 = new Train("Postavi", 356123123, 18.45);


        train.addTrain(0, train);
        train1.addTrain(1, train1);
        train2.addTrain(2, train2);
        train3.addTrain(3, train3);
        train4.addTrain(4, train4);




        train.outputInformation(train.trainNumber);
        train1.outputInformation(train1.trainNumber);
        train2.outputInformation(train2.trainNumber);
        train3.outputInformation(train3.trainNumber);
        train4.outputInformation(train4.trainNumber);
     //   train.arraySorting();

      //  train.selectionSort();
     //   train1.selectionSort();
      //  train2.selectionSort();
      //  train3.selectionSort();
      //  train4.selectionSort();


        train4.lineSort();


        train.output();
        train1.output();
        train2.output();
        train3.output();
        train4.output();
    }
}
