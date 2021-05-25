package EasyClassesAndObjects;

public class AgregAirline {
    Airline [] airlines = new Airline[2];

       public void addInArray(int index, String destination, int flightNumber,
                           String typeOfPlain, double flightTime,
                           String daysOfTheWeekend){
        airlines[index] = new Airline(destination, flightNumber, typeOfPlain,
                flightTime, daysOfTheWeekend);
        System.out.println(airlines[index].typeOfPlane);
    }



    public static void main(String[] args) {
        AgregAirline arrayAirline = new AgregAirline();
        arrayAirline.addInArray(0, "Bali", 1122,
                "Boing", 11.22, "friday");
        arrayAirline.toString();
//TODO Разобраться с методом toString() и дописать методы проверок!!

    }
}
