package com.airport;

import com.airport.exception.BadParameterException;
import com.airport.exception.NullParameterException;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Objects;


//REQ: MUST ENFORCE NAME PASSED to be 3 Alphabetic & Capitalized Letters
public class Airport {
    private String name;

    public Airport(String name) throws BadParameterException, NullParameterException { //constructor
        setName(name);
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) throws BadParameterException, NullParameterException { //setter - THROW BadParameter Exception
        //this.name = name.toUpperCase(name);
        //this.name = name.toUpperCase();

        if (name == null | Objects.equals(name, "")) { //equals check if given "" as input
            throw new NullParameterException("Null value passed to Airline Name");
        }

        //CHECKS IF GIVEN NAME IS 3 CHARACTERS
        if(name.length() != 3) {
            throw new BadParameterException("Incorrect Name Length - REQ: 3 Characters. Given Name: " + name);
        }

        //CHECK IF NAME IS UPPERCASE - compare given name to uppercase version
        String upperCaseCheck = name.toUpperCase();
        if(name != upperCaseCheck) {
            throw new BadParameterException("Bad name passed -- Not uppercase " + name);
        }

        //CHECK IF NAME IS ALPHABETIC - compares char ascii values
        //boolean result;
        for(int index = 0; index < name.length()-1; index++) { //a = 97, b = 98
            if(name.charAt(index) > name.charAt(index+1)) { //index[0] > index[1]
                //result = false;
                throw new BadParameterException("Bad name passed -- Not Alphabetic " + name);
                //System.out.println("isAlphabetical? " + result);
            }
            else //index[0] < index[1] -> a(97) < b(98) - CONTINUE CHECK
                //result = true;
                //System.out.println("isAlphabetical? " + result);
                continue;
        }

        this.name = name; //if name is uppercase then this will pass
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
        //if(name != name.toUpperCase()) return false; //check if name is upperCase
        Airport airport = (Airport) o;
        return name.equals(airport.name);
        //String name = "abc";
        //    String nameUpper = name.toUpperCase(); // = ABC
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
