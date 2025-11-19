/**
 * Test class to demonstrate the usage of ValidateCurrency and
 * the custom InvalidCurrencyException.
 * <p>
 * This program takes currency input from the user through the console
 * and validates it. If the currency is invalid, an exception message
 * is displayed to the user.
 * </p>
 * 
 * Author: Madhusudan Dande
 */
package com.invalidCurrencyException.codes;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        // Create scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Currency Type : ");
        String name = sc.next();   // Read currency input

        try {
            // Validate the user-entered currency
            ValidateCurrency.currencyValidator(name);
        } 
        catch (InvalidCurrencyException e) {
            // Print the message from the custom exception
            System.out.println(e.getMessage());
        }

        // Close the scanner resource
        sc.close();
    }
}
