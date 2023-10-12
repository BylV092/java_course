package airport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightList = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {

            flightList.add(new Flight("AAL933", "New York", "Santiago", dateFormat.parse("29/08/2021 05:39"), 62));
            flightList.add(new Flight("LAT 755", "Sao pablo", "Santiago", dateFormat.parse("31/08/2021 04:45"), 47));
            flightList.add(new Flight("SKU 621", "Rio de Janeiro", "Santiago", dateFormat.parse("30/08/2021 16:00"), 52));
            flightList.add(new Flight("DAL 147", "Atlanta", "Santiago", dateFormat.parse("29/08/2021 13:22"), 59));
            flightList.add(new Flight("AVA 241", "Bogota", "Santiago", dateFormat.parse("31/08/2021 14:05"), 25));
            flightList.add(new Flight("AMX 10", "Mexico City", "Santiago", dateFormat.parse("31/08/2021 05:20"), 29));
            flightList.add(new Flight("1BE 6833", "Londres", "Santiago", dateFormat.parse("30/08/2021 08:45"), 55));
            flightList.add(new Flight("LAT 2479", "Frankfurt", "Santiago", dateFormat.parse("29/08/2021 07:41"), 51));
            flightList.add(new Flight("SKU 803", "Lima", "Santiago", dateFormat.parse("30/08/2021 10:35"), 48));
            flightList.add(new Flight("LAT 533", "Los Ángeles", "Santiago", dateFormat.parse("29/08/2021 09:14"), 59));
            flightList.add(new Flight("LAT 1447", "Guayaquil", "Santiago", dateFormat.parse("31/08/2021 08:33"), 31));
            flightList.add(new Flight("CMP 111", "Panama City", "Santiago", dateFormat.parse("31/08/2021 15:15"), 29));
            flightList.add(new Flight("LAT 705", "Madrid", "Santiago", dateFormat.parse("30/08/2021 08:14"), 47));
            flightList.add(new Flight("AAL 957", "Miami", "Santiago", dateFormat.parse("29/08/2021 22:53"), 60));
            flightList.add(new Flight("ARG 5091.", "Buenos Aires", "Santiago", dateFormat.parse("31/08/2021 09:57"), 32));
            flightList.add(new Flight("LAT 1283", "Cancún", "Santiago", dateFormat.parse("31/08/2021 04:00"), 35));
            flightList.add(new Flight("LAT 579", "Barcelona", "Santiago", dateFormat.parse("29/08/2021 07:45"), 61));
            flightList.add(new Flight("AAL 945", "Dallas-Fort Worth", "Santiago", dateFormat.parse("30/08/2021 07:12"), 58));
            flightList.add(new Flight("LAT 501", "París", "Santiago", dateFormat.parse("29/08/2021 18:29"), 49));
            flightList.add(new Flight("LAT 405", "Montevideo", "Santiago", dateFormat.parse("30/08/2021 15:45"), 39));

        } catch (ParseException e) {
            System.err.println("fecha errada");
        }
        Collections.sort(flightList);

        Flight lastFlight = flightList.get(flightList.size()-1);
        Flight minPassengers = Collections.min(flightList,(v1, v2)->Integer.compare(v1.getNumberPassengers(), v2.getNumberPassengers()));

        System.out.println(" List flights: ");
        for (Flight flight: flightList){
            System.out.println(flight);
            System.out.println("========================================================");
        }
        System.out.println("The last flight in arrive: \n"+lastFlight+"\n");
        System.out.println("========================================================");
        System.out.println("The flight with menor passengers is: "+ minPassengers);
    }}
