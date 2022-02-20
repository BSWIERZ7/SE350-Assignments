package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.Airport;
import com.airport.Airline;
import com.airport.Flight;
import com.airport.PassengerFlight;

import java.util.HashMap;
import java.util.Map;

public class FlightFactory {
    private FlightFactory() {
    }

    //private static Map<String, Flight> flightCache = new HashMap<>();
    private static Map<Airline, Flight> airlineFlightCache = new HashMap<>();
    private static Map<Airport, Flight> airportFlightCache = new HashMap<>();

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        if (type.equals("commercialFlight")) { //create commercialFlight
            try {
               // Flight newAirline = airlineFlightCache.computerIfAbsent(String, newFlight -> {}) //see week6 slide 39
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        else if (type.equals("passengerFlight")) { //create passangerFlight
            try {
                return new PassengerFlight(airline, origin, destination, passengerCapacity);
            } catch(NullParameterException e) {
                return null;
            } catch(BadParameterException e) {
                return null;
            }

        }
        else return null;
    }



    //airport and airline is the same for all flights so recycle that section. Part that changes is flightnumber and passengercapacity
    //add a getFlight()
    //public static Flight getFlight(String flight) {return flight};

    /* //before changes w/ flyweight pattern
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        if (type.equals("commercialFlight")) { //create commercialFlight
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        else if (type.equals("passengerFlight")) { //create passangerFlight
            try {
                return new PassengerFlight(airline, origin, destination, passengerCapacity);
            } catch(NullParameterException e) {
                return null;
            } catch(BadParameterException e) {
                return null;
            }

        }

        else return null;
    }
    */

    //add flyweight pattern within the factory - each time we request an object, the factory checks if it has been created
    //Create hashmap - create one of each flight - in our case two types, a commercial and passenger

}

