package test;
import com.jayway.restassured.RestAssured;
import org.apache.http.entity.ContentType;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Test01 { //GET - Get all the latest CCT Project versions

    public void getAllTheLatestCCTVersions() {
        given()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .log().all();
    }

//                .log().all()
//                .header(KM_AUTH, SESSION_TOKEN)
//                .header("Content-Type", "application/json")
//                .when()
//                .get(BASE_URL)
//                .then()
//                .assertThat()
//                .log().all()
//                .statusCode(200)
//                .extract().body().toString();

    }


