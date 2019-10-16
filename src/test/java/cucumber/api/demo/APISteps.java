package cucumber.api.demo;

import io.cucumber.java8.En;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
// import static org.junit.Assert.assertThat;

/**
 * APISteps
 */
public class APISteps implements En {

    private RequestSpecification requestSpec;
    private Response response;
    private String endpoint;
    private Requests requests;

    public APISteps() {
        requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://gorest.co.in/")
            .addHeader("Authorization", "Bearer PUT_YOUR_TOKEN_HERE")
            .build();
        requests = new Requests(requestSpec);
        Given("enpoint {string}", (String endpoint) -> {
            this.endpoint = endpoint;
        });

        When("request {word}", (String method) -> {
            if ("GET".equals(method)) {
                this.response = requests.get(this.endpoint);
            } else {
                this.response = requests.delete(this.endpoint);
            }
        });

        Then("response status code is {int}", (Integer statusCode) -> {
            assertThat(this.response.getStatusCode()).isEqualTo(statusCode);
        });
    }

    class Requests {

        private RequestSpecification requestSpecification;

        public Requests(RequestSpecification requestSpecification) {
            this.requestSpecification = requestSpecification;
        }

        public Response get(String endpoint){
            return given()
                        .spec(requestSpecification)
                    .when()
                        .get(endpoint);
        }

        public Response delete(String endpoint){
            return given()
                        .spec(requestSpecification)
                    .when()
                        .delete(endpoint);
        }
    }
}
