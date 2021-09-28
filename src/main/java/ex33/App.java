/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main( String[] args ){
        System.out.print("What's your question?\n> ");
        eightBall();
    }

    public static void eightBall() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

        String question = input.nextLine();

        String response = answers[randomNum];
        System.out.print(response);
    }
}