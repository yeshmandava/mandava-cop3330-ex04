package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  *  Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb = input.next();
        System.out.print("Enter an adjective: ");
        String adjective = input.next();
        System.out.print("Enter an adverb: ");
        String adverb = input.next();

        System.out.print("Your "  +noun+ " looks like it would " +verb + " extremely " +adverb+ ", because it has " +adjective+ " legs.");

    }
}
