package com.thetestingacademy.JAVAExamples.ex_09_Switch;

public class Task004_CLI_Ops {
    public static void main(String[] args) {
        //CLI option
        //Take a user input-name,age and salary and print them in the end

        //take a user input 2 numbers from the arguments and calculate the maximum

        System.out.println("Enter the name,age and salary");
        String name=args[0];
        int age= Integer.parseInt(args[1]);
        double salary= Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
