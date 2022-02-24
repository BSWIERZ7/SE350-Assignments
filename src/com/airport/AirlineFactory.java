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
        //Map<String, Airline> airlineFlightCache = new HashMap<>();

    }

    //private static Map<String, Flight> flightCache = new HashMap<>();
    private static Map<String, Airline> airlineFlightCache = new HashMap<>(); //airline

    public static Airline createAirline(String airline) {
        //if (type.equals("commercialFlight")) { //create commercialFlight
        return airlineFlightCache.computeIfAbsent(airline, newAirline -> {
            //return new Airline();}
            //Airline airline1 = airline;
            Airline newName;
            try {
                newName = new Airline(airline);
                return airlineFlightCache.put(airline, newName);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
            //return airlineFlightCache.put(airline, newName);
        });

    }

   // private static Airline apply(String newAirline) {
      //  return airline = new Airline();
        //Airline airline1 = new Airline(airline);
        //airlineFlightCache.add(airline1);
        //return airline1;
        //return new airline();
        //return new Airline(airline);
   // }
    //airlineFlightCache.add(airline);
                //return airline;




    //private static Map<Airport, Flight> airportFlightCache = new HashMap<>(); //origin, destination

//    public static Airline createAirline(Airline airline) {
//        //if (type.equals("commercialFlight")) { //create commercialFlight
//        if(airlineFlightCache.get(airline) == null) {//not inside
//            try {
//                //if(airlineFlightCache.get(origin) == null) {//not inside
//                airlineFlightCache.add(airline);
//                 //Flight newAirline = airlineFlightCache.computerIfAbsent(Flight, newFlight -> {
//                 //    return new CommercialFlight(airline, origin, destination);
//                 //}); //see week6 slide 39
//                    return airline;
//                //return new CommercialFlight(airline, origin, destination);
//            } catch(NullParameterException e) {
//                return null;
//            } catch(BadParameterException e) {
//                return null;
//            }
//
//        }
//
//        else return null;
//    }

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
}

