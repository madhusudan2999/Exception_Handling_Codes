/**
 * Custom exception used to indicate that an invalid or unsupported
 * currency type has been provided to the application.
 *
 * This is a checked exception, so it must be either handled
 * using try-catch or declared in the method signature using 'throws'.
 *
 * @author Madhusudan Dande
 */
package com.invalidCurrencyException.codes;

public class InvalidCurrencyException extends Exception {

    /**
     * Constructs a new InvalidCurrencyException with the specified detail message.
     *
     * @param message a descriptive message explaining why the currency is invalid
     */
    public InvalidCurrencyException(String message) {
        super(message);
    }
}
