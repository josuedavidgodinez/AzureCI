package restassured.postrequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequests {

    @Test(dataProvider = "users-excel", dataProviderClass = BodyGenerationDataProvider.class)
    public void createUsersReadingExcel(JSONObject userPayload) {
        RestAssured.baseURI = "http://localhost:5001";

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(userPayload.toString())
                .post("/users/add")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();
    }

    @Test(dataProvider = "users-excel", dataProviderClass = BodyGenerationDataProvider.class)
    public void createUsers(JSONObject userPayload) {
        RestAssured.baseURI = "http://localhost:5001";

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(userPayload.toString())
                .post("/users/add")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();

    }

}
