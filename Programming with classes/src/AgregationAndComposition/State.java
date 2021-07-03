package AgregationAndComposition;

class City{

    String nameOfTheCity;
    double squareOfTheCity;
    boolean capital;

    City(String nameOfTheCity, double squareOfTheCity,
         int countOfThePeople, boolean capital){

        this.nameOfTheCity = nameOfTheCity;
        this.squareOfTheCity = squareOfTheCity;
        this.capital = capital;

        if (capital = true){
           outputCapital();
        }
        nameOfTheCity();
        squareOfTheCity(nameOfTheCity, squareOfTheCity);
    }

    public void nameOfTheCity(){
        System.out.println("City name is  " + nameOfTheCity);
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
    double squareOfTheNeighbourhood;


    Neighbourhood(String nameOfTheNeighbourhood, int countOfTheCities,
                  double squareOfTheNeighbourhood){
        this.nameOfTheNeighbourhood = nameOfTheNeighbourhood;
        this.countOfTheCities = countOfTheCities;
        this.squareOfTheNeighbourhood = squareOfTheNeighbourhood;

        nameOfTheNeighbourhood();
        getCountOfTheCities();
        neighbourhoodSquare();
    }

    public void getCountOfTheCities(){
        System.out.println("Count of the cities = " + countOfTheCities);
    }

    public void nameOfTheNeighbourhood(){
        System.out.println("Neighbourhood name is  " + nameOfTheNeighbourhood);
    }

    public void neighbourhoodSquare(){
        System.out.println("Neighbourhood square is  " + squareOfTheNeighbourhood);
    }

}

class Region{

    String nameOfTheRegion;
    double squareOfTheRegion;

    Region(String nameOfTheRegion, double squareOfTheRegion){
        this.nameOfTheRegion = nameOfTheRegion;
        this.squareOfTheRegion = squareOfTheRegion;

        regionName();
        regionSquare();

    }

    public void regionName(){
        System.out.println("Region name is  " + nameOfTheRegion);
    }

    public void regionSquare(){
        System.out.println("Region square is  " + squareOfTheRegion);
    }

}

public class State {
    Region [] regions;
    Neighbourhood [] neighbourhoods;
    City [] cities;
    State (Region [] regions, Neighbourhood [] neighbourhoods, City[]cities) {
        this.cities = cities;
        this.neighbourhoods = neighbourhoods;
        this.regions = regions;
    }
public void countOfTheCities( Neighbourhood [] neighbourhoods){
    System.out.println("Count of region centers = " + neighbourhoods.length);
    for (int i = 0; i < neighbourhoods.length; i++){
        neighbourhoods[i].neighbourhoodSquare();
    }
}

    public void countOfTheRegions(Region [] regions){
        System.out.println("Count of regions = " + regions.length);
    }

    public static void main(String[] args) {
        State state = new State({new Region("Минская",
                123.4), new Region("Могилёвская", 1245.7)},
                {new Neighbourhood("Молодечненский", 5,
                12.9),
                        new Neighbourhood("Воложинский", 3, 8.1)});
    }
}
