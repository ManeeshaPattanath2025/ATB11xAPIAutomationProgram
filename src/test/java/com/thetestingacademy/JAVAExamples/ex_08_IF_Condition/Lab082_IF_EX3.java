package com.thetestingacademy.JAVAExamples.ex_08_IF_Condition;

import java.util.Scanner;

public class Lab082_IF_EX3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age!");
        int age=scanner.nextInt();
        System.out.println(age);

        if (age>18){
            System.out.println("Allowed to vote!");

        }else {
            System.out.println("Not Allowed!");

        }

    }
}
