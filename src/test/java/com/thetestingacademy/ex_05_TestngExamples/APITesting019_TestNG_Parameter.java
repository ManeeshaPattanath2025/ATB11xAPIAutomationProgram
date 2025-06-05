package com.thetestingacademy.ex_05_TestngExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting019_TestNG_Parameter {
    @Parameters("browser")
    @Test
    public void demo1(String value) {
        System.out.println("Hi I am demo");
        System.out.println("You are running this parameter");


        if (value.equalsIgnoreCase("Firefox")) {
            System.out.println("Start the firefox");
        }

        if (value.equalsIgnoreCase("Chrome")) {
            System.out.println("Start the chrome");
        }
    }
}
