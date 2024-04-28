package by.it.academy.domenikov.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTests {

    @Test
    public void testLogin1() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"login\": \"moksemnovikov@gmail.com\"}")
                .when()
                .post("api.litres.ru/foundation/api/auth/login-available")
                .then()
                .statusCode(200)
                .body("status", equalTo(200));
    }

    @Test
    public void testLogin2() {
        given().header("content-type", "application/json").body("{\"login\":\"test@test.ru\"}").when().
                post("api.litres.ru/foundation/api/auth/login-available").then().
                statusCode(200).body("status", equalTo(200)).and().
                body("payload.data.available", equalTo(false)).
                body("error", equalTo(null));
    }
}