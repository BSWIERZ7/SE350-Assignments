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

    public static void main(String[] args) throws Exception {
        try {
            Airline airline = new Airline("ALPHA");
            Airport origin = new Airport("ABC");
            Airport destination = new Airport("XYZ");
            int passengerCapacity = 10;


            //CommercialFlight commercialFlight = new CommercialFlight(airline, origin, destination);
            //String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination);

            //Instance of Commercial Flight
            String flightNumber_commercial = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, passengerCapacity);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber_commercial);
            System.out.println(flight.get());

            /* //Instance of Passenger Flight
            String flightNumber_passenger = FlightManager.getInstance().createFlight("passengerFlight", airline, origin, destination, passengerCapacity);
            Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber_passenger);
            System.out.println(flight2.get());
            */

        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}
