package test;

import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Test02 { //POST - Save CCT ProjectContract

    public void createNewCCTProject() {
            given().log().all()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"scheme\": 0,\n" +
                        "    \"projectName\": \"New_Project01\",\n" +
                        "    \"createdDate\": \"2019-02-05T14:34:46.233215Z\",\n" +
                        "    \"projectPreview\": null,\n" +
                        "    \"scenes\": [\n" +
                        "        {\n" +
                        "            \"position\": 0,\n" +
                        "            \"name\": \"Scene 1\",\n" +
                        "            \"data\": {\n" +
                        "                \"imageActor\": [\n" +
                        "                    {\n" +
                        "                        \"id\": \"blablabla\",\n" +
                        "                        \"animationId\": \"anim_1\",\n" +
                        "                        \"depth\": 0.3,\n" +
                        "                        \"croppingSettings\": null\n" +
                        "                    }\n" +
                        "                ],\n" +
                        "                \"modelActor\": [\n" +
                        "                    {\n" +
                        "                        \"id\": \"5c1bcab2e63f90774e8b88a8\",\n" +
                        "                        \"sourceType\": \"CUSTOM_MODEL\",\n" +
                        "                        \"animationId\": \"anim_1\"\n" +
                        "                    }\n" +
                        "                ],\n" +
                        "                \"templateActor\": [\n" +
                        "                    {\n" +
                        "                        \"id\": \"2312\",\n" +
                        "                        \"sourceId\": \"232\",\n" +
                        "                        \"sourceType\": \"video\"\n" +
                        "                    }\n" +
                        "                ],\n" +
                        "                \"textActor\": [\n" +
                        "                    {\n" +
                        "                        \"message\": \"test1\",\n" +
                        "                        \"animationId\": \"anim_1\",\n" +
                        "                        \"regionId\": \"default\",\n" +
                        "                        \"fontId\": \"noto_sans\",\n" +
                        "                        \"depth\": 0.3,\n" +
                        "                        \"color\": \"#FFFFFF\"\n" +
                        "                    }\n" +
                        "                ],\n" +
                        "                \"priceActor\": [\n" +
                        "                    {\n" +
                        "                        \"message\": \"Some Message\",\n" +
                        "                        \"animationId\": \"AnimId\",\n" +
                        "                        \"colorText\": \"colorText\",\n" +
                        "                        \"colorTag\": \"colorTag\",\n" +
                        "                        \"priceType\": 1\n" +
                        "                    }\n" +
                        "                ]\n" +
                        "            }\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"position\": 1,\n" +
                        "            \"name\": \"Scene 2\",\n" +
                        "            \"data\": {\n" +
                        "                \"imageActor\": [],\n" +
                        "                \"modelActor\": [\n" +
                        "                    {\n" +
                        "                        \"id\": \"5c1bcaa8e63f90774e8b889b\",\n" +
                        "                        \"sourceType\": \"CUSTOM_MODEL\",\n" +
                        "                        \"animationId\": \"anim_2\"\n" +
                        "                    }\n" +
                        "                ],\n" +
                        "                \"templateActor\": [],\n" +
                        "                \"textActor\": [],\n" +
                        "                \"priceActor\": null\n" +
                        "            }\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"position\": 2,\n" +
                        "            \"name\": \"Scene 3\",\n" +
                        "            \"data\": {\n" +
                        "                \"imageActor\": [],\n" +
                        "                \"modelActor\": [\n" +
                        "                    {\n" +
                        "                        \"id\": \"5c1bb97ae63f90cc209390a8\",\n" +
                        "                        \"sourceType\": \"CUSTOM_MODEL\",\n" +
                        "                        \"animationId\": \"anim_3\"\n" +
                        "                    }\n" +
                        "                ],\n" +
                        "                \"templateActor\": [],\n" +
                        "                \"textActor\": [],\n" +
                        "                \"priceActor\": null\n" +
                        "            }\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"mediaSettings\": {\n" +
                        "        \"width\": 880,\n" +
                        "        \"height\": 880\n" +
                        "    },\n" +
                        "    \"softwareVersion\": \"18.0921.0\",\n" +
                        "    \"projectVersion\": 0\n" +
                        "}")
                .post(BASE_URL)
                .then().log().all()
                .statusCode(201)
                .body("projectName", Matchers.equalTo("New_Project01"));

    }
}

