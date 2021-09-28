/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex32;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main( String[] args ){
        int difficulty = 0;
        boolean test = false;

        while (true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Let's play Guess the Number!\n\nEnter the difficulty level (1, 2, or 3): ");
                difficulty = input.nextInt();
                if (difficulty == 0 || difficulty < 0 || difficulty > 3)
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

        difficulties diff = new difficulties();
        diff.difficulty(difficulty);

        Scanner input2 = new Scanner(System.in);
        System.out.print("\nDo you wish to play again? ");
        String playAgain = input2.nextLine();

        if (playAgain.equalsIgnoreCase("y"))
            main(null);
    }
}

class difficulties {
    public static void difficulty(int diff){
        Random rand = new Random();
        int randomNum = 0, guess = 0, counter = 0;
        boolean test = false, guessedRight = false;

        if (diff == 1) {
            randomNum = rand.nextInt(10);
            randomNum++;
        }
        else if (diff == 2) {
            randomNum = rand.nextInt(100);
            randomNum++;
        }
        else {
            randomNum = rand.nextInt(1000);
            randomNum++;
        }

        while (true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("I have my number. What's your guess? ");

                while (!guessedRight){
                    guess = input.nextInt();
                    if (guess == randomNum) {
                        guessedRight = true;
                        counter += 1;
                        System.out.print("You got it in " + counter + " guesses!");
                        test = true;
                    }
                    else if (guess < randomNum) {
                        System.out.print("Too low. Guess again: ");
                        counter += 1;
                    }
                    else {
                        System.out.print("Too high. Guess again: ");
                        counter += 1;
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
            if (test)
                break;
        }
    }
}