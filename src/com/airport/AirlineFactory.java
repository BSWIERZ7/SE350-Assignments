package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;
import com.airport.Airport;
import com.airport.Airline;
import com.airport.Flight;
import com.airport.PassengerFlight;

//have to STORE created object after creating
//each time we request to create an airport, we CHECK if it is created, returns existing object otherwise
//creates it and stores it
public class AirlineFactory {
    private AirlineFactory() {
    }

    //set it to static so we can use it without the need to instantiate instance of AirlineFactory
    // ->can use inside this class freely
    private static Map<String, Airline> airlineCache = new HashMap<>(); //airline

    public static Airline getAirline(String airline) {
        return airlineCache.computeIfAbsent(airline, (airlineName) -> {
            try {
                return new Airline(airlineName);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}

