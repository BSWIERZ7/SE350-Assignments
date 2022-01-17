package com.airport;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World!");
    String name = "abc";
    String nameUpper = name.toUpperCase(); // = ABC
    System.out.println("name = " + name + " and nameUpper = " + nameUpper);

    String nameAlpha = "bac";
    //Boolean nameAlphaCheck = nameAlpha.ar
    char position1 = 'a';
    char position2 = 'b';
    //System.out.println("name = " + character);
        String indexString = "abc";
        //String indexString = "fed";

        //String indexStringCheck = indexString;
        boolean result;
        System.out.println("Character Index Positon check - Index:" + indexString.charAt(1));
        //System.out.println("position 2 is greater - Char:" + position2);
        //int index = 0;
        for(int index = 0; index < indexString.length()-1; index++) { //a > b, a(97) < b(98)
            if(indexString.charAt(index) < indexString.charAt(index+1)) { //if 97 < 98
                result = true;
                System.out.println("isAlphabetical? " + result);
            }
            else
                result = false;
                System.out.println("isAlphabetical? " + result);
        }
    if( 'a' > 'b') System.out.println("position 1 is greater - Char: "+ position1);
    else
        System.out.println("position 2 is greater - Char:" + position2);
    }
}
