package com.airport;

import com.airport.exception.BadParameterException;

public class Airline {
    private String name;

    public Airline(String name) { //constructor
        this.name = name;
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) throws BadParameterException { //setter name MUST be less than 8 Characters
        //int Airlinelength = name.length();
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
}
