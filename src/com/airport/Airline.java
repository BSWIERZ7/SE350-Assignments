package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;

import java.util.Objects;

//NO need to instantiate a unique object for each flight.
//cache Airline object instances so that they can be re-used
//ensure that the cached Airline objects are immutable
//repeat for airport
public class Airline {

    private String name;

    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Airline name cannot be null.");
        }

        if (name.length() > 8) {
            throw new BadParameterException("Invalid name.");
        }

        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
