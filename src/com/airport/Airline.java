package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.Objects;

public class Airline {

    private String name;

    public Airline(String name) throws BadParameterException, NullParameterException { //constructor
        setName(name);
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) throws NullParameterException, BadParameterException { //setter name MUST be less than 8 Characters

        if (name == null) { //check for NULL
            throw new NullParameterException("Airline name cannot be null.");
        }
//        if (name.equals(null)) {
//            throw new NullParameterException("airline name cannot be null");
//        }
        if (name.length() >= 8 ) {
            throw new BadParameterException("Bad Name passed to setName: " + name);
        }
        this.name = name; //name is between 1-7 chars. This line will never execute if above Exception is thrown
    }

    /*
    public int length() { //for length of airline Name
        return name.length();
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("%-8s", name));
//
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + getName() + '\'' + '}';
    }
}
