/**
 * This class provides a method to validate a user's age and demonstrates
 * the use of the custom InvalidAgeException.
 * <p>
 * The user is prompted to enter their age. If the entered age is below 18,
 * the method throws InvalidAgeException. Otherwise, the user is considered eligible.
 * </p>
 *
 * Author: Madhusudan Dande
 */
package com.invalidAgeException.codes;


public class ValidateAge {

    /**
     * Validates whether the given age meets the eligibility criteria.
     *
     * @param age the age entered by the user
     * @throws InvalidAgeException if the age is less than 18
     */
    public static void ageValidator(int age) throws InvalidAgeException {

        // Check if the age is below the required minimum
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        // Print success message if age is valid
        System.out.println("You are Eligible");
    }

   
}
