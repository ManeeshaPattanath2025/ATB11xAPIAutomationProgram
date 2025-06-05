package com.thetestingacademy.ex_06_TestAssertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting026_RestAssured_Assertions {
    @Test(enabled = false)
    public void test_hardAssertExample(){
        System.out.println("Start of the program");
        Boolean is_neeru_male=false;
        Assert.assertEquals("maneesha","Maneesha");
        System.out.println("End of the program");

    }
    @Test
    public void test_SoftAssertExample(){
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("maneesha","Maneesha");
        System.out.println("End of the program");
    }


}
