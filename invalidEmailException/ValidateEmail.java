/**
 * This class provides a method to validate an email address and uses
 * the custom InvalidEmailException when the email does not meet the
 * required format.
 * <p>
 * In this example, the email is considered valid only if it contains
 * the '@' character and ends with "gmail.com". If these conditions are
 * not met, a custom exception is thrown.
 * </p>
 *
 * Author: Madhusudan Dande
 */
package com.invalidEmailException;

public class ValidateEmail {

    /**
     * Validates the format of the given email address.
     *
     * @param email the email address entered by the user
     * @throws InvalidEmailException if the email does not match the expected format
     *
     * <p>Basic validation rules:</p>
     * <ul>
     *     <li>Email must contain '@'</li>
     *     <li>Email must contain or end with "gmail.com"</li>
     * </ul>
     */
    public static void emailValidator(String email) throws InvalidEmailException {

        // Check if the email contains '@' and the Gmail domain
        if (!(email.contains("@") && email.contains("gmail.com"))) {
            throw new InvalidEmailException("Please enter a correct email format: " + email);
        }

        // If email passes validation
        System.out.println("Valid Email");
    }
}
