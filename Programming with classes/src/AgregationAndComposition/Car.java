package AgregationAndComposition;

class Wheel{

    private String nameOfWheel;
    private double sizeOfWheel;

    Wheel(String nameOfWheel, double sizeOfWheel){
    this.nameOfWheel = nameOfWheel;
    this.sizeOfWheel = sizeOfWheel;
        System.out.println(nameOfWheel + " is a wheel having size = " + sizeOfWheel);
        }

        public void changeWheel(String nameOfWheel, double sizeOfWheel){
        this.nameOfWheel = nameOfWheel;
        this.sizeOfWheel = sizeOfWheel;
            System.out.println(nameOfWheel + " is a new wheel having size = " + sizeOfWheel);
        }
}

class Engine{


   private String stampOfEngine;
   private int power;
   private double scope;
   private int sizeOfTank = 0;


  Engine(String stampOfEngine, int power, double scope){
      this.stampOfEngine = stampOfEngine;
      this.power = power;
      this.scope = scope;
      System.out.println("This engine is " + stampOfEngine + " with power " + power +
              "having scope = " + scope);
  }

  public void refuel(int countOfLitres){
        if (sizeOfTank < 40){
        sizeOfTank += countOfLitres;
        System.out.println("Count of litres after gas station = " + countOfLitres);
        } else System.out.println("STOP! Tank is full!");
            }
        }

public class Car {

   private String nameOfCar;
   private String typeOfCar;
   private double weightOfTheCar;
   private String sizeOfTheCar;

   Wheel wheel;
   Engine engine;

    Car(String nameOfCar, String typeOfCar, double weightOfTheCar,
        String sizeOfTheCar, Engine engine){

        this.nameOfCar = nameOfCar;
        this.typeOfCar = typeOfCar;
        this.weightOfTheCar = weightOfTheCar;
        this.sizeOfTheCar = sizeOfTheCar;

        wheel = new Wheel("Front left wheel", 3.8);
        new Wheel("Front right wheel", 3.8);
        new Wheel("Back left wheel", 3.8);
        new Wheel("Back right wheel", 3.8);

        wheel.changeWheel("Front left wheel", 4.0);

        engine.refuel(5);

        System.out.println("This car is " + nameOfCar);
    }

    public static void main(String[] args) {
        Car car = new Car("Cadilac", "Passenger car", 3.6,
                "Long", new Engine("L764J8", 345, 2.2));

        car.wheel.changeWheel("Back right wheel", 5.2);

    }
}
