package com.thetestingacademy.ex_05_TestngExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015_BeforeTest {
    @BeforeTest
    public void getToken(){
        System.out.println("Before Get Token");
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("Before Get booking");
    }
    @Test
    public void test_PUT(){
        System.out.println("Put request" );
    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("Close" );
    }
}
