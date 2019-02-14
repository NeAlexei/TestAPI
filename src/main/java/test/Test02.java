package test;

import static com.jayway.restassured.RestAssured.given;

public class Test02 {

    public String getAllPeople(){
        return given()
                .when()
                    .get("https://swapi.co/api/people/1")
                .then()
                    .assertThat()
                    .statusCode(200)
                .and()
                .extract().body().asString();
    }
}
