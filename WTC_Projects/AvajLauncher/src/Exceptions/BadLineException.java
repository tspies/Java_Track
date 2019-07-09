package Exceptions;

public class BadLineException extends Exception {
    public BadLineException(String message){
        super("Invalid line: " + message);
    }
}
