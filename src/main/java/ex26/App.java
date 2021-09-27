/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Williams
 */

package ex26;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double payment = input.nextDouble();

        PaymentCalculator paymentCalculator1 = new PaymentCalculator();
        double months = paymentCalculator1.calculateMonthsUntilPaidOff(balance, apr, payment);

        System.out.print("It will take you " + months + " months to pay off this card.");
    }
}

class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double apr, double payment){
        double months = 0;
        balance = Math.round(balance * 100) / 100;
        payment = Math.round(payment * 100) / 100;

        if (apr > 1)
            apr = (apr/100)/365;
        else
            apr /= 365;

        months = Math.ceil(-(1/30.0) * Math.log(1 + balance/payment * (1 - Math.pow((1 + apr), 30))) / Math.log(1 + apr));

        return months;
    }
}