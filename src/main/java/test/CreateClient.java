package test;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class CreateClient { //POST - Save CCT ProjectContract

        public void create() {

            ValidatableResponse response =
            given().log().all()
                    .header(KM_AUTH, SESSION_TOKEN)
                    .header("Content-Type", "application/json")
                    .body("{\n" +
                            "  \"name\": \"... ...\",\n" +
                            "  \"legalName\": \"Testlegalname\",\n" +
                            "  \"phone\": [\n" +
                            "    \"0001122\"\n" +
                            "  ],\n" +
                            "  \"email\": [\n" +
                            "    \"...@gmail.com\"\n" +
                            "  ],\n" +
                            "  \"allowedPermissions\": [\n" +
                            "    \"user:user:create:general\",\n" +
                            "    \"user:user:read:general\"\n" +
                            "  ],\n" +
                            "  \"defaultLocation\": {\n" +
                            "    \"type\": \"Point\",\n" +
                            "    \"coordinates\": [\n" +
                            "      51.5073509,\n" +
                            "      -0.12775829999998223\n" +
                            "    ]\n" +
                            "  }\n" +
                            "}")
                    .put(BASE_URL + "/client") //put - create; post - update
                    .then()
                    .log().all();
        }
    }

