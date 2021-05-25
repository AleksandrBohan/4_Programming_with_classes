package AgregationAndComposition;

class City{

    String nameOfTheCity;
    double squareOfTheCity;
    int countOfThePeople;
    boolean capital;

    City(String nameOfTheCity, double squareOfTheCity,
         int countOfThePeople, boolean capital){

        this.nameOfTheCity = nameOfTheCity;
        this.squareOfTheCity = squareOfTheCity;
        this.countOfThePeople = countOfThePeople;
        this.capital = capital;

        if (capital = true){
           outputCapital();
        }

        squareOfTheCity(nameOfTheCity, squareOfTheCity);
    }
    public void outputCapital(){
        System.out.println(nameOfTheCity + " is a capital!");
    }

    public void squareOfTheCity(String nameOfTheCity, double squareOfTheCity){
        System.out.println("Square of the " + nameOfTheCity + " = " + squareOfTheCity);
    }
}

class Neighbourhood{

    String nameOfTheNeighbourhood;
    int countOfTheCities;
    City city;
    double squareOfTheNeighbourhood;


    Neighbourhood(String nameOfTheNeighbourhood, int countOfTheCities,
                  double squareOfTheNeighbourhood, City city){
        this.nameOfTheNeighbourhood = nameOfTheNeighbourhood;
        this.countOfTheCities = countOfTheCities;
        this.squareOfTheNeighbourhood = squareOfTheNeighbourhood;


    }
}

class Region{

}

public class State {
}
