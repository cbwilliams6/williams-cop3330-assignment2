/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        ArrayList<String> contest = new ArrayList<String>();
        contest = nameLoop(contest);
        contestWinner(contest);
    }

    public static ArrayList<String> nameLoop(ArrayList<String> contest) {
        Scanner input = new Scanner(System.in);
        boolean test = true;

        while (test){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            contest.add(name);

            if (name == "") {
                contest.remove("");
                test = false;
            }
        }

        return contest;
    }

    public static void contestWinner(ArrayList<String> contest) {
        Random rand = new Random();
        int randomNum = rand.nextInt(contest.size());

        System.out.print("The winner is... " + contest.get(randomNum));
    }
}