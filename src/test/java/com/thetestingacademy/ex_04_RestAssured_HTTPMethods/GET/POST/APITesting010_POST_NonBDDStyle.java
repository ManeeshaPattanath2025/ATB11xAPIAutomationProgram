package com.thetestingacademy.ex_04_RestAssured_HTTPMethods.GET.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_POST_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_POST_NONBDDStyle_Create_Token(){
        String payload="{\n"+"   \"username\":\"admin\",\n"+
                "    \"password\" : \"password123\"\n"+
                "}";
        System.out.println("----Part1----");
        //Part1 Precondition-Preparing request
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();
        System.out.println("----Part2----");

        //Making HTTP Request->Part2
        response=r.when().log().all().post();

        System.out.println("---Part3----");
        //Verification Part=>Part3
        vr= response.then().log().all();
        vr.statusCode(200);

    }

}
