package test;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;
import static org.hamcrest.Matchers.equalTo;

public class Test03 {

    public void findProjectById(){

        given()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")
                .get(BASE_URL + "/...")
                .then()
                .statusCode(200)
                .log().all();

    }
}
