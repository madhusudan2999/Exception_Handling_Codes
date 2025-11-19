/**
 * TestMain class to demonstrate the validation of an email address
 * using the custom InvalidEmailException and the ValidateEmail class.
 * <p>
 * This program prompts the user to enter an email address. If the email
 * format is invalid, the custom exception message is displayed. If valid,
 * a success message is printed.
 * </p>
 *
 * Author: Madhusudan Dande
 */
package com.invalidEmailException;

import java.util.Scanner;

public class TestMain {

    /**
     * Main method to accept user input and perform email validation.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Scanner to read input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Email : ");
        String email = sc.next();  // Read user input

        try {
            // Call the validator method to check email format
            ValidateEmail.emailValidator(email);
        }
        catch (InvalidEmailException e) {
            // Display the custom exception message
            System.out.println(e.getMessage());
        }

        // Closing scanner to avoid resource leak
        sc.close();
    }
}
