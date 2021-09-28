/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex30;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        multiplicationTable();
    }

    public static void multiplicationTable() {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                System.out.print(String.format("%4d", (i * j)));
            }
            System.out.print("\n");
        }
    }
}