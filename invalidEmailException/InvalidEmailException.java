/**
 * Custom exception that is thrown when an invalid or incorrectly
 * formatted email address is provided to the application.
 * <p>
 * This is a checked exception (extends Exception), meaning that
 * any method that may throw this exception must either handle it
 * using a try-catch block or declare it in the method signature
 * using the 'throws' keyword.
 * </p>
 *
 * Author: Madhusudan Dande
 */
package com.invalidEmailException;

public class InvalidEmailException extends Exception {

    /**
     * Creates a new InvalidEmailException with the specified error message.
     *
     * @param message a meaningful description of why the email is invalid
     */
    public InvalidEmailException(String message) {
        super(message);
    }
}
