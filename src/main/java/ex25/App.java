/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex25;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password to test: ");
        String password = input.nextLine();

        passwordValidator passwordValidator1 = new passwordValidator();
        int passValue = passwordValidator1.passwordValidatorF(password);

        switch (passValue){
            case 1:
                System.out.print("The password '" + password + "' is a very weak password.");
                break;
            case 2:
                System.out.print("The password '" + password + "' is a weak password.");
                break;
            case 3:
                System.out.print("The password '" + password + "' is a strong password.");
                break;
            case 4:
                System.out.print("The password '" + password + "' is a very strong password.");
                break;
        }
    }
}

class passwordValidator {
    int passwordValidatorF(String password){
        int passLength = password.length(), passResult = 0;
        boolean passLetters = false, passNums = false, passSpecial = false;

        for (int i = 0; i < passLength; i++){
            if (Character.isLetter(password.charAt(i)))
                passLetters = true;
            else if (Character.isDigit(password.charAt(i)))
                passNums = true;
            else
                passSpecial = true;
        }

        if (passLength < 8){
            if (passNums)
                passResult = 1;
            if (passLetters)
                passResult = 2;
        }
        else{
            if (passLetters && passNums)
                passResult = 3;
            if (passLetters && passNums && passSpecial)
                passResult = 4;
        }

        return passResult;
    }
}