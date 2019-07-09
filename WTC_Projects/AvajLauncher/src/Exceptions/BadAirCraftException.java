package Exceptions;

public class BadAirCraftException extends Exception{
    public BadAirCraftException(String type){
        super("Invalid aircraft type: " + type);
    }
}
