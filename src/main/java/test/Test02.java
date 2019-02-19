package test;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.KM_AUTH;
import static com.kinomo.config.Settings.SESSION_TOKEN;

public class Test02 { //POST - create new 3D model

    public String getAllPeople(){
        return given()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")





                .when()
                    .get("https://swapi.co/api/people/1")
                .then()
                    .assertThat()
                    .statusCode(200)
                .and()
                .extract().body().asString();
    }
}
