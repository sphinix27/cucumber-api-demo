package cucumber.api.demo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
/**
 * APICommonSteps
 */
public class APICommonSteps {

    private String endpoint;
    private Helper helper;
    private String body;

    public APICommonSteps(Helper helper) {
        this.helper = helper;
    }

    @Given("uri enpoint {string}")
    public void endpoint(String endpoint) {
        if (endpoint.contains("[userId]")) {
            endpoint.replace("[userId]", this.helper.getUserId());
        }
        this.endpoint = endpoint;
    }

    @Given("the body is")
    public void setBody(String body) {
        this.body = body;
    }

    @When("a {word} request")
    public void request(String method) {
        if ("GET".equals(method)) {
            this.helper.setResponse(this.helper.getRequests().get(this.endpoint));
        } else if ("POST".equals(method)) {
            this.helper.setResponse(this.helper.getRequests().post(this.endpoint, this.body));
        }
        System.out.println(endpoint);
    }    
}
