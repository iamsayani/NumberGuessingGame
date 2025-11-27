package com.code;

import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int limit = 1;
        int maxtries = 15;
        int number =(int) (Math.random() * 100)+1;
        while (limit <= maxtries){
            int num = sc.nextInt();
            if (num == number) {
                System.out.println("You got the number!! ");
                break;
            }

            if (num <= 0) {
                System.out.println("Invalid input.");
            }
            else if (num > number) {
                System.out.println("Wrong guess. Your guessed number is higher.");
            }
            else {
                System.out.println("Wrong guess. Your guessed number is lower.");
            }

            // After processing the guess, increment tries
            limit++;

            // If tries are over, show result
            if (limit > maxtries) {
                System.out.println("Sorry, Your chances of playing completed");
                System.out.println("The actual number was: " + number);
                break;
            }

            System.out.println("You have " + (maxtries - limit + 1) + " tries left");
        }
    }
}
