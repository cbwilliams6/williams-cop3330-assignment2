/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex29;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        double ror = inputs();
        double years = 72 / ror;

        System.out.print("It will take " + years + " years to double your initial investment.");
    }

    public static double inputs(){
        boolean test = false;
        double ror = 0;

        while (true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("What is the rate of return? ");
                ror = input.nextDouble();
                if (ror == 0)
                    System.out.println("Sorry. That's not a valid input.");
                else
                    test = true;
            }
            catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
            if (test)
                break;
        }

        return ror;
    }
}