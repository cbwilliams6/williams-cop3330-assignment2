/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        String[] specialList = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        String[] letterList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] numList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String[] password = createPassword(specialList, letterList, numList);

        System.out.print("Your password is ");
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
    }

    public static String[] createPassword(String[] specialList, String[] letterList, String[] numList) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int length, special, nums, letters, randomNum;
        ArrayList<String> password = new ArrayList<String>();

        System.out.print("What's the minimum length? ");
        length = input.nextInt();
        System.out.print("How many special characters? ");
        special = input.nextInt();
        System.out.print("How many numbers? ");
        nums = input.nextInt();

        letters = special * nums;
        if ((letters + special + nums) < length)
            letters += (length - letters - special - nums);

        for (int i = 0; i < letters; i++) {
            randomNum = rand.nextInt(letterList.length);
            password.add(letterList[randomNum]);
        }

        for (int i = 0; i < special; i++) {
            randomNum = rand.nextInt(specialList.length);
            password.add(specialList[randomNum]);
        }

        for (int i = 0; i < nums; i++) {
            randomNum = rand.nextInt(numList.length);
            password.add(numList[randomNum]);
        }

        Collections.shuffle(password);
        String[] stringArray = new String[password.size()];
        stringArray = password.toArray(stringArray);

        return stringArray;
    }
}