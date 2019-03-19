package com.kinomo;

import test.AuthenticationToken;
import test.Cred;

import static com.jayway.restassured.RestAssured.given;

public class Runner {

    public static void main(String[] args) {

        Cred NewCred = new Cred("a.nechitaylo@hypervsn.com", "4ebbz9w7", Boolean.FALSE );
//        NewCred.setUsername("a.nechitaylo@hypervsn.com");
//        NewCred.setPassword("4ebbz9w7");
//        NewCred.setRememberMe(Boolean.FALSE);

        AuthenticationToken NewAuthToken =
                given()
                    .accept("application/json")
                    .contentType("application/json")
                    .body(NewCred)
                    .expect()
                    .statusCode(200)
                    .when()
                    .post("https://stage-platform.kino-mo.com")
                    .then()
                    .log().all()
                    .extract()
                    .body().as(AuthenticationToken.class);

//        assertNotNull(authenticationToken.getToken());

    }
}
