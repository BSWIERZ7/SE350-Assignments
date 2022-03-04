package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;



import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.lang.String;
import java.lang.*;

public class PassengerFlight extends Flight {

    private int passengerCapacity;

//    public PassengerFlight(Airline airline, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException, BadParameterException {
//        setAirline(airline);
//        setOrigin(origin);
//        setDestination(destination);
//        setPassengerCapacity(passengerCapacity);
//        setFlightNumber();
//        setDepartureTime();
//        //setPassengerCapacity(this.passengerCapacity);
//    }

    public PassengerFlight(Airline airline, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException, BadParameterException {
        super(airline, origin, destination);
        setPassengerCapacity(passengerCapacity);
    }

    private void setPassengerCapacity(int passengerCapacity) throws BadParameterException {
        if (this.passengerCapacity <= 0) {
            throw new BadParameterException("passengerCapacity must be a non-zero integer");
        }
        this.passengerCapacity = passengerCapacity; //not 0
    }

    public int getPassengerCapacity() { return passengerCapacity; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerFlight that = (PassengerFlight) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }

    @Override
    public String toString() {
        return super.toString() +
                "passengerCapacity=" + passengerCapacity +
                '}';

    }
}
