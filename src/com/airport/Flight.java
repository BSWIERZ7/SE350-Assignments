package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.lang.String;
import java.lang.*;
import java.util.UUID;

public class Flight {
    private Airline airline; //airline: Airline
    private Airport origin; //origin: Airport
    private Airport destination; //destination: Airport
    private String flightNumber; //flightNumber: String
    private Date departureTime; //departureTime: Date

    public Flight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullParameterException, BadParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
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
        String randomFlightNum = String.valueOf(UUID.randomUUID());
        char UUID_1 = randomFlightNum.charAt(1);
        char UUID_2 = randomFlightNum.charAt(2);
        char UUID_3 = randomFlightNum.charAt(3);
        char UUID_4 = randomFlightNum.charAt(4);
        String newFlightNumber = String.valueOf((UUID_1 + UUID_2 + UUID_3 + UUID_4));

        this.flightNumber = newFlightNumber;
    }

    public Date getDepartureTime() { //getter
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline: ", airline));
        sb.append(String.format("%-20s %s%n", "Origin: ", origin));
        sb.append(String.format("%-20s %s%n", "Destination: ", destination));
        sb.append(String.format("%-20s %s%n", "FlightNumber: ", flightNumber));
        sb.append(String.format("%-20s %s%n", "DepartureTime: ", departureTime));

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
