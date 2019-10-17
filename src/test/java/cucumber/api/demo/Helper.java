package cucumber.api.demo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Helper
 */
public class Helper {

    RequestSpecification requestSpec = new RequestSpecBuilder()
    .setBaseUri("https://gorest.co.in/")
    .addHeader("Authorization", "Bearer K6jGQqdZQ-a0uSqjsl6usm3pZMq9Pw9slUxQ")
    .build();
    private Requests requests = new Requests(requestSpec);
    private Response response;
    private String userId;

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
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;        
    }

}
