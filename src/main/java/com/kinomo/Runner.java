package com.kinomo;

import com.jayway.restassured.path.json.JsonPath;
import org.json.JSONObject;
import test.CreateClient;
import test.GetToken;


import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Runner {

    public static void main(String[] args) {

//                JSONObject jsonObj = new JSONObject()
//                        .put("username", EMAIL)
//                        .put("password", PASSWORD)
//                        .put("rememberMe", false);
//               JsonPath jsonPath =
//                         given()
//                            .contentType("application/json") //another way to specify content type
//                            .body(jsonObj.toString()) // use jsonObj toString method
//                            .when()
//                            .put("https://stage-platform.kino-mo.com/api/user/0/session")
//                            .jsonPath();
//                String a = jsonPath.getString("message.sessionToken");
//                System.out.println(a);
//            }
//}
        GetToken getToken = new GetToken();
        System.out.println(getToken.token());
        SESSION_TOKEN = getToken.token();
        System.out.println(SESSION_TOKEN);

        CreateClient cc = new CreateClient();
        cc.create();


//
//                CreateClient createClient = new CreateClient();
////                createClient.create();
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