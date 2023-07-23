package airport;

import java.util.Date;

public class Flight implements Comparable<Flight>{
    private String nameFlight;
    private String origin;
    private String destiny;
    private Date arriveDate;
    private int numberPassengers;

    public Flight(String nameFlight, String origin, String destiny, Date arriveDate, int numberPassengers) {
        this.nameFlight = nameFlight;
        this.origin = origin;
        this.destiny = destiny;
        this.arriveDate = arriveDate;
        this.numberPassengers = numberPassengers;
    }

    public String getNameFlight() {
        return nameFlight;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    @Override
    public int compareTo(Flight otherFlight) {
        return this.arriveDate.compareTo(otherFlight.getArriveDate());
    }

    @Override
    public String toString() {
        return "Flight details: "+
                "\nNameFlight: " + nameFlight + '\'' +
                "\nOrigin: " + origin + '\'' +
                "\nDestiny: " + destiny + '\'' +
                "\nArrive Date: " + arriveDate +
                "\nNumber of Passengers: " + numberPassengers ;
    }
}
