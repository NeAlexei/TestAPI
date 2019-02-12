package test;
import com.jayway.restassured.RestAssured;
import org.apache.http.entity.ContentType;

import static com.jayway.restassured.RestAssured.given;

public class Test01 {

    public String getAllTheLatestCCTProjects() {
        return given()
                .log().all()
                .header("km-auth", "cd74cc155b1ba732eab768f6d07a2551a6149f1a18a98c18268c4c240d52c46a5bd6f9779701d962b6808780")
                .header("Content-Type", "application/json")
                .when()
                .get("https://stage-platform.kino-mo.com" + "/api/v1/cct-projects")
                .then()
                .assertThat()
                .log().all()
                .statusCode(200)
                .extract().body().toString();
    }
}
