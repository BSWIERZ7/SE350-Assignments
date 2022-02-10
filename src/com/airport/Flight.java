package com.airport;
import com.airport.CommercialFlight;

public interface Flight {
    void setAirline();
    void setOrigin();
    void setDestination();
    void setFlightNumber();
    void setDepartureTime();
    String getAirline();
}
