package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.Airport;
import com.airport.Airline;
import com.airport.Flight;
import com.airport.PassengerFlight;

public class FlightFactory {
    private FlightFactory() {
    }

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

