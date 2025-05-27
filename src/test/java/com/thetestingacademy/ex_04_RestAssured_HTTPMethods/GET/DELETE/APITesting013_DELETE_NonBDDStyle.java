package com.thetestingacademy.ex_04_RestAssured_HTTPMethods.GET.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting013_DELETE_NonBDDStyle {


    @Test
    public void test_delete_non_bdd() {
        String token = "3e0920c22b5c053";
        String bookingid = "6029";


        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("Token",token);
        requestSpecification.log().all();

        Response response=requestSpecification.when().delete();
        ValidatableResponse validatableResponse=response.then().log().all();
        validatableResponse.statusCode(201);

    }
}
