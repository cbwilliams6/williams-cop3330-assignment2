/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        String[] numString = createArray();

        Integer[] numArray = filterEvenNumbers(numString);
        numArray = filterEvenNumbers(numString);

        System.out.print("The even numbers are ");
        for (int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }
    }

    public static String[] createArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numString = input.nextLine();
        String numString2[] = numString.split(" ");

        return numString2;
    }

    public static Integer[] filterEvenNumbers(String numString[]) {
        ArrayList<Integer> numArray = new ArrayList<Integer>();

        for (int i = 0; i < numString.length; i++){
            int num = Integer.parseInt(numString[i]);

            if (num % 2 == 0)
                numArray.add(num);
        }

        Integer[] integerArray = new Integer[numArray.size()];
        integerArray = numArray.toArray(integerArray);

        return integerArray;
    }
}