/**
 * Custom exception used to indicate that an invalid or unsupported age
 * value has been provided to the application.
 * <p>
 * This is a checked exception (extends Exception), so any method that may
 * throw this exception must either handle it using a try-catch block or
 * declare it in the method signature using the 'throws' keyword.
 * </p>
 *
 * Author: Madhusudan Dande
 */
package com.invalidAgeException.codes;

public class InvalidAgeException extends Exception {

    /**
     * Constructs a new InvalidAgeException with the specified detail message.
     *
     * @param message a descriptive message explaining the reason for the invalid age
     */
    public InvalidAgeException(String message) {
        super(message);
    }
}
