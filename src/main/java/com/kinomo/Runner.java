package com.kinomo;

import com.jayway.restassured.path.json.JsonPath;
import org.json.JSONObject;
import test.CreateClient;
import test.GetToken;


import java.util.ArrayList;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Runner {

    public static void main(String[] args) {

        GetToken getToken = new GetToken();
        SESSION_TOKEN = getToken.token();
        System.out.println("Session token is: " + SESSION_TOKEN);

        CreateClient cc = new CreateClient();
        cc.create();

        ArrayList<String> set
    }
}















//        Cred NewCred = new Cred();
//        NewCred.setUsername("a.nechitaylo@hypervsn.com");
//        NewCred.setPassword("4ebbz9w7");
//        NewCred.setRememberMe(Boolean.FALSE);
//
//        AuthenticationToken NewAuthToken =
//                given()
//                    .accept("application/json")
//                    .contentType("application/json")
//
//                        .body(NewCred)
//
//                    .expect()
//                    .statusCode(200)
//                    .when()
//                    .post("https://stage-platform.kino-mo.com")
//                    .then()
//                    .log().all()
//                    .extract()
//                    .body().as(NewAuthToken.class);

//        assertNotNull(NewAuthToken.getToken());