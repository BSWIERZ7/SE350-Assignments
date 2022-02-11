package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import java.lang.String;
import java.lang.*;


public class CommercialFlight {
    private Airline airline; //airline: Airline
    private Airport origin; //origin: Airport
    private Airport destination; //destination: Airport
    private UUID flightNumber;
    private Date departureTime; //departureTime: Date
    //private String flightNumber; //flightNumber: String



    public CommercialFlight(Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws NullParameterException, BadParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
        //setDepartureTime(departureTime);
        //setFlightNumber(flightNumber);
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    public void setDepartureTime() {
        this.departureTime = new Date(2022, 02, 22, 12, 30);
        //this.departureTime = departureTime;
    }

    private void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null.");
        }
        this.destination = destination;
    }

    private void setOrigin(Airport origin) throws NullParameterException {
        if (origin.equals(null)) {
            throw new NullParameterException("Origin cannot be null.");
        }
        this.origin = origin;
    }

    private void setAirline(Airline Airline) throws NullParameterException {
        if (airline.equals(null)) {
            throw new NullParameterException(("Airline cannot be null"));
        }
        this.airline = airline;
    }

    public String getAirline() {
        return airline.toString();
    }

    public String getOrigin() { //getter
        return origin.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }



//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("%-20s %s%n", "Airline: ", airline));
//        sb.append(String.format("%-20s %s%n", "Origin: ", origin));
//        sb.append(String.format("%-20s %s%n", "Destination: ", destination));
//        sb.append(String.format("%-20s %s%n", "FlightNumber: ", flightNumber));
//        sb.append(String.format("%-20s %s%n", "DepartureTime: ", departureTime));
//
//        return sb.toString();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialFlight commercialFlight = (CommercialFlight) o;
        return Objects.equals(airline, commercialFlight.airline) &&
                Objects.equals(origin, commercialFlight.origin) &&
                Objects.equals(destination, commercialFlight.destination) &&
                Objects.equals(flightNumber, commercialFlight.flightNumber) &&
                Objects.equals(departureTime, commercialFlight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }
}
