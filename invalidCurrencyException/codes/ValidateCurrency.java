/**
 * Utility class responsible for validating currency types input by the user.
 * <p>
 * This class checks whether the provided currency is one of the
 * supported types: INR, USD, or EURO.
 * If an unsupported currency is provided, it throws the custom
 * {@link InvalidCurrencyException}.
 * </p>
 * 
 * Author: Madhusudan Dande
 */
package com.invalidCurrencyException.codes;

public class ValidateCurrency {

    /**
     * Validates the given currency type.
     *
     * @param currency the currency code entered by the user
     * @return void
     * @throws InvalidCurrencyException if the currency is not supported
     *
     * <p>Supported currencies are:</p>
     * <ul>
     *     <li>INR</li>
     *     <li>USD</li>
     *     <li>EURO</li>
     * </ul>
     */
    public static void currencyValidator(String currency) throws InvalidCurrencyException {

        // Check if the currency matches any supported currency type
        if (!(currency.equals("INR") || currency.equals("USD") || currency.equals("EURO"))) {
            throw new InvalidCurrencyException(
                    "You have entered an invalid currency type: " + currency
            );
        }

        // Success message if currency is valid
        System.out.println("Currency accepted for payment.");
    }
}
