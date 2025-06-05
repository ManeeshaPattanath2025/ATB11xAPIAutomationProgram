package com.thetestingacademy.ex_05_TestngExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_TestNG_AlwayRun {
    @Test
    public void test_Register(){
        Assert.assertTrue(true);
    }
    @Test(alwaysRun = true)
    public void test_loginPage()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal(){
        Assert.assertTrue(true);
    }
}
