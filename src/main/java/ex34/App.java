/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<String>();

        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        printEmployees(employees);
        removeEmployee(employees);
        printEmployees(employees);
    }

    public static void removeEmployee(ArrayList<String> employees) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nEnter an employee name to remove: ");
        String remove = input.nextLine();
        System.out.print("\n");

        employees.remove(remove);
    }

    public static void printEmployees(ArrayList<String> employees) {
        System.out.print("There are " + employees.size() + " employees:");
        for (int i = 0; i < employees.size(); i++){
            System.out.print("\n" + employees.get(i));
        }
    }
}