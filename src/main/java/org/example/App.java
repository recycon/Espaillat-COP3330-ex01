package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println( "What is your name?" );
        String msg=scanner.nextLine();
        System.out.println( "Hello,"+ msg+", nice to meet you!" );
    }
}
