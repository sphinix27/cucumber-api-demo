package cucumber.api.demo;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/**
 * APICommonSteps
 */
public class APICommonSteps {

    // private Requests requests;
    // private Response response;
    private String endpoint;
    private Helper helper;

    public APICommonSteps(Helper helper) {
        this.helper = helper;
        // RequestSpecification requestSpec = new RequestSpecBuilder()
        //     .setBaseUri("https://gorest.co.in/")
        //     .addHeader("Authorization", "Bearer PUT_YOUR_TOKEN_HERE")
        //     .build();
        // this.requests = new Requests(requestSpec);
    }

    @Given("uri enpoint {string}")
    public void endpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @When("a {word} request")
    public void request(String method) {
        if ("GET".equals(method)) {
                this.helper.setResponse(this.helper.getRequests().get(this.endpoint));
                // this.response = requests.get(this.endpoint);
            } else {
                this.helper.setResponse(this.helper.getRequests().delete(this.endpoint));
                // this.response = requests.delete(this.endpoint);
            }
    }

    @Then("status code is {int}")
    public void statusCode(Integer statusCode) {
        assertThat(this.helper.getResponse().getStatusCode()).isEqualTo(statusCode);
    }
}
