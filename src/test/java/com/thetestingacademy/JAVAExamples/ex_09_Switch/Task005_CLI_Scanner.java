package com.thetestingacademy.JAVAExamples.ex_09_Switch;

import java.util.Scanner;

public class Task005_CLI_Scanner {
    public static void main(String[] args) {
        //Scanner Class

        //Take a user input-Name,age and Salary and print them in the end
        //Take a user input 2 numbers from the arguments and calculate the maximum
        Scanner scanner=new Scanner(System.in);

        //Prompt the user for their name
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();

     System.out.println("Enter your age: ");
      int age= scanner.nextInt();

        System.out.println("Enter your salary: ");
        double salary= scanner.nextDouble();

    //Print the collected information
        System.out.println("\n---User Information--");
        System.out.println("Name:"+name);
        System.out.println("Age"+age);
        System.out.println("Salary"+salary);

        scanner.close();

}}
