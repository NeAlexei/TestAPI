package test;
import com.jayway.restassured.RestAssured;
import org.apache.http.entity.ContentType;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class Test01 {

    public String getAllTheLatestCCTProjects() {
        return given()
                .log().all()
                .header(KM_AUTH, SESSION_TOKEN)
                .header("Content-Type", "application/json")
                .when()
                .get(BASE_URL)
                .then()
                .assertThat()
                .log().all()
                .statusCode(200)
                .extract().body().toString();
    }
}
