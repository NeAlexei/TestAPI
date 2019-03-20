package com.kinomo;

import test.*;

import static com.jayway.restassured.RestAssured.given;

public class Runner {

    public static void main(String[] args) {

//        Test01 getAllTheLatestCCT = new Test01();
//        getAllTheLatestCCT.getAllTheLatestCCTVersions();
//
//        Test02 createProject = new Test02();
//        createProject.createNewCCTProject();

//        Test03 findProject = new Test03();
//        findProject.findProjectById();

//        Test04 getToken = new Test04();
//        getToken.getSessionToken();

        Cred NewCred = new Cred();
        NewCred.setUsername("");
        NewCred.setPassword("");
        NewCred.getRememberMe(Boolean);

        Auth NewAuth =
                given()
                .



    }
}
