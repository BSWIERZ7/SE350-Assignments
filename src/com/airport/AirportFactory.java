package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;
import com.airport.Airport;
import com.airport.Airline;
import com.airport.Flight;
import com.airport.PassengerFlight;
import com.airport.CommercialFlight;

public class AirportFactory {
    private AirportFactory() {
    }

    //if you want to utilize class attributes, THEN you have to define as static
    //private static Map<String, Flight> flightCache = new HashMap<>();
    //private static Map<Airline, Flight> airlineFlightCache = new HashMap<>(); //airline
    private static Map<String, Airport> airportCache = new HashMap<>(); //origin, destination

    //static means I don't need to instantiate an instance of AirportFactory to access
    //this method
    public static Airport getAirport(String airport) {
        return airportCache.computeIfAbsent(airport, airportName -> {
            try {
                return new Airport(airportName);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}


