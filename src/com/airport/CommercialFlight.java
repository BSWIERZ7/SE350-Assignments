package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import com.airport.Airport;
import com.airport.Airline;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.lang.String;
import java.lang.*;

//modified it because our Flight was changed from interface or an abstract class. We put all the information from our previous commercialFlight and placed it all in
//Flight abstract class, that way we don't have to choose between the two flights as they share that information.
public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        super(airline, origin, destination);
    }
}
