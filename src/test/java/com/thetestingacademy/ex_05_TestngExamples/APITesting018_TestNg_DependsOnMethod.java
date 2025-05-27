package com.thetestingacademy.ex_05_TestngExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNg_DependsOnMethod {
    @Test
    public void serverStartedOK(){
        System.out.println("I will run first");
        Assert.assertTrue(true);

    }
    @Test(dependsOnMethods = "serverStartedOK")
    public void test1(){
        System.out.println("method1");
        Assert.assertTrue(true);

    }
    @Test(dependsOnMethods = "serverStartedOK")
    public void test2(){
        System.out.println("method2");
        Assert.assertTrue(true);

    }
}
