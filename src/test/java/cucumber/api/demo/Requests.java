package cucumber.api.demo;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

class Requests {

    private static RequestSpecification requestSpecification;

    public Requests(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public Response get(String endpoint) {
        return given().spec(requestSpecification).when().get(endpoint);
    }

    public Response delete(String endpoint) {
        return given().spec(requestSpecification).when().delete(endpoint);
    }

    public Response post(String endpoint, String body) {
        return given().spec(requestSpecification).when()
            .body(body)
            .post(endpoint);
    }
}
