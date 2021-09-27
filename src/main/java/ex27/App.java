/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex27;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the zip code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        inputValidation validate = new inputValidation();
        validate.validateInput(firstName, lastName, zipCode, employeeID);
    }
}

class inputValidation {
    public void validateInput(String firstName, String lastName, String zipCode, String employeeID){
        boolean firstValid, lastValid, firstEntered, lastEntered, zipValid, idValid;
        String result = "";

        firstValid = validateFirst(firstName);
        lastValid = validateLast(lastName);
        firstEntered = validateFirstEntered(firstName);
        lastEntered = validateLastEntered(lastName);
        zipValid = validateZip(zipCode);
        idValid = validateEmployeeID(employeeID);

        if (!firstValid)
            result = result + "The first name must be at least 2 characters long.\n";
        if (!firstEntered)
            result = result + "The first name must be filled in.\n";
        if (!lastValid)
            result = result + "The last name must be at least 2 characters long.\n";
        if (!lastEntered)
            result = result + "The last name must be filled in.\n";
        if (!zipValid)
            result = result + "The zipcode must be a 5 digit number.\n";
        if (!idValid)
            result = result + "The employee ID must be in the format of AA-1234.\n";
        if (firstValid && firstEntered && lastValid && lastEntered && zipValid && idValid)
            result = "There were no error found.";

        System.out.print(result);
    }

    public boolean validateFirst(String firstName) {
        boolean valid = false;
        if (firstName.length() >= 2)
            valid = true;

        return valid;
    }

    public boolean validateFirstEntered(String firstName) {
        boolean valid = true;
        if (firstName.length() == 0)
            valid = false;

        return valid;
    }

    public boolean validateLast(String lastName) {
        boolean valid = false;
        if (lastName.length() >= 2)
            valid = true;

        return valid;
    }

    public boolean validateLastEntered(String lastName) {
        boolean valid = true;
        if (lastName.length() == 0)
            valid = false;

        return valid;
    }

    public boolean validateZip(String zipCode) {
        boolean valid = false, zipLetters = false, zipNums = false, zipSpecial = false;
        int length = zipCode.length();

        if (length > 5) {
            for (int i = 0; i < length; i++) {
                if (Character.isLetter(zipCode.charAt(i)))
                    zipLetters = true;
                else if (Character.isDigit(zipCode.charAt(i)))
                    zipNums = true;
                else
                    zipSpecial = true;
            }
            if (zipNums && !zipLetters && !zipSpecial)
                valid = true;
        }

        return valid;
    }

    public boolean validateEmployeeID(String employeeID) {
        boolean valid = false;
        int length = employeeID.length();

        if (length > 0) {
            for (int i = 0; i < 2; i++) {
                if (Character.isLetter(employeeID.charAt(i))) {
                    i++;
                    if (employeeID.charAt(i) == '-') {
                        for (i = 3; i < length; i++) {
                            if (Character.isDigit(employeeID.charAt(i)))
                                valid = true;
                        }
                    }
                }
            }
        }

        return valid;
    }
}