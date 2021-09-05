package Exercise01;

import java.util.Scanner;

public class Solution01 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 program 1 solution
     *  Copyright 2021 Jonathan Robbins
     */

    /*
    Scanner set up
    new scanner(System.in)
    println(Enter the name) user input name
    string userName, myObj.next()
    Enter name
    print string with + userName (System.out.println)
     */

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String userName = myObj.next();
        System.out.println("Your name is: " + userName);

    }
}
