package com.thetestingacademy.ex_04_RestAssured_HTTPMethods.GET.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_PATCH_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_patch_non_bdd() {
        String token = "3e0920c22b5c053";
        String bookingid = "6029";
        String payloadPatch="{\n" +
                "    \"firstname\" : \"Jame\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("Token",token);
        r.body(payloadPatch).log().all();

        response=r.when().log().all().patch();
        vr=response.then().log().all();
        vr.statusCode(200);

    }
}
