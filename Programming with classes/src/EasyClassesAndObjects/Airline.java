package EasyClassesAndObjects;

public class Airline {

    String destination;
    int flightNumber;
    String typeOfPlane;
    double flightTime;
    String daysOfTheWeekend;


    public Airline(String destination, int flightNumber,
                   String typeOfPlane, double flightTime,
                   String daysOfTheWeekend) {

        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfPlane = typeOfPlane;
        this.flightTime = flightTime;
        this.daysOfTheWeekend = daysOfTheWeekend;

    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }

    public String getDaysOfTheWeekend() {
        return daysOfTheWeekend;
    }

    public void setDaysOfTheWeekend(String daysOfTheWeekend) {
        this.daysOfTheWeekend = daysOfTheWeekend;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfPlane='" + typeOfPlane + '\'' +
                ", flightTime=" + flightTime +
                ", daysOfTheWeekend='" + daysOfTheWeekend + '\'' +
                '}';
    }

}
