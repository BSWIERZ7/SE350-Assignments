package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.CommercialFlight;

public class FlightFactory{

    private FlightFactory() throws NullParameterException, BadParameterException {
    }

    //add airline, origin, destination
    //public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, String departureTime)
    public static Flight createFlight(String type)
            throws BadParameterException, NullParameterException {
        //FlightFactory flight = null;
        Flight newflight = null;
        if(type.equals("commercial")) {
            Flight commercial = (Flight) new CommercialFlight();
            return commercial;
            //return newflight;
        }
        else return null; //NOT a commercial flight
    }

}
