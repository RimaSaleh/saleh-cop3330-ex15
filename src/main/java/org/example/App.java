/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for password to be inputted
        System.out.println( "What is the password?" );
        String password = scanner.nextLine();

        //if statement for password to check if it is correct or not (else)
        if (password.equals("abc$123"))  {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you");
        }
        }
    }
