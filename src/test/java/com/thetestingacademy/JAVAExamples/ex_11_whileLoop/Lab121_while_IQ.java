package com.thetestingacademy.JAVAExamples.ex_11_whileLoop;

import java.util.Scanner;

public class Lab121_while_IQ {
    public static void main(String[] args) {
        //Factorial program
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Factorial number");
        int number=scanner.nextInt();

        int factorial=1;
                if (number<=0)
                {
                    System.out.println(factorial);
                }
                else {
                    for(int i=1;i<=number;i++)
                    {
                        factorial=factorial*i;
                    }
                }
        System.out.println("Factorial is"+factorial);
    }
}

