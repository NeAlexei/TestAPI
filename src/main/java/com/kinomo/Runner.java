package com.kinomo;

import com.jayway.restassured.path.json.JsonPath;
import com.kinomo.config.Client;
import com.kinomo.config.DefaultLocation;
import com.kinomo.config.Params;
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

        Params par = new Params();
        ArrayList<String> sPerm = par.setAllowedPermission();
        ArrayList<String> sPho = par.phone;
        ArrayList<String> sEma = par.email;

        DefaultLocation defLoc = new DefaultLocation(); //
        ArrayList<Double> sCoo = defLoc.setCoordinates();
        String sT = defLoc.setType();

        DefaultLocation dLoc = new DefaultLocation(ArrayList<Double>sCoo, sT);

        Client newClient = new Client("", "", sPerm, sPho, sEma, dLoc);

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