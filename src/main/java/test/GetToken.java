package test;
import com.

import com.jayway.restassured.path.json.JsonPath;
import org.json.JSONObject;
import com.

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.put;
import static com.kinomo.config.Settings.*;
import static javafx.scene.input.KeyCode.J;

public class GetToken {
    public String token() {

        JSONObject jsonObj = new JSONObject()
                .put("username", EMAIL)
                .put("password", PASSWORD)
                .put("rememberMe", false);



        JsonObject jsonObject = new JsonObject();
        JsonPath jsonPath =
                given()
                        .contentType("application/json") //another way to specify content type
                        .body(jsonObj) // use jsonObj toString method
                        .put(BASE_URL + "/session")
                        .jsonPath();
        String a = jsonPath.getString("message.sessionToken");
        return a;

    }
}
