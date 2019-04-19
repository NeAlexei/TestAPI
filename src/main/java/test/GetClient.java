package test;
import com.jayway.restassured.response.ValidatableResponse;
import com.kinomo.config.Client;
import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class GetClient {

        public Client getClient(String ClientId) {

            ValidatableResponse response =
            given().log().all()
                    .header(KM_AUTH, SESSION_TOKEN)
                    .header("Content-Type", "application/json")
                    .get(BASE_URL + "/client")
                    .then()
                    .log().all();

            return response.extract().jsonPath().getObject("message", Client.class);

        }
}

