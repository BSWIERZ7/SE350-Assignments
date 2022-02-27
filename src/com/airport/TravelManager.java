package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.Airline;
import com.airport.Airport;
import com.airport.Flight;
import com.airport.CommercialFlight;
import com.airport.PassengerFlight;
import java.lang.String;
import java.lang.*;
import java.util.Optional;



public class TravelManager {

    public static void main(String[] args) throws Exception, NullParameterException {
        try {
        /* //BEFORE flyweight, instantiated airline/airport objects in this manner
        Airline airline = new Airline("ALPHA");
        Airport origin = new Airport("ABC");
        Airport destination = new Airport("XYZ");
        */

        //Null is never thrown because there isn't a null event, instead its a different type of Exception
        //*/
        Airline airline = AirlineFactory.getAirline("Alpha");
        Airport origin = AirportFactory.getAirport("ABC");
        Airport destination = AirportFactory.getAirport("XYZ");

        int passengerCapacity = 50;

        //*/
        //Instance of Commercial Flight
        String flightNumber_commercial = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, passengerCapacity);
        Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber_commercial);
        System.out.println(flight.get());
        //System.out.println(flight);
        //*/

        //Instance of Passenger Flight
        String flightNumber_passenger = FlightManager.getInstance().createFlight("passengerFlight", airline, origin, destination, passengerCapacity);
        FlightManager.getInstance().getFlightByFlightNumber(flightNumber_passenger);
        System.out.println(flight.get());

        Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber_passenger);
        System.out.println(flight2.get());

    } catch (NullParameterException e) {
        e.printStackTrace();
    } catch (BadParameterException e) {
        e.printStackTrace();
    }
    }

}
