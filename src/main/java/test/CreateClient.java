package test;

import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class CreateClient { //POST - Save CCT ProjectContract

        public void create() {

            given().log().all()
                    .header(KM_AUTH, SESSION_TOKEN)
                    .header("Content-Type", "application/json")
                    .body("{\"name\":\"TestClient\",\n" +
                            "\"legalName\":\"\",\n" +
                            "\"phone\":[\"000-00-00\"],\n" +
                            "\"email\":[\"Emilo@gmail.com\"],\n" +
                            "\"allowedPermissions\":[\"user:user:create:general\",\"user:user:read:general\"],\"defaultLocation\":{\"type\":\"Point\",\"coordinates\":[51.5073509,-0.12775829999998223]}}")
                    .put(BASE_URL + "/client") //put - create; post - update
                    .then().log().all()
//                    .statusCode(201)
                    .body("name", Matchers.equalTo("TestClient"));
        }
    }

