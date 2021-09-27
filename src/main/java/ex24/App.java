/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        if(isAnagram(str1, str2)){
            System.out.print("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        }
        else{
            System.out.print("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2){
        char[] arrayStr1 = str1.toCharArray();
        char[] arrayStr2 = str2.toCharArray();

        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);

        boolean strEqual = Arrays.equals(arrayStr1, arrayStr2);

        if (str1.length() == str2.length()){
            if(strEqual){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}