package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequests {

    @Test
    public void getAllUsers() {
        RestAssured.baseURI = "http://localhost:5001";

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users/all")
                .then()
                .extract().response();

        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void countUsernamesThatContainsNumberThree() {
        RestAssured.baseURI = "http://localhost:5001";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users/all")
                .then()
                .extract().response();

        JSONArray usersList = new JSONArray(response.asString());

        int contador = 0;

        for (int i = 0; i < usersList.length(); i++) {
            JSONObject jsonObject = usersList.getJSONObject(i);
            String username = jsonObject.getString("username");
            if (username.contains("3")) contador++;
        }

        System.out.println("El numero de usuarios que contienen el numero 3 es: " + contador);

    }

    @Test(description = "POKE API")
    public void getPokemonByName() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2";

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("pokemon/mew")
                .then()
                .extract().response();

        System.out.println(response.getBody().prettyPrint());
    }

}
