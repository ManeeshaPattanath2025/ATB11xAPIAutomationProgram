package com.thetestingacademy.ex_05_TestngExamples;

import org.testng.annotations.*;

public class APITesting023_ALL_Annotations {
    @BeforeSuite
    void demo1(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    void demo2(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    void demo3(){
        System.out.println("Before class");
    }
    @BeforeMethod
    void demo4(){
        System.out.println("Before Method");
    }
    @Test
    void demo5(){
        System.out.println("Test");
    }
    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }
    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
    }


}
