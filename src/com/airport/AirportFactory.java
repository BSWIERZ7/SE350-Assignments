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

    //private static Map<String, Flight> flightCache = new HashMap<>();
    //private static Map<Airline, Flight> airlineFlightCache = new HashMap<>(); //airline
    private static Map<String, Airport> airportFlightCache = new HashMap<>(); //origin, destination

    public static Airport createOrigin(String origin) {
        //if (type.equals("commercialFlight")) { //create commercialFlight
        return airportFlightCache.computeIfAbsent(origin, newAirport -> {
            //Airline airline1 = airline;
            Airport newOrigin = null;
            //Airport newDestination = null;
            try {
                newOrigin = new Airport(origin);
                //newDestination = new Airport(destination);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return airportFlightCache.put(origin, newOrigin);
        });

    }

    public static Airport createDestination(String destination) {
        //if (type.equals("commercialFlight")) { //create commercialFlight
        return airportFlightCache.computeIfAbsent(destination, newAirport -> {
            //Airline airline1 = airline;
            Airport newDestination = null;
            //Airport newDestination = null;
            try {
                newDestination = new Airport(destination);
                //newDestination = new Airport(destination);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return airportFlightCache.put(destination, newDestination);
        });
    }

}
//    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
//        if (type.equals("commercialFlight")) { //create commercialFlight
//            try {
//                 //Flight newAirline = airlineFlightCache.computerIfAbsent(Flight, newFlight -> {
//                 //    return new CommercialFlight(airline, origin, destination);
//                 //}); //see week6 slide 39
//                return new CommercialFlight(airline, origin, destination);
//            } catch(NullParameterException e) {
//                return null;
//            }
//        }
//        else if (type.equals("passengerFlight")) { //create passengerFlight
//            try {
//                return new PassengerFlight(airline, origin, destination, passengerCapacity);
//            } catch(NullParameterException e) {
//                return null;
//            } catch(BadParameterException e) {
//                return null;
//            }
//
//        }
//
//        else return null;


    //test
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


