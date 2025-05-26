package com.thetestingacademy.ex_01_RA_basics;

import io.restassured.RestAssured;

public class APITestingLab01_RA {
    public static void main(String[] args) {
        RestAssured.given()
                    .baseUri("https://restful-booker.herokuapp.com/ping")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(201);
    }
}
