package Exceptions;

public class InvalidSimLineException extends Exception{
    public InvalidSimLineException(String simLine){
        super("Error due to: SimLine $$ " + simLine + " $$ invalid simulation number specified.");
    }
}
