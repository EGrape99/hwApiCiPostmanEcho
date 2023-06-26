import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postmanEchoTest {

    @Test
    void shouldPostRequestsId() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Id")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("ID"))
        ;
    }

    @Test
    void shouldPostRequestsName() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("name")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("name"))

        ;
    }

    @Test
    void shouldPostRequestsNumber() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("number")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("number"))

        ;
    }
}
