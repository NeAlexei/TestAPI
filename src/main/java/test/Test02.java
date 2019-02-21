package test;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class Test02 { //POST - Save CCT ProjectContract

    public void createNewCCTProject() {
            given().log().all()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")
                .body(NewProjectJson)
                .when()
                .post(BASE_URL)
                .then().log().all()
                .statusCode(201)
                .body("projectName", equalTo("01NewProject"));
    }

//                    .get("https://swapi.co/api/people/1")
//                .then()
//                    .assertThat()
//                    .statusCode(200)
//                .and()
//                .extract().body().asString();

    }

    /* Create new CCT Project:
     * 1.Запилить JSON
     * 2.Прочитать JSON
     * 3. */
