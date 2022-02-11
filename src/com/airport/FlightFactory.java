package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.Airline;
import com.airport.Airport;
import com.airport.CommercialFlight;
import java.util.UUID;
import java.util.Date;
import java.util.Objects;
import java.lang.String;
import java.lang.*;

public class FlightFactory{

    private FlightFactory() throws NullParameterException, BadParameterException {
    }

    //add airline, origin, destination
    //public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, String departureTime)
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, UUID setFlightNumber, Date setDepartureTime) throws BadParameterException, NullParameterException {
        //FlightFactory flight = null;
        Flight newflight = null;
        //try {
            if (type.equals("commercial")) {
                try {
                    return (Flight) new CommercialFlight(airline, origin, destination, setFlightNumber, setDepartureTime);
                } catch (NullParameterException e) {
                    return null;
                } catch (BadParameterException e) {
                    e.printStackTrace();
                }
            }
            else
                return null;
            return null;
            //return newflight;
            }
    }
