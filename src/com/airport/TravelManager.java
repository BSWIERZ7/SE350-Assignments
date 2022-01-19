package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import java.util.Date;

public class TravelManager {
    public static void main(String[] args) throws NullParameterException, BadParameterException {
        //Flight flight = new Flight("WEFLY", "ABC", "XYZ", "FLIGHTINESS", ); //must be Alphabetic & Must be capitalized
        //Airline airline = new Airline("ALPHA"); //must be less than 8 Characters
        //Flight flight2 = new Flight("2FAST", "DEF", "XYZ", "321", "12-3-10 5PM");
        //Flight flight = new Flight("555", "");

        Airport airportOrigin = new Airport("ABC"); //initializing Airport
        Airport airportDestination = new Airport("XYZ"); //initializing destination airport
        Airline airline = new Airline("MYAIR"); //initializing airline

        //Airport airportOrigin = new Airport(""); //TEST FOR NULL
        //Airport airportDestination = new Airport(""); //TEST FOR NULL
        //Airline airline = new Airline(""); //TEST FOR NULL
        Date departureTime = new Date(2022, 0, 15, 5, 00);

        Flight flight = new Flight(airline, airportOrigin, airportDestination, "", departureTime);
        System.out.println(flight);
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
