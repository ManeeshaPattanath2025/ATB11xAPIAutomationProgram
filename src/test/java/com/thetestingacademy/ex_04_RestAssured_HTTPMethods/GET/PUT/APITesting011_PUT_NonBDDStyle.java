package com.thetestingacademy.ex_04_RestAssured_HTTPMethods.GET.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_PUT_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    public void test_put_non_bdd() {
        String token = "3e0920c22b5c053";
        String bookingid = "6029";
        String payloadPUT = "{\n" +
                "  \"firstname\" : \"test\",\n" +
                "  \"lastname\" : \"testing\",\n" +
                "  \"totalprice\" : 111,\n" +
                "  \"depositpaid\" : false,\n" +
                "  \"bookingdates\" : {\n" +
                "  \"Checkin\" :\"2024-01-01\", \n" +
                "  \"Checkout\" :\"2024-01-01\", \n" +
                "  }, \n" +
                "  \"Additionalneeds\" :\"Lunch\", \n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("Token",token);
        r.body(payloadPUT).log().all();

        response=r.when().log().all().put();
        vr=response.then().log().all();
        vr.statusCode(200);

    }
}
