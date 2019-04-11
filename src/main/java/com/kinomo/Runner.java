package com.kinomo;

import com.kinomo.config.Client;
import com.kinomo.config.DefaultLocation;
import com.kinomo.config.Params;
import test.CreateClient;
import test.GetToken;
import java.util.ArrayList;

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

            Client newCli = new Client("Нейм", "Легалнеймович", sPermission, sPhone, sEmail, defLoc);

            CreateClient cc = new CreateClient();
            cc.create(newCli);

        System.out.println("Email of " + newCli.getName() + "is " + newCli.getEmail());
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