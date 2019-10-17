package cucumber.api.demo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Helper
 */
public class Helper {

    private Response response;
    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://gorest.co.in/")
            .addHeader("Authorization", "Bearer PUT_YOUR_TOKEN_HERE")
            .build();
    private Requests requests = new Requests(requestSpec);

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Requests getRequests() {
        return requests;
    }

    public void setRequests(Requests requests) {
        this.requests = requests;
    }
}
