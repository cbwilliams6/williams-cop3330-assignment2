/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        double average, max, min, std;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers = numLoop(numbers);

        average = average(numbers);
        max = max(numbers);
        min = min(numbers);
        std = std(numbers);

        System.out.print("The average is " + average + "\nThe minimum is " + min + "\nThe maximum is " + max + "\nThe standard deviation is " + std);
    }

    public static ArrayList<Integer> numLoop(ArrayList<Integer> numbers) {
        boolean test2 = false;
        int numTest;

        while (true){
            try {
                Scanner input = new Scanner(System.in);
                boolean test = true;

                while (test){
                    numTest = 1;

                    System.out.print("Enter a number: ");
                    String enteredNum = input.nextLine();

                    if (enteredNum.equals("done")) {
                        numbers.remove("done");
                        test = false;
                        test2 = true;
                    }
                    else{
                        for (int i = 0; i < enteredNum.length(); i++){
                            if(Character.isDigit(enteredNum.charAt(i)))
                                numTest = 1;
                            else
                                numTest = 0;
                        }

                        if (numTest == 1)
                            numbers.add(Integer.parseInt(enteredNum));
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
            if (test2)
                break;
        }

        return numbers;
    }

    public static double average(ArrayList<Integer> numbers) {
        double average = 0;

        for (int i = 0; i < numbers.size(); i++) {
            average += numbers.get(i);
        }

        average /= numbers.size();
        return average;
    }

    public static double max(ArrayList<Integer> numbers) {
        double max = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i))
                max = numbers.get(i);
        }

        return max;
    }

    public static double min(ArrayList<Integer> numbers) {
        double min = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i))
                min = numbers.get(i);
        }

        return min;
    }

    public static double std(ArrayList<Integer> numbers) {
        double average = 0, std = 0;

        for (int i = 0; i < numbers.size(); i++) {
            average += numbers.get(i);
        }

        average /= numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            std = std + Math.pow((numbers.get(i) - average), 2);
        }

        std = Math.sqrt(std / numbers.size());

        return std;
    }
}