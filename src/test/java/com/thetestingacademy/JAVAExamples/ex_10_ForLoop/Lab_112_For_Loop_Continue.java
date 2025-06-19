package com.thetestingacademy.JAVAExamples.ex_10_ForLoop;

public class Lab_112_For_Loop_Continue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){//0 to 49 ,50 times
            if(i==5){
                continue;//Skip below code and move to for loop
            }
            System.out.println(i);

        }
    }
}
