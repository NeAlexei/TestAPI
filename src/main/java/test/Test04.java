package test;
import org.hamcrest.Matchers;
import static com.kinomo.config.Settings.*;
import static com.jayway.restassured.RestAssured.given;

public class Test04 {
    public void getSessionToken() {
        given()
//                .log().all()
                .accept("application/json")
                .contentType("application/json")

//              .body("")
                .put("https://stage.kino-mo.com/api/user/0/session")
                .then().log().all()
                .statusCode(200)
                .log().all();

//                .body("projectName",Matchers.equalTo(""));
    }
}