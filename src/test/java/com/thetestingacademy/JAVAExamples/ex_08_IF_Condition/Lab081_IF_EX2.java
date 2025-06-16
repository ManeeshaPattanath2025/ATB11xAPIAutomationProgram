package com.thetestingacademy.JAVAExamples.ex_08_IF_Condition;



public class Lab081_IF_EX2 {
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);
        if (age>18)
        {
            System.out.println("You can vote");

        }else{
            System.out.println("You can't");
        }
    }
}
