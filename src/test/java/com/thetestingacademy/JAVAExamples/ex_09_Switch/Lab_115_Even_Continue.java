package com.thetestingacademy.JAVAExamples.ex_09_Switch;

public class Lab_115_Even_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {//0 to 50 ,51 times
            if (i % 2 != 0) {
                //System.out.println("Even->" + i);
                continue;
            }
            System.out.println("Even->" + i);
        }
    }
}

