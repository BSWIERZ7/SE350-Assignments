package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.Airline;
import com.airport.Airport;
import com.airport.CommercialFlight;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Date;
import java.util.Objects;
import java.lang.String;
import java.lang.*;

//to access Singleton object
    //singleton.getInstance().someMethod(); -> FlightManager.getInstance().someMethod();
    //singleton.getInstance().someMethod(); -> FlightManager.getInstance().createFlight();
    //int intVar = Singleton.getInstance().getSomeInteger();

public final class FlightManager{
    static List<Flight> flights = new ArrayList();
    private static FlightManager ourInstance;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance; //1st instance & reference to 1st instance IF there's a second instance attempt
    }

    private FlightManager() { //will cause above if statement to fail if 2nd attempt at instance
    }
    //public static void createFlight() throws BadParameterException, NullParameterException {
    //public static void createFlight(String type, Airline airline, Airport origin, Airport destination) throws BadParameterException, NullParameterException {
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, UUID setFlightNumber, Date setDepartureTime) throws BadParameterException, NullParameterException {
        //if(type.equals)
        //CommercialFlight flight = new CommercialFlight();
        //Do flightFactory.createFlight(type);
        //flightFactory.createFlight(commercial);
        Flight newFlight = FlightFactory.createFlight(type, airline, origin, destination, setFlightNumber, setDepartureTime);
        //flights.add(FlightFactory.createFlight("commercial"));
        flights.add(newFlight);
        return (Flight) flights;
    }

    //other methods here
    public void printHello() {
        System.out.println("Hello");
    }
}
