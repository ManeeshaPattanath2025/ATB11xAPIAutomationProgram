package com.thetestingacademy.JAVAExamples.ex_07_Increment_Decrement_OP;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        //A=a++  expA->10,a->11
        //+
        //B=++a expB->12 a->12
        //A+b->EXPa+EXPb=10+12=22

    }
}
