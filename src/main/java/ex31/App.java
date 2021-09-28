/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex31;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        int age = 0, restingPulse = 0;
        boolean test = false, ageValid = false;

        while (true){
            try {
                Scanner input = new Scanner(System.in);
                ageValid = false;
                System.out.print("Enter your age: ");
                age = input.nextInt();
                if (age == 0)
                    System.out.println("Sorry. That's not a valid input.");
                else
                    ageValid = true;

                if (ageValid == true) {
                    System.out.print("Enter your resting heart rate: ");
                    restingPulse = input.nextInt();
                    if (restingPulse == 0)
                        System.out.println("Sorry. That's not a valid input.");
                    else
                        test = true;
                }
            }
            catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
            if (test)
                break;
        }

        System.out.print("\nResting pulse: " + restingPulse + "\t\tAge: " + age + "\n\nIntensity\t| Rate\n------------|----------\n");
        heartRateTable(age, restingPulse);
    }

    public static void heartRateTable(int age, int restingPulse){
        int targetRate;
        for (int i = 55; i <= 95; i += 5){
            targetRate = (((220 - age) - restingPulse) * i/100) + restingPulse;
            System.out.print(i + "%\t\t\t| " + targetRate + " bpm\n");
        }
    }
}