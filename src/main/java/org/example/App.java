package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        System.out.print( "What is your age? ");
        int age = Integer.parseInt(Obj.nextLine());

        final String msg = age > 16
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";

        System.out.println(msg);

    }
}