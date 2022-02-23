package com.airport;
import com.airport.CommercialFlight;
import com.airport.PassengerFlight;

public interface Flight {
    public String getFlightNumber();
   // public String getAirline(); //airline
    public String getDestination(); //airport
    public String getOrigin(); //airport
    //public String getPassengerCapacity(); //causes error in commercialFlight
}
