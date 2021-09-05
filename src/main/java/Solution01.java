/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

/*
 prompt the user for their name
 receive input from user (keyboard)
 store users name as a string
 insert string into predetermined greeting message
 display greeting message to user

 import scanner
 create new scanner using system.in (keyboard)
 print statement to ask the user for name
 use nextLine to get the user input from keyboard
 store input in name variable
 final print statement using name variable inserted in message
 */

import java.util.Scanner; //imports scanner

public class Solution01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name +", nice to meet you!");

    }
}

