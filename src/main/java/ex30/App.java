/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex30;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
    }
}