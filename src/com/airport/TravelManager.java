package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.CommercialFlight;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import com.airport.Flight;
import java.lang.String;
import java.lang.*;

public class TravelManager {
//    public static void main(String[] args) throws NullParameterException, BadParameterException {
//        //Flight flight = new Flight("WEFLY", "ABC", "XYZ", "FLIGHTINESS", ); //must be Alphabetic & Must be capitalized
//        //Airline airline = new Airline("ALPHA"); //must be less than 8 Characters
//        //Flight flight2 = new Flight("2FAST", "DEF", "XYZ", "321", "12-3-10 5PM");
//        //Flight flight = new Flight("555", "");
//
//        Airport airportOrigin = new Airport("ABC"); //initializing Airport
//        Airport airportDestination = new Airport("XYZ"); //initializing destination airport
//        Airline airline = new Airline("MYAIR"); //initializing airline
//
//         //airportOrigin = new Airport(null); //TEST FOR NULL
//        // airportOrigin = new Airport(""); //TEST FOR Length
//        //Airport airportDestination = new Airport(""); //TEST FOR NULL
//        //Airline airline = new Airline(""); //TEST FOR NULL
//        //Date departureTime = new Date(2022, 0, 15, 5, 00);
//
//        Flight flight = new Flight(airline, airportOrigin, airportDestination, "", departureTime);
//        System.out.println(flight);
//    }}

    public static void main(String[] args) {
        try {
            Airline airline = new Airline("ALPHA");
            Airport origin = new Airport("ABC");
            Airport destination = new Airport("XYZ");
            Date departureTime = new Date(2022, 0, 15, 5, 00);
            //String departureTime = CommercialFlight.setDepartureTime();
            //CommercialFlight commercialFlight = new CommercialFlight("commercial", origin, destination,);
            //FlightManager.createFlight(airline, origin, destination);

            //Flight FlightManager;.getInstance()
            //List<Flight> flightList = new ArrayList<Flight>();
            String flightList = FlightManager.getInstance().createFlight("commercial", airline, origin, destination, departureTime);
            //String flightList = FlightManager.getInstance().createFlight("commercial", airline, origin, destination, departureTime, flightNumber); //create instance with our singleton
            List<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);
            //flightList = FlightManager.getInstance().createFlight("commercial", airline, origin, destination);
            //FlightManager.createFlight("commercial", airline, origin, destination, departureTime, flightNumber);
            //flightList.add(FlightManager.createFlight("type"));

            //System.out.println(FlightManager.createFlight("commercial"));
            System.out.println(flightList.get());
            //ystem.out.println(flightList);
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
