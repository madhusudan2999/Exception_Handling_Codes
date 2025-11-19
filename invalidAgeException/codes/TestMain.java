/**
 * TestMain class to demonstrate the validation of age using
 * the custom InvalidAgeException.
 *
 * The program asks the user to enter their age and checks
 * whether they meet the minimum eligibility criteria (18 years).
 * If the age is invalid, an appropriate exception message is displayed.
 *
 * Author: Madhusudan Dande
 */
package com.invalidAgeException.codes;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        // Scanner to read user input from console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age : ");
        int age = sc.nextInt();  // read user input

        try {
            // Calling validation method
            ValidateAge.ageValidator(age);
        } 
        catch (InvalidAgeException e) {
            // Display custom exception message
            System.out.println(e.getMessage());
        }

        // Closing scanner resource
        sc.close();
    }
}
