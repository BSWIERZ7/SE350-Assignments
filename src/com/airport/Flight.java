package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import static java.util.Calendar.PM;
import java.sql.Time;
import java.util.Calendar;

public class Flight {
    private Airline airline; //airline: Airline
    private Airport origin; //origin: Airport
    private Airport destination; //destination: Airport
    private String flightNumber; //flightNumber: String
    private Date departureTime; //departureTime: Date

    public Flight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullParameterException, BadParameterException {
        //setDepartureTime(departureTime);
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        //add a set flightNumber that will return random ID ->setFlightNumber(flightNumber)
    }

   public Airline getAirline() { //getter
        return airline;
   }

    public void setAirline(Airline airline) { //setter
        this.airline = airline;
    }

    public Airport getOrigin() { //getter
        return origin;
    }

    public void setOrigin(Airport origin) { //setter
        this.origin = origin;
    }

    public Airport getDestination() { //getter
        return destination;
    }

    public void setDestination(Airport destination) { //setter
        this.destination = destination;
    }

    public String getFlightNumber() { //getter
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) { //setter
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() { //getter
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
        //this.setDepartureTime(departureTime);
        //this.departureTime = getDepartureTime();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline: ", airline));
        sb.append(String.format("%-20s %s%n", "Origin: ", origin));
        sb.append(String.format("%-20s %s%n", "Destination: ", destination));
        sb.append(String.format("%-20s %s%n", "FlightNumber: ", flightNumber));
        //sb.append(String.format("DepartureTime: ", departureTime));
        sb.append(String.format("DepartureTime: ", getDepartureTime()));

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return airline.equals(flight.airline) && origin.equals(flight.origin) && destination.equals(flight.destination) && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(departureTime, flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }
}
