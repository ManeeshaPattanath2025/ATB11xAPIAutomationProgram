package com.thetestingacademy.JAVAExamples.ex_07_Increment_Decrement_OP;

public class Task004 {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        // Parse the arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Use ternary operator to find the maximum
        int max = (num1 > num2) ? num1 : num2;

        // Print the result
        System.out.println("Maximum number is: " + max);
    }
}
