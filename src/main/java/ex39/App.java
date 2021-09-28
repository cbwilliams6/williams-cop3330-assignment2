/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class App { // im a bit confused on this map stuff and im out of time to finish the last 2 exercises
    public static void main( String[] args ){
        List<Employees> employee = new ArrayList<Employees>();

        employee.add(new Employees("John", "Johnson", "Manager", "2016-12-31"));
        employee.add(new Employees("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employee.add(new Employees("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employee.add(new Employees("Jake", "Jacobson", "Programmer", ""));
        employee.add(new Employees("Jacquelyn", "Jackson", "DBA", ""));
        employee.add(new Employees("Sally", "Webber", "Web Developer", "2015-12-18"));
    }
}

class Employees {
    private String firstName;
    private String lastName;
    private String position;
    private String date;

    public Employees(String firstName, String lastName, String position, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPosition() {
        return position;
    }
    public String getDate() {
        return date;
    }
}