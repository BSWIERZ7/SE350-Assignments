package com.airport;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Objects;

//REQ: MUST ENFORCE NAME PASSED to be 3 Alphabetic & Capitalized Letters
public class Airport {
    private String name;

    public Airport(String name) { //constructor
        this.name = name;
    }

    public String getName() { //getter
        return name;
    }
/*
    public void setName(String name) { //setter - THROW BadParameter Exception
        this.name = name;
    }
 */
    public void setName(String name) { //setter - THROW BadParameter Exception
        //this.name = name.toUpperCase(name);
        this.name = name.toUpperCase();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-3s", name));

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
