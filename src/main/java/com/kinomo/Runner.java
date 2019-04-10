package com.kinomo;

import com.jayway.restassured.path.json.JsonPath;
import com.kinomo.config.Client;
import com.kinomo.config.DefaultLocation;
import com.kinomo.config.Params;
import org.json.JSONObject;
import test.CreateClient;
import test.GetToken;


import java.util.ArrayList;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Runner {

    public static void main(String[] args) {

        GetToken getToken = new GetToken();
        SESSION_TOKEN = getToken.token();
        System.out.println("Session token is: " + SESSION_TOKEN);

        Params par = new Params();
        ArrayList<String> sPermission = par.sAllowedPermission();
        ArrayList<String> sPhone = par.sPhone();
        ArrayList<String> sEmail = par.sEmail();

        DefaultLocation defLoc = new DefaultLocation(51.456882, -0.196399, "Point");
        Client newClient = new Client("Name", "LegalName", sPermission, sPhone, sEmail, defLoc);
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