package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.Objects;

//needs hashcode + equals
public class Airline {
    private String name;

    public Airline(String name) throws BadParameterException, NullParameterException { //constructor
        //this.name = name;
        setName(name);
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) throws NullParameterException, BadParameterException { //setter name MUST be less than 8 Characters
        //int Airlinelength = name.length();
        if (name == null | Objects.equals(name, "")) { //equals check if given "" as input
            throw new NullParameterException("Null value passed to Airline Name");
        }

        if (name.length() >= 8 ) {
            throw new BadParameterException("Bad Name passed to setName: " + name);
        }
        this.name = name; //name is between 1-7 chars. This line will never execute if above Exception is thrown
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-8s", name));

        return sb.toString();
    }

    public int length() { //for length of airline Name
        return name.length();
    }
}
