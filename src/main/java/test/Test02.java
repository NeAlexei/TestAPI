package test;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Test02 { //POST - Save CCT ProjectContract

    public void createNewCCTProject() {
            given()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .log().all();
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
