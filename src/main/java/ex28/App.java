/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex28;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        int total = repeatPrompt();
        System.out.print("The total is " + total + ".");
    }

    public static int repeatPrompt(){
        Scanner input = new Scanner(System.in);
        int num, total = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            num = input.nextInt();
            total += num;
        }

        return total;
    }
}