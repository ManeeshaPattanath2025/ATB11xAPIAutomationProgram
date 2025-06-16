package com.thetestingacademy.JAVAExamples.ex_07_Increment_Decrement_OP;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a);
        System.out.println(a);

        //Post increment=print first and then increase
        int a_post=10;
        System.out.println(a_post++);//10,a=11
        System.out.println(a_post);
    }
}
