package test;
import ch.qos.logback.core.net.server.Client;
import com.kinomo.config.DefaultLocation;
import

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.given;
import static com.kinomo.config.Settings.*;

public class CreateClient { //POST - Save CCT ProjectContract

        public Client create(Client client) {

            ValidatableResponse response =
            given().log().all()
                    .header(KM_AUTH, SESSION_TOKEN)
                    .header("Content-Type", "application/json")
                    .body(client)
                    .put(BASE_URL + "/client") //put - create; post - update
                    .then()
                    .log().all();

            return response.extract().body().jsonPath().getObject("message", Client.class);

        }
    }

