package com.thetestingacademy.JAVAExamples.ex_07_Increment_Decrement_OP;

public class Lab70_In_De_Op {
    public static void main(String[] args) {
        //pre-increment ++operand
        //value is incremented first and then stored in the result
        int a=10;
        int b=++a;
        System.out.println(b);//11
        System.out.println(a);//11

        //Exp amd result table
        //Line No/a/Result b
        //7/10/NA
        //8/11/11
        //9/11(na)/11
        //10/11/11(na)
    }
}
