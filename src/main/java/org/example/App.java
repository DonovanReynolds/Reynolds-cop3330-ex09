package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 9 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        final int conversion = 350;
        String lengthText = inputOutput("Enter the length:");
        String widthText = inputOutput("Enter the width: ");

        int length = Integer.parseInt(lengthText);
        int width = Integer.parseInt(widthText);
        int area = length * width;
        double paint = (double)area / conversion;
        int paintToBuy = (int) Math.ceil(paint);

        System.out.println("You will need to purchase " + paintToBuy + " gallons to cover " + area + " square feet.");


    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}
