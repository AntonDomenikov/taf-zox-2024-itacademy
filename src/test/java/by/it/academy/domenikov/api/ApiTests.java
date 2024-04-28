package by.it.academy.domenikov.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class ApiTests {
    @Test
    @DisplayName("Api 1: login with non-existent account")
    public void testLogin1() {
        given().
                contentType("multipart/form-data").
                multiPart("email", "testetst@yte.com").
                multiPart("password","yuyqwhjhsd").
                when().
                post("https://zox.la/account/login?_data=routes%2F%28%24locale%29.account.login").
                then().
                statusCode(400);

    }
}