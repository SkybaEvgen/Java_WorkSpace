package de.exceptions;

public class InvalidIbanLengthException extends Exception {
    public InvalidIbanLengthException(String message) {
        super(message);
    }
}
