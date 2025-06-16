package com.thetestingacademy.JAVAExamples.ex_07_Increment_Decrement_OP;
import java.util.Scanner;
public class Task003 {


        public static void main(String[] args) {
            // Create Scanner object to take input
            Scanner scanner = new Scanner(System.in);

            // Prompt and read name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Prompt and read age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Prompt and read salary
            System.out.print("Enter your salary: ");
            double salary = scanner.nextDouble();

            // Close the scanner
            scanner.close();

            // Display the collected information
            System.out.println("\nUser Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
