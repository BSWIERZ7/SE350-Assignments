package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;


import java.sql.Time;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import java.util.Date;
import static java.util.Calendar.PM;
import static java.util.Calendar.getAvailableCalendarTypes;
import java.util.Calendar.Builder;

//Initialize One Airport
//Initialize One Airline
//Initialize One Flight
//Then pass your Flight Variable to System.out
public class TravelManager {
    public static void main(String[] args) throws NullParameterException, BadParameterException {
        //Flight flight = new Flight("WEFLY", "ABC", "XYZ", "FLIGHTINESS", ); //must be Alphabetic & Must be capitalized
        //Airline airline = new Airline("ALPHA"); //must be less than 8 Characters
        //Flight flight2 = new Flight("2FAST", "DEF", "XYZ", "321", "12-3-10 5PM");
        //Flight flight = new Flight("555", "");

        //System.out.println("Inside Travel Manager Testing");
        //System.out.println(flight2);
        // = new Flight("444");

        Airport airportOrigin = new Airport("ABC"); //initializing Airport
        Airport airportDestination = new Airport("XYZ"); //initializing destination airport
        Airline airline = new Airline("MYAIR"); //initializing airline

        //Airport airportOrigin = new Airport(""); //TEST FOR NULL
        //Airport airportDestination = new Airport(""); //TEST FOR NULL
        //Airline airline = new Airline(""); //TEST FOR NULL
        Date departureTime = new Date(2022, 0, 15, 5, 00);
        //System.out.println("departureTime = " + departureTime);
        //Date date = "2022/02/05 - 5 PM";
        //SimpleDateFormat departureDateAndTime = new SimpleDateFormat(DD/MM/YYYY/HR);
        //Date date = new Date();
        //Date departureTime = new Date("2022, 2, 5, 5, 0");
        //Date flight2;
        //flight2 = getDepartureTime();


        //Flight flight = new Flight("MYAIR", "ABC", "XYZ", "321", 2022);
        //Flight flight = new Flight(airline, airportOrigin, airportDestination, "321", departureTime);
        Flight flight = new Flight(airline, airportOrigin, airportDestination, "", departureTime);
        //Flight flight = new Flight(airline, airportOrigin, airportDestination, "321", departureTime);
        System.out.println(flight);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
