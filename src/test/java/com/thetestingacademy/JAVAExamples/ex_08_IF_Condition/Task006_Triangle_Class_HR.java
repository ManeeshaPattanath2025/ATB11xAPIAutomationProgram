package com.thetestingacademy.JAVAExamples.ex_08_IF_Condition;

import java.util.Scanner;

public class Task006_Triangle_Class_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the three sides
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();

        scanner.close();

        // Check if sides can form a triangle using triangle inequality
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
